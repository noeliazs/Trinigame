/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import Interfaces.Vista_pregunta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Noelia,ivan y jorge
 */
public class ControladorPregunta implements ActionListener{
    Vista_pregunta vista;

    public ControladorPregunta(Vista_pregunta vista) {
        this.vista=vista;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       if (ae.getActionCommand().equals("TIEMPO")) {
	    vista.calcularTimer();
        }
    }
    
}
