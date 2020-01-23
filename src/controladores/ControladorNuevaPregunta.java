/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import Interfaces.Vista_Nueva_Pregunta;
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
import javax.swing.JOptionPane;

/**
 *
 * @author Noelia Zarzoso
 */
public class ControladorNuevaPregunta implements ActionListener{
    private Vista_Nueva_Pregunta vista;
    private String descripcion_pregunta;
    
    public ControladorNuevaPregunta(Vista_Nueva_Pregunta vista) {
        this.vista=vista;

    }
    
    

    @Override
    public void actionPerformed(ActionEvent ae) {
      switch(ae.getActionCommand()){
          case "GUARDAR":
              try {
                anadirPregunta();
            } catch (IOException ex) {
                Logger.getLogger(Vista_Nueva_Pregunta.class.getName()).log(Level.SEVERE, null, ex);
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
          case "PREGUNTA":
              descripcion_pregunta = JOptionPane.showInputDialog( "Introduce la descripcion de la pregunta"); // aqui java to toma como cadena	
              break;
              
      }
    }
    
    
    /**
	 * metodo añadir pregunta que coge los valores introducidos y manda peticion al servidor para comprobar si existe y si no existe lo crea
	 */
	public void anadirPregunta() throws UnsupportedEncodingException, IOException {
                String categoria=vista.getCategoria();
		String pregunta=parsearPreguntaSalidaABD(descripcion_pregunta);
                URL url;
		try {
			// Creando un objeto URL
			url = new URL("http://localhost/servidor/public/pregunta/anadirPregunta/" + categoria + "/" + pregunta + "/");
                        
			// Realizando la petición 
			URLConnection con = url.openConnection();

			// Leyendo el resultado
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

			String linea;
			linea = in.readLine();
			System.out.println(linea);
                        

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
                

	}
        
        
        /**
         * Este metodo nos transforma la pregunta para poder guardarla en la BD.
         * @param descripcionPregunta
         * @return 
         */
    private String parsearPreguntaSalidaABD(String descripcionPregunta) {
        String pregunta=descripcionPregunta.replace(" ", "%20");
        return pregunta;
    }
}
    