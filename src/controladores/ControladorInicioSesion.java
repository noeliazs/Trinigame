/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import Interfaces.Vista_administrador;
import Interfaces.Vista_carga;
import Interfaces.Vista_inicio_sesion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Noelia Zarzoso
 */
public class ControladorInicioSesion implements ActionListener{
    private Vista_inicio_sesion vista;
    private String valorNombre;

    public ControladorInicioSesion(Vista_inicio_sesion vista) {
        this.vista=vista;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
      switch(ae.getActionCommand()){
          case "ENTRAR":
              comprobarIngreso();
              break;
          case "SALIR":
              System.exit(0);
              break;
      }
    }
    
    
    
	/**
	 * Este método es el que se llama desde el boton entrar y pregunta al servidor si estan esos datos guardados en la BD el servidor 
	 * devuelve un Json con los datos si estan en la BD, de esos datos comprobamos si el usuario es admin o usuario normal 
	 * en caso de admin va a vista administrador en caso de ser usuario normal pasa a la vista de seleccionar ubicacion
	 * en caso de no estar registrado muestra mensaje de usuario no registrado 
	 */
	public void comprobarIngreso() {
		String usuario=vista.getNombre();
                String password=vista.getPassword();
		URL url;
		try {
			// Creando un objeto URL
			url = new URL("http://localhost/servidor/public/usuario/" + usuario + "/" + password + "/");  

			// Realizando la petición GET
			URLConnection con = url.openConnection();

			// Leyendo el resultado
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

			String linea;
			linea = in.readLine();
			System.out.println(linea);

			JSONParser parser = new JSONParser();
			Object obj = parser.parse(linea);
                        
			JSONArray json = (JSONArray) obj;
			noRegistrado();
			JSONObject object = (JSONObject) json.get(0);
			valorNombre = object.get("nombre").toString();
			
			
			
			 if(valorNombre.equals("admin")) {
				System.out.println("ENTRAMOS ADMINISTRADOR");
				vista.guardarRecordado();
                                vista.quitarVista();
				
				
				java.awt.EventQueue.invokeLater(new Runnable() {
					public void run() {
						new Vista_administrador().setVisible(true);
					}
				});
			}else{
				vista.guardarRecordado();
				System.out.println("ENTRAMOS USUARIO");
                                vista.quitarVista();

				java.awt.EventQueue.invokeLater(new Runnable() {
					public void run() {
                                            new Vista_carga(valorNombre).setVisible(true);
                                            System.out.println(valorNombre);
					}
				});
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ParseException ex) {
			Logger.getLogger(Vista_inicio_sesion.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	/**
	 * este metodo manda peticion al servidor y comprueba si el usuario esta registrado o no 
	 * si no esta en la BD lanza mensaje de usuario no registrado
	 */
	public void noRegistrado(){
		String usuario=vista.getNombre();
                String password=vista.getPassword();

		URL url;
		try {
			// Creando un objeto URL
			url = new URL("http://localhost/TriniGame/public/usuario/" + usuario + "/" + password + "/");

			// Realizando la petición GET
			URLConnection con = url.openConnection();

			// Leyendo el resultado
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

			String linea;
			linea = in.readLine();
			System.out.println(linea);

			JSONParser parser = new JSONParser();
			Object obj = parser.parse(linea);
			JSONArray json = (JSONArray) obj;
			
			System.out.println(linea.length() + "siiiiiii");
			
			
			if (linea.length() == 2) {

					System.out.println("Usuario no registrado ");
					JOptionPane.showMessageDialog(null, "Usuario no registrado");

			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ParseException ex) {
			Logger.getLogger(Vista_inicio_sesion.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
    
}