/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import Interfaces.Vista_fallo;
import Interfaces.Vista_ganador;
import Interfaces.Vista_pregunta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Noelia Zarzoso
 */
public class ControladorPregunta implements ActionListener{
          
	private String respuesta_correcta;
        private static int contadorPuntos;
        ArrayList<String>respuestas=new ArrayList();
        private  Vista_pregunta vista;
        private int id;
        private static final int NUMPREGUNTAS=40;
        private String categoria;
        private String pregunta;
        private String nPregunta;
        private String nombre;

    public ControladorPregunta(Vista_pregunta vista,String nombre) throws ParseException {
        this.vista=vista;
        this.nombre=nombre;
        id = (int) (Math.random() * ((NUMPREGUNTAS - 1) +1)) + 1;
        cargarPregunta();
        cargarRespuesta_correcta();
        cargarRespuestas_incorrectas();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        switch(ae.getActionCommand()){
          case "BOTON1":
               if(vista.getBoton1().equals(respuesta_correcta)){
                contadorPuntos++;
                vista.setVisible(false);
                if(contadorPuntos==NUMPREGUNTAS){
                    new Vista_ganador(contadorPuntos,nombre).setVisible(true);
                }
                else{
                    try {
                        new Vista_pregunta(contadorPuntos,nombre).setVisible(true);
                    } catch (ParseException ex) {
                        Logger.getLogger(ControladorPregunta.class.getName()).log(Level.SEVERE, null, ex);
                    }
                      
                }

                }
                else{
                    vista.setVisible(false);
                    new Vista_fallo(contadorPuntos).setVisible(true);
                }
              break;
              
          case "BOTON2":
              if(vista.getBoton2().equals(respuesta_correcta)){
                contadorPuntos++;
                vista.setVisible(false);
                if(contadorPuntos==NUMPREGUNTAS){
                    new Vista_ganador(contadorPuntos,nombre).setVisible(true);
                }
                    else{
                             try {
                              new Vista_pregunta(contadorPuntos,nombre).setVisible(true);
                          } catch (ParseException ex) {
                              Logger.getLogger(Vista_pregunta.class.getName()).log(Level.SEVERE, null, ex);
                          }
                    }
                }
            else{
                vista.setVisible(false);
                new Vista_fallo(contadorPuntos).setVisible(true);
            }
              break;
          case "BOTON3":
              if(vista.getBoton3().equals(respuesta_correcta)){
                 contadorPuntos++;
                 vista.setVisible(false);
                if(contadorPuntos==NUMPREGUNTAS){
                     new Vista_ganador(contadorPuntos,nombre).setVisible(true);
                }
                else{
                    try {
                     new Vista_pregunta(contadorPuntos,nombre).setVisible(true);
                 } catch (ParseException ex) {
                     Logger.getLogger(Vista_pregunta.class.getName()).log(Level.SEVERE, null, ex);
                 }
                }
            }
            else{
                vista.setVisible(false);
                new Vista_fallo(contadorPuntos).setVisible(true);
            }
              break;
          case "BOTON4":
               if(vista.getBoton4().equals(respuesta_correcta)){
                    contadorPuntos++;
                    vista.setVisible(false);
                    if(contadorPuntos==NUMPREGUNTAS){
                        new Vista_ganador(contadorPuntos,nombre).setVisible(true);
                    }
                    else{
                             try {
                              new Vista_pregunta(contadorPuntos,nombre).setVisible(true);
                          } catch (ParseException ex) {
                              Logger.getLogger(Vista_pregunta.class.getName()).log(Level.SEVERE, null, ex);
                          }
                    }
                }
                else{
                    vista.setVisible(false);
                    new Vista_fallo(contadorPuntos).setVisible(true);
           
       }
              break;
              
        }
       
}
    /**
     * Conectamos con el servidor para obtener la pregunta
     * @throws ParseException 
     */
    
    public void cargarPregunta() throws ParseException{
		URL url;

		try {
			// Creando un objeto URL
			url = new URL("http://localhost/servidor/public/pregunta/obtenerPregunta/"+id);

			// Realizando la petición GET
			URLConnection con = url.openConnection();

			// Leyendo el resultado
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

			// para guardar la lectura 
			String linea;

			// Leyendo el resultado
			linea = in.readLine();

			//imprimo la lectura 
			System.out.println(linea);

			JSONParser parser = new JSONParser();
			Object obj = parser.parse(linea);
			JSONArray json = (JSONArray) obj;
			
			for (int i = 0; i < json.size(); i++) {
				JSONObject object = (JSONObject) json.get(i);
				categoria = object.get("categoria").toString();
				pregunta = object.get("pregunta").toString();
				nPregunta = object.get("id").toString();
		
			}
			
			vista.escribir(categoria,pregunta,nPregunta,contadorPuntos);
		
		} catch (IOException ex) {
			Logger.getLogger(Vista_pregunta.class.getName()).log(Level.SEVERE, null, ex);
		}
        
    }
    /**
     * Conectamos con el servidor para obtener las respuestas correctas
     * @throws ParseException 
     */
	
	public void cargarRespuesta_correcta() throws ParseException{
		
		URL url;

		try {
			// Creando un objeto URL
			url = new URL("http://localhost/servidor/public/pregunta/obtenerRespuestasCorrectas/"+id);

			// Realizando la petición GET
			URLConnection con = url.openConnection();

			// Leyendo el resultado
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

			// para guardar la lectura 
			String linea;

			// Leyendo el resultado
			linea = in.readLine();

			//imprimo la lectura 
			System.out.println(linea);

			JSONParser parser = new JSONParser();
			Object obj = parser.parse(linea);
			JSONArray json = (JSONArray) obj;
			
			for (int i = 0; i < json.size(); i++) {
				JSONObject object = (JSONObject) json.get(i);
				respuesta_correcta = object.get("respuesta").toString();
                                respuestas.add(respuesta_correcta);
				
			}
			
		
			
		
		} catch (IOException ex) {
			Logger.getLogger(Vista_pregunta.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
        /**
         * Conectamos con el servidor para obtener las respuestas incorrectas
         * @throws ParseException 
         */
	
	public void cargarRespuestas_incorrectas() throws ParseException{
		URL url;

		try {
			// Creando un objeto URL
			url = new URL("http://localhost/servidor/public/pregunta/obtenerInCoRespuestaCorrectas/"+id);

			// Realizando la petición GET
			URLConnection con = url.openConnection();

			// Leyendo el resultado
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

			// para guardar la lectura 
			String linea;

			// Leyendo el resultado
			linea = in.readLine();

			//imprimo la lectura 
			System.out.println(linea);

			JSONParser parser = new JSONParser();
			Object obj = parser.parse(linea);
			JSONArray json = (JSONArray) obj;
			
			for (int i = 0; i < json.size(); i++) {
				JSONObject object = (JSONObject) json.get(i);
				respuestas.add(object.get("respuesta").toString());
			}
			
		
		} catch (IOException ex) {
			Logger.getLogger(Vista_pregunta.class.getName()).log(Level.SEVERE, null, ex);
		}
		
		barajear();
	}
        /**
         * Obtenemos las preguntas barajeadas de forma aleatoria
         */
	
	public void barajear(){
             Collections.shuffle(respuestas); 
             vista.escribirRespuestas(respuestas);
            
        }
}        

