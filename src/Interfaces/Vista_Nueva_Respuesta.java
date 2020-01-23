package Interfaces;

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
 * @author Jorge,Ivan y Noelia
 */
public class Vista_Nueva_Respuesta extends javax.swing.JFrame {
	
	private int idPregunta;
        private String respuestaCorrecta;
        private String respuestaIncorrecta2;
        private String respuestaIncorrecta3;
        private String respuestaIncorrecta4;
	/**
	 * Constructor de esta vista inicia los componentes y se le aplica localizacion en pantalla
	 */
	public Vista_Nueva_Respuesta() {
		initComponents();
		this.setLocation(700, 250);
		this.setResizable(false);
	}

	/**
	 * * Este método se llama desde el constructor para inicializar el formulario.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtIdPregunta = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        btnCerrar1 = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtCorrecta = new javax.swing.JTextField();
        txtIncorrecta2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIncorrecta3 = new javax.swing.JTextField();
        txtIncorrecta4 = new javax.swing.JTextField();

        jLabel4.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        jLabel4.setText("Respuesta 2:");

        jLabel6.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        jLabel6.setText("Respuesta 2:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel12.setBackground(new java.awt.Color(116, 194, 225));

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nuevas Respuestas");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel10)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        jLabel1.setText("Id Pregunta:");

        jPanel11.setBackground(new java.awt.Color(116, 194, 225));

        btnCerrar1.setText("CERRAR");
        btnCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrar1ActionPerformed(evt);
            }
        });

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(18, 18, 18)
                .addComponent(btnCerrar1)
                .addGap(46, 46, 46))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrar1)
                    .addComponent(btnGuardar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        jLabel2.setText("Respuesta Correcta:");

        jLabel3.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        jLabel3.setText("Respuesta 2:");

        jLabel5.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        jLabel5.setText("Respuesta 3:");

        jLabel7.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        jLabel7.setText("Respuesta 4:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(62, 62, 62)
                                .addComponent(txtIdPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCorrecta, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIncorrecta2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIncorrecta3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIncorrecta4, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCorrecta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIncorrecta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIncorrecta3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtIncorrecta4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

	/**
	 * @param evt Este método es el evento del boton cerrar que desactiva esta vista y vuelve a la vista de las opciones del administrador
	 */
    private void btnCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar1ActionPerformed

		this.setVisible(false);

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {

				new Vista_administrador().setVisible(true);
			}
		});
    }//GEN-LAST:event_btnCerrar1ActionPerformed

	/**
	 *
	 * @param evt Este método es el evento del boton guardar ubicacion que llama al metodo anadirUbicacion y vuelve a las opciones del administrador
	 */
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

            try {
                //aqui guardar la ubicacion en la BD !!!!! y vuelve a vista administrador
                anadirRespuestas();
            } catch (IOException ex) {
                Logger.getLogger(Vista_Nueva_Respuesta.class.getName()).log(Level.SEVERE, null, ex);
            }

		this.setVisible(false);

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {

				new Vista_administrador().setVisible(true);
			}
		});
    }//GEN-LAST:event_btnGuardarActionPerformed

	/**
	 * metodo añadir ubicacion que coge los valores introducidos y manda peticion al servidor para comprobar si existe y si no existe lo crea
	 */
	public void anadirRespuestas() throws UnsupportedEncodingException, IOException {

		idPregunta= Integer.parseInt(txtIdPregunta.getText().toString());
		respuestaCorrecta=txtCorrecta.getText().toString();
                respuestaIncorrecta2=txtIncorrecta2.getText().toString();
                respuestaIncorrecta3=txtIncorrecta3.getText().toString();
                respuestaIncorrecta4=txtIncorrecta4.getText().toString();
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

		//System.out.println("Respuestas añadidas");

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
        
         private String parsearPreguntaSalidaABD(String respuesta) {
            String resp=respuesta.replace(" ", "%20");
            return resp;
        }
	/**
	 * Declaracion de todos los elementos graficos de esta vista
	 */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar1;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JTextField txtCorrecta;
    private javax.swing.JTextField txtIdPregunta;
    private javax.swing.JTextField txtIncorrecta2;
    private javax.swing.JTextField txtIncorrecta3;
    private javax.swing.JTextField txtIncorrecta4;
    // End of variables declaration//GEN-END:variables
}
