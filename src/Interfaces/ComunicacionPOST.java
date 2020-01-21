/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author noelia,jorge,ivan
 */
class ComunicacionPOST {
    private String dir="";
    private HttpURLConnection con=null;
    private URL url;
    private BufferedReader in;
    private Map<String, Object> params;
    private StringBuilder postData;
    private byte[] postDataBytes;
    public ComunicacionPOST(){              
    }
      public  void datos()  {
       
        try {
            params = new LinkedHashMap<>();
            params.put("categoria", NuevaPregunta.categoria);
            params.put("pregunta", NuevaPregunta.descripcionPregunta);
            //leer el input token que se envia
           // params.put("_token",);
            
            postData = new StringBuilder();
            for (Map.Entry<String, Object> param : params.entrySet()) {
                if (postData.length() != 0)
                    postData.append('&');
                postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
                postData.append('=');
                postData.append(URLEncoder.encode(String.valueOf(param.getValue()),
                        "UTF-8"));
            }
            postDataBytes = postData.toString().getBytes("UTF-8");
            
         
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(ComunicacionPOST.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void pedir(String peticion){
        try {
            url = new URL(dir+peticion);
            con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
            con.setRequestProperty("Content-Length", String.valueOf(postDataBytes.length));
            con.setDoOutput(true);
            con.getOutputStream().write(postDataBytes);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ComunicacionPOST.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ProtocolException ex) {
            Logger.getLogger(ComunicacionPOST.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ComunicacionPOST.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String leerDatos(){                
        String inputLine;
        StringBuffer content=null;
        try {
            in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }

            in.close();
            con.disconnect();
        } catch (IOException ex) {
            Logger.getLogger(ComunicacionPOST.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new String (content);
    }
}

