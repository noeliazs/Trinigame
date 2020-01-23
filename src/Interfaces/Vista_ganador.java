package Interfaces;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jorge,Ivan y Noelia
 */
public class Vista_ganador extends javax.swing.JFrame {
	
	private static int contador;
        private static String nombre;
        
	
	/**
	 * Constructor de esta vista inicia los componentes y se le aplica localizacion en pantalla
	 */
	public Vista_ganador(int contador,String nombre) {
                this.contador=contador;
                this.nombre=nombre;
		initComponents();

		this.setLocation(700, 250);
		this.setResizable(false);
                txtJug1.setText(nombre);
                txtp1.setText(contador+"");
	}
       

	/**
	 * * Este método se llama desde el constructor para inicializar el formulario.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        btnSalirGanador = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtJug1 = new javax.swing.JLabel();
        txtp1 = new javax.swing.JLabel();
        txtJug2 = new javax.swing.JLabel();
        txtp2 = new javax.swing.JLabel();
        txtJug3 = new javax.swing.JLabel();
        txtp3 = new javax.swing.JLabel();
        txtJug4 = new javax.swing.JLabel();
        txtp4 = new javax.swing.JLabel();
        txtJug5 = new javax.swing.JLabel();
        txtp5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtJug6 = new javax.swing.JLabel();
        txtp6 = new javax.swing.JLabel();
        txtJug7 = new javax.swing.JLabel();
        txtp7 = new javax.swing.JLabel();
        txtJug8 = new javax.swing.JLabel();
        txtp8 = new javax.swing.JLabel();
        txtJug9 = new javax.swing.JLabel();
        txtp9 = new javax.swing.JLabel();
        txtJug10 = new javax.swing.JLabel();
        txtp10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel12.setBackground(new java.awt.Color(116, 194, 225));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/corona.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        jLabel2.setText("RANKING");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(116, 194, 225));

        btnSalirGanador.setText("SALIR");
        btnSalirGanador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirGanadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalirGanador)
                .addGap(46, 46, 46))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnSalirGanador)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        txtJug1.setText("jLabel1");

        txtp1.setText("jLabel4");

        txtJug2.setText("jLabel5");

        txtp2.setText("jLabel6");

        txtJug3.setText("jLabel7");

        txtp3.setText("jLabel8");

        txtJug4.setText("jLabel9");

        txtp4.setText("jLabel10");

        txtJug5.setText("jLabel11");

        txtp5.setText("jLabel12");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtJug4)
                        .addComponent(txtJug3)
                        .addComponent(txtJug2)
                        .addComponent(txtJug1))
                    .addComponent(txtJug5))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtp1)
                    .addComponent(txtp2)
                    .addComponent(txtp3)
                    .addComponent(txtp4)
                    .addComponent(txtp5))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJug1)
                    .addComponent(txtp1))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJug2)
                    .addComponent(txtp2))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJug3)
                    .addComponent(txtp3))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJug4)
                    .addComponent(txtp4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJug5)
                    .addComponent(txtp5))
                .addContainerGap())
        );

        txtJug6.setText("jLabel13");

        txtp6.setText("jLabel14");

        txtJug7.setText("jLabel15");

        txtp7.setText("jLabel16");

        txtJug8.setText("jLabel17");

        txtp8.setText("jLabel18");

        txtJug9.setText("jLabel19");

        txtp9.setText("jLabel20");

        txtJug10.setText("jLabel21");

        txtp10.setText("jLabel22");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtJug6)
                    .addComponent(txtJug7)
                    .addComponent(txtJug8)
                    .addComponent(txtJug9)
                    .addComponent(txtJug10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtp6)
                    .addComponent(txtp7)
                    .addComponent(txtp8)
                    .addComponent(txtp9)
                    .addComponent(txtp10))
                .addGap(41, 41, 41))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJug6)
                    .addComponent(txtp6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJug7)
                    .addComponent(txtp7))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJug8)
                    .addComponent(txtp8))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJug9)
                    .addComponent(txtp9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJug10)
                    .addComponent(txtp10))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 29, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private void btnSalirGanadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirGanadorActionPerformed

		this.setVisible(false);

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {

                            try {
                                new Vista_inicio_sesion().setVisible(true);
                            } catch (IOException ex) {
                                Logger.getLogger(Vista_ganador.class.getName()).log(Level.SEVERE, null, ex);
                            }
			}
		});
    }//GEN-LAST:event_btnSalirGanadorActionPerformed

	

	/**
	 * @param args the command line arguments
	 * el main que inicia esta vista 
         * 
	 */
	public static void main(String args[]) {

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Vista_ganador(contador,nombre).setVisible(true);
			}
		});
	}
	/**
	 * Declaracion de todos los elementos graficos de esta vista
	 */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalirGanador;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txtJug1;
    private javax.swing.JLabel txtJug10;
    private javax.swing.JLabel txtJug2;
    private javax.swing.JLabel txtJug3;
    private javax.swing.JLabel txtJug4;
    private javax.swing.JLabel txtJug5;
    private javax.swing.JLabel txtJug6;
    private javax.swing.JLabel txtJug7;
    private javax.swing.JLabel txtJug8;
    private javax.swing.JLabel txtJug9;
    private javax.swing.JLabel txtp1;
    private javax.swing.JLabel txtp10;
    private javax.swing.JLabel txtp2;
    private javax.swing.JLabel txtp3;
    private javax.swing.JLabel txtp4;
    private javax.swing.JLabel txtp5;
    private javax.swing.JLabel txtp6;
    private javax.swing.JLabel txtp7;
    private javax.swing.JLabel txtp8;
    private javax.swing.JLabel txtp9;
    // End of variables declaration//GEN-END:variables
}
