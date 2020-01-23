/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import Interfaces.Vista_Nuevo_Usuario;
import Interfaces.Vista_administrador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Noelia Zarzoso
 */
public class ControladorNuevoUsuario implements ActionListener{
    private Vista_Nuevo_Usuario vista;
    
    public ControladorNuevoUsuario(Vista_Nuevo_Usuario vista) {
        this.vista=vista;

    }
    
    

    @Override
    public void actionPerformed(ActionEvent ae) {
      switch(ae.getActionCommand()){
          case "GUARDAR":
            anadirUsuario();

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
	 * metodo añadir usuario que coge los valores introducidos y manda peticion al servidor para comprobar si existe y si no existe lo crea
	 */
	public void anadirUsuario() {
            String usuario=vista.getNombre();
            String password=vista.getPassword();
            
		URL url;

		try {
			// Creando un objeto URL
			url = new URL("http://localhost/servidor/public/usuario/anadirUsuario/" + usuario + "/" + password + "/");

			// Realizando la petición GET
			URLConnection con = url.openConnection();

			// Leyendo el resultado
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

			String linea;
			linea = in.readLine();
			System.out.println(linea);

			System.out.println("Usuario añadido");

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
