/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

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
 * @author Noelia Zarzoso  eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee
 */
public class Vista_pregunta extends javax.swing.JFrame {
	
	private int i;
        private static String nombre;
	private String categoria; 
	private String pregunta;
	private String Npregunta;
	private String respuesta_correcta;
        private static int contadorPuntos;
        ArrayList<String>respuestas=new ArrayList();

	private int id = (int) (Math.random() * ((10 - 1) +1)) + 1;;
	

    /**
     * Creates new form Vista_pregunta
     */
    public Vista_pregunta(int contador,String nombre) throws ParseException {
                contadorPuntos=contador;
                this.nombre=nombre;
                initComponents();
                cargarPregunta();
		cargarRespuesta_correcta();
		cargarRespuestas_incorrectas();
    }
    
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
			
			for (i = 0; i < json.size(); i++) {
				JSONObject object = (JSONObject) json.get(i);
				categoria = object.get("categoria").toString();
				pregunta = object.get("pregunta").toString();
				Npregunta = object.get("id").toString();
		
			}
			
			txtCategoria.setText(categoria);
			txtPregunta.setText(pregunta);
			txtNpregunta.setText(Npregunta);
                        txtPuntuacion.setText("Puntuacion "+contadorPuntos);
		
		} catch (IOException ex) {
			Logger.getLogger(Vista_pregunta.class.getName()).log(Level.SEVERE, null, ex);
		}
        
    }
	
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
			
			for (i = 0; i < json.size(); i++) {
				JSONObject object = (JSONObject) json.get(i);
				respuesta_correcta = object.get("respuesta").toString();
                                respuestas.add(respuesta_correcta);
				
			}
			
			//btnRespuesta1.setText(respuesta_correcta);
			
		
		} catch (IOException ex) {
			Logger.getLogger(Vista_pregunta.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
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
			
			for (i = 0; i < json.size(); i++) {
				JSONObject object = (JSONObject) json.get(i);
				respuestas.add(object.get("respuesta").toString());
			}
			
                        
			//btnRespuesta2.setText(respuestas.get(1));
			//btnRespuesta3.setText(respuestas.get(2));
                        //btnRespuesta4.setText(respuestas.get(3));
		
		} catch (IOException ex) {
			Logger.getLogger(Vista_pregunta.class.getName()).log(Level.SEVERE, null, ex);
		}
		
		barajear();
	}
	
	public void barajear(){
             Collections.shuffle(respuestas); 
             btnRespuesta1.setText(respuestas.get(0));
             btnRespuesta2.setText(respuestas.get(1));
	     btnRespuesta3.setText(respuestas.get(2));
             btnRespuesta4.setText(respuestas.get(3));
        }
	
    /**
     * Este método nos cambia la sintaxis de la pregunta de la BD al lenguaje natural para mostrarlo en la interfaz
     * @param descripcionPregunta
     * @return 
     */
    private String parsearPreguntEntradaAJava(String descripcionPregunta) {
        String pregunta=descripcionPregunta.replace("%20", " ");
        return pregunta;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNumPregunta = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JLabel();
        txtTiempo = new javax.swing.JLabel();
        txtPuntuacion = new javax.swing.JLabel();
        btnRespuesta1 = new javax.swing.JButton();
        btnRespuesta2 = new javax.swing.JButton();
        btnRespuesta3 = new javax.swing.JButton();
        btnRespuesta4 = new javax.swing.JButton();
        txtPregunta = new javax.swing.JLabel();
        txtNpregunta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        txtNumPregunta.setFont(new java.awt.Font("Britannic Bold", 1, 18)); // NOI18N
        txtNumPregunta.setText("Pregunta :");

        txtCategoria.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        txtCategoria.setText("Categoría");

        txtTiempo.setText("Tiempo");

        txtPuntuacion.setText("Puntuacion:");

        btnRespuesta1.setText("Respuesta 1");
        btnRespuesta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRespuesta1ActionPerformed(evt);
            }
        });

        btnRespuesta2.setText("Respuesta 2");
        btnRespuesta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRespuesta2ActionPerformed(evt);
            }
        });

        btnRespuesta3.setText("Respuesta 3");
        btnRespuesta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRespuesta3ActionPerformed(evt);
            }
        });

        btnRespuesta4.setText("Respuesta 4");
        btnRespuesta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRespuesta4ActionPerformed(evt);
            }
        });

        txtPregunta.setBackground(new java.awt.Color(51, 51, 255));
        txtPregunta.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N
        txtPregunta.setText("Soy la pregunta ");

        txtNpregunta.setFont(new java.awt.Font("Britannic Bold", 1, 18)); // NOI18N
        txtNpregunta.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(762, 762, 762)
                        .addComponent(txtPuntuacion))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(txtNumPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(txtNpregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                                .addComponent(txtCategoria)
                                .addGap(285, 285, 285)
                                .addComponent(txtTiempo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnRespuesta1, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                                    .addComponent(btnRespuesta3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnRespuesta4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRespuesta2, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE))))))
                .addGap(0, 105, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(txtPregunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTiempo)
                    .addComponent(txtCategoria)
                    .addComponent(txtNpregunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRespuesta1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(btnRespuesta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRespuesta3, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(btnRespuesta4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(txtPuntuacion)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRespuesta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRespuesta1ActionPerformed
       if(btnRespuesta1.getText().equals(respuesta_correcta)){
           contadorPuntos++;
           this.setVisible(false);
           if(contadorPuntos==3){
               new Vista_listado(contadorPuntos,nombre).setVisible(true);
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
           this.setVisible(false);
           new Vista_fallo(contadorPuntos).setVisible(true);
       }
    }//GEN-LAST:event_btnRespuesta1ActionPerformed

    private void btnRespuesta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRespuesta2ActionPerformed
        if(btnRespuesta2.getText().equals(respuesta_correcta)){
           contadorPuntos++;
           this.setVisible(false);
           if(contadorPuntos==3){
               new Vista_listado(contadorPuntos,nombre).setVisible(true);
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
           this.setVisible(false);
           new Vista_fallo(contadorPuntos).setVisible(true);
       }
    }//GEN-LAST:event_btnRespuesta2ActionPerformed

    private void btnRespuesta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRespuesta4ActionPerformed
        if(btnRespuesta4.getText().equals(respuesta_correcta)){
           contadorPuntos++;
           this.setVisible(false);
           if(contadorPuntos==3){
               new Vista_listado(contadorPuntos,nombre).setVisible(true);
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
           this.setVisible(false);
           new Vista_fallo(contadorPuntos).setVisible(true);
           
       }
    }//GEN-LAST:event_btnRespuesta4ActionPerformed

    private void btnRespuesta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRespuesta3ActionPerformed
        if(btnRespuesta3.getText().equals(respuesta_correcta)){
           contadorPuntos++;
           this.setVisible(false);
           if(contadorPuntos==3){
               new Vista_listado(contadorPuntos,nombre).setVisible(true);
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
           this.setVisible(false);
           new Vista_fallo(contadorPuntos).setVisible(true);
       }
    }//GEN-LAST:event_btnRespuesta3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista_pregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_pregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_pregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_pregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
				try {
					new Vista_pregunta(contadorPuntos,nombre).setVisible(true);
				} catch (ParseException ex) {
					Logger.getLogger(Vista_pregunta.class.getName()).log(Level.SEVERE, null, ex);
				}
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRespuesta1;
    private javax.swing.JButton btnRespuesta2;
    private javax.swing.JButton btnRespuesta3;
    private javax.swing.JButton btnRespuesta4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtCategoria;
    private javax.swing.JLabel txtNpregunta;
    private javax.swing.JLabel txtNumPregunta;
    private javax.swing.JLabel txtPregunta;
    private javax.swing.JLabel txtPuntuacion;
    private javax.swing.JLabel txtTiempo;
    // End of variables declaration//GEN-END:variables
}
