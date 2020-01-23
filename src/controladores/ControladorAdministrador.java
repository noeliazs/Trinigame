/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import Interfaces.Vista_Nueva_Pregunta;
import Interfaces.Vista_Nueva_Respuesta;
import Interfaces.Vista_Nuevo_Usuario;
import Interfaces.Vista_administrador;
import Interfaces.Vista_inicio_sesion;
import Interfaces.Vista_listado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Noelia Zarzoso
 */
public class ControladorAdministrador implements ActionListener{
    private Vista_administrador vista;

    public ControladorAdministrador(Vista_administrador vista) {
        this.vista = vista;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        switch(ae.getActionCommand()){
            case "USUARIOS":
                vista.setVisible(false);
		     java.awt.EventQueue.invokeLater(new Runnable() {
				public void run() {
				new Vista_Nuevo_Usuario().setVisible(true);
			}
		});
                break;
            case "PREGUNTAS":
                 vista.setVisible(false);
			
			/* Create and display the form */
			java.awt.EventQueue.invokeLater(new Runnable() {
				public void run() {
				new Vista_Nueva_Pregunta().setVisible(true);
			}
		});
                break;
            case "RESPUESTAS":
                vista.setVisible(false);
			
			/* Create and display the form */
			java.awt.EventQueue.invokeLater(new Runnable() {
				public void run() {
				new Vista_Nueva_Respuesta().setVisible(true);
			}
		});
                break;
            case "LISTADO":
                vista.setVisible(false);
			java.awt.EventQueue.invokeLater(new Runnable() {
				public void run() {
                                    new Vista_listado().setVisible(true);
			}
		});
                break;
            case "SALIR":
                vista.setVisible(false);

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {

				try {
					new Vista_inicio_sesion().setVisible(true);
				} catch (IOException ex) {
					Logger.getLogger(Vista_administrador.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		});
                break;
        }
       
    }
    
}
