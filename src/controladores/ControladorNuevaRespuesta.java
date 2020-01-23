/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import Interfaces.Vista_Nueva_Respuesta;
import Interfaces.Vista_administrador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Noelia Zarzoso
 */
public class ControladorNuevaRespuesta implements ActionListener{
    private Vista_Nueva_Respuesta vista;
    
    public ControladorNuevaRespuesta(Vista_Nueva_Respuesta vista) {
        this.vista=vista;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent ae) {
      switch(ae.getActionCommand()){
          case "GUARDAR":
         
        {
            try {
                anadirRespuestas();
            } catch (IOException ex) {
                Logger.getLogger(ControladorNuevaRespuesta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

		vista.setVisible(false);

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {

				new Vista_administrador().setVisible(true);
			}
		});
       
              break;
          case "CERRAR":
                vista.setVisible(false);

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {

				new Vista_administrador().setVisible(true);
			}
		});
              break;
              
      }
    }
    
    /**
	 * metodo añadir ubicacion que coge los valores introducidos y manda peticion al servidor para comprobar si existe y si no existe lo crea
	 */
	public void anadirRespuestas() throws UnsupportedEncodingException, IOException {

		int idPregunta=vista.getIdPregunta();
                String respuestaCorrecta=vista.getRespuestaCorrecta();
                String respuestaIncorrecta2=vista.getRespuestIncorrecta2();
                String respuestaIncorrecta3=vista.getRespuestaIncorrecta3();
                String respuestaIncorrecta4=vista.getRespuestaIncorrecta4();
		String resp1=parsearPreguntaSalidaABD(respuestaCorrecta);
                String resp2=parsearPreguntaSalidaABD(respuestaIncorrecta2);
                String resp3=parsearPreguntaSalidaABD(respuestaIncorrecta3);
                String resp4=parsearPreguntaSalidaABD(respuestaIncorrecta4);
                //registrar la respuesta correcta
                URL url;
		try {
			// Creando un objeto URL
			url = new URL("http://localhost/servidor/public/respuesta/anadirRespuesta/" +idPregunta+"/"+resp1);
                        //+ "/" + respuestaIncorrecta2 + "/"+respuestaIncorrecta3 + "/" + respuestaIncorrecta4 + "/");
			// Realizando la petición GET
			URLConnection con = url.openConnection();

			// Leyendo el resultado
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

			String linea;
			linea = in.readLine();
			System.out.println(linea);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
                //registrar las incorrectas
                
                URL url2;
		try {
			// Creando un objeto URL
			url2 = new URL("http://localhost/servidor/public/respuesta/anadirRespuestas/" +idPregunta+"/" + resp2 + "/"+resp3 + "/" + resp4);
			// Realizando la petición GET
			URLConnection con2 = url2.openConnection();

			// Leyendo el resultado
			BufferedReader in = new BufferedReader(new InputStreamReader(con2.getInputStream()));

			String linea2;
			linea2 = in.readLine();
			System.out.println(linea2);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	
	}

	/**
	 * @param args the command line arguments
	 * el main que inicia esta vista 
	 */
	public static void main(String args[]) {

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Vista_Nueva_Respuesta().setVisible(true);
			}
		});
	}
        
        /**
         * Método para reemplazar los espacios en las respuestas por %20 para poder registrar por medio de POST.
         * @param respuesta
         * @return 
         */
         private String parsearPreguntaSalidaABD(String respuesta) {
            String resp=respuesta.replace(" ", "%20");
            return resp;
        }
    
  
}
