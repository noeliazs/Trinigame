/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;


/**
 *
 * @author noelia,jorge,ivan
 */
public class AppComunicacion {


    public static void main(String[] args) {
         ComunicacionPOST c2=new ComunicacionPOST();
         c2.datos();
         c2.pedir("http://localhost/servidor/public/anadirPregunta");     
         System.out.println(c2.leerDatos());
    }
    
}
