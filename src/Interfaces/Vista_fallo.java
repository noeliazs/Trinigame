package Interfaces;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jorge,Ivan y Noelia
 */
public class Vista_fallo extends javax.swing.JFrame {
	
	private static int contadorPuntos;
	
	/**
	 * Constructor de esta vista inicia los componentes y se le aplica localizacion en pantalla
	 */
	public Vista_fallo(int contador) {
                contadorPuntos=contador;
		initComponents();

		this.setLocation(700, 250);
		this.setResizable(false);
                txtPuntuacion.setText("Puntuacion "+contadorPuntos);
	}

	/**
	 * * Este método se llama desde el constructor para inicializar el formulario.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        btnSalirFallo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtPuntuacion = new javax.swing.JLabel();
        txtPosicion = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel12.setBackground(new java.awt.Color(116, 194, 225));

        jLabel1.setText("Has fallado la pregunta");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(116, 194, 225));

        btnSalirFallo.setText("SALIR");
        btnSalirFallo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirFalloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalirFallo)
                .addGap(46, 46, 46))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnSalirFallo)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cruz.png"))); // NOI18N

        txtPuntuacion.setText("Puntuación:");

        txtPosicion.setText("Posición:");

        jLabel5.setText("Has sido eliminado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(txtPuntuacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtPosicion)
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(110, 110, 110))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPuntuacion)
                    .addComponent(txtPosicion))
                .addGap(18, 18, 18)
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
    //
    private void btnSalirFalloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirFalloActionPerformed

		this.setVisible(false);

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {

                            try {
                                new Vista_inicio_sesion().setVisible(true);
                            } catch (IOException ex) {
                                Logger.getLogger(Vista_fallo.class.getName()).log(Level.SEVERE, null, ex);
                            }
			}
		});
    }//GEN-LAST:event_btnSalirFalloActionPerformed

	

	/**
	 * @param args the command line arguments
	 * el main que inicia esta vista 
         * 
	 */
	public static void main(String args[]) {

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Vista_fallo(contadorPuntos).setVisible(true);
			}
		});
	}
	/**
	 * Declaracion de todos los elementos graficos de esta vista
	 */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalirFallo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JLabel txtPosicion;
    private javax.swing.JLabel txtPuntuacion;
    // End of variables declaration//GEN-END:variables
}
