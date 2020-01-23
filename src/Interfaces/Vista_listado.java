package Interfaces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Jorge,Ivan y Noelia
 */
public class Vista_listado extends javax.swing.JFrame {

        private ArrayList<String>nombres=new ArrayList();
        private ArrayList<String>puntuaciones=new ArrayList();
        
	/**
	 * Constructor de esta vista inicia los componentes se le añade una localizacion
	 */
	public Vista_listado() {
		initComponents();
		this.setLocation(700, 250);
            try {
                cargarDatos();
            } catch (ParseException ex) {
                Logger.getLogger(Vista_listado.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Vista_listado.class.getName()).log(Level.SEVERE, null, ex);
            }
            escribirDatos();
	}
        
        public void cargarDatos() throws MalformedURLException, IOException, ParseException{
            URL url;
			url = new URL("http://localhost/servidor/public/listaPuntuaciones");
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
                        
                        for (int i = 0; i < json.size(); i++) {
				JSONObject object = (JSONObject) json.get(i);
				nombres.add(object.get("nombre").toString());
                                puntuaciones.add(object.get("puntos").toString());
			}
        }
        
        public void escribirDatos(){
            
                txtNombre1.setText(nombres.get(0));
                txtNombre2.setText(nombres.get(1));
                txtNombre3.setText(nombres.get(2));
                txtNombre4.setText(nombres.get(3));
                txtNombre5.setText(nombres.get(4));
            
            
                puntuacion1.setText(puntuaciones.get(0));
                puntuacion2.setText(puntuaciones.get(1));
                puntuacion3.setText(puntuaciones.get(2));
                puntuacion4.setText(puntuaciones.get(3));
                puntuacion5.setText(puntuaciones.get(4));
            
        }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JLabel();
        txtNombre2 = new javax.swing.JLabel();
        txtNombre3 = new javax.swing.JLabel();
        txtNombre4 = new javax.swing.JLabel();
        txtNombre5 = new javax.swing.JLabel();
        puntuacion1 = new javax.swing.JLabel();
        puntuacion2 = new javax.swing.JLabel();
        puntuacion3 = new javax.swing.JLabel();
        puntuacion4 = new javax.swing.JLabel();
        puntuacion5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de sesion");

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBackground(new java.awt.Color(116, 194, 225));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Listado de puntuaciones");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logopeque.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(116, 194, 225));

        btnCerrar.setText("CERRAR");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrar)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(btnCerrar)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        jLabel2.setText("Usuario : ");

        jLabel5.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        jLabel5.setText("Puntuación:");

        txtNombre1.setText("jLabel3");

        txtNombre2.setText("jLabel6");

        txtNombre3.setText("jLabel7");

        txtNombre4.setText("jLabel8");

        txtNombre5.setText("jLabel9");

        puntuacion1.setText("jLabel3");

        puntuacion2.setText("jLabel6");

        puntuacion3.setText("jLabel7");

        puntuacion4.setText("jLabel8");

        puntuacion5.setText("jLabel9");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNombre1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(puntuacion1)
                        .addGap(117, 117, 117))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre5)
                            .addComponent(txtNombre4)
                            .addComponent(txtNombre3)
                            .addComponent(txtNombre2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(puntuacion2)
                            .addComponent(puntuacion3)
                            .addComponent(puntuacion4)
                            .addComponent(puntuacion5))
                        .addGap(117, 117, 117))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre1)
                    .addComponent(puntuacion1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre2)
                    .addComponent(puntuacion2))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre3)
                    .addComponent(puntuacion3))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre4)
                    .addComponent(puntuacion4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre5)
                    .addComponent(puntuacion5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
	 *
	 * @param evt Este método es el evento del boton cerrar y cierra todo el sistema
	 */
    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
 
		this.setVisible(false);

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {

				new Vista_administrador().setVisible(true);
			}
		});
        
    }//GEN-LAST:event_btnCerrarActionPerformed


	/**
	 * Declaracion de todos los elementos graficos de esta vista
	 */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel puntuacion1;
    private javax.swing.JLabel puntuacion2;
    private javax.swing.JLabel puntuacion3;
    private javax.swing.JLabel puntuacion4;
    private javax.swing.JLabel puntuacion5;
    private javax.swing.JLabel txtNombre1;
    private javax.swing.JLabel txtNombre2;
    private javax.swing.JLabel txtNombre3;
    private javax.swing.JLabel txtNombre4;
    private javax.swing.JLabel txtNombre5;
    // End of variables declaration//GEN-END:variables
}
