
package Interfaces;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jorge Martin Zaballos
 */
public class Vista_administrador extends javax.swing.JFrame {

	/**
	 * Constructor de esta vista 
	 * inicia los componentes y se le aplica localizacion en pantalla 
	 */
	public Vista_administrador() {
		initComponents();
		
		this.setLocation(700, 250);
	}

	/**
		Este método se llama desde el constructor para inicializar el formulario.	 
	*/
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        btnEntrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnCerrar1 = new javax.swing.JButton();
        btnAnadirUsuario = new javax.swing.JButton();
        btnAnadirPreguntas = new javax.swing.JButton();
        btnAnadirRespuestas = new javax.swing.JButton();

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        btnCerrar.setText("CERRAR");

        btnEntrar.setText("ENTRAR");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addComponent(btnEntrar)
                .addGap(18, 18, 18)
                .addComponent(btnCerrar)
                .addGap(46, 46, 46))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrar)
                    .addComponent(btnEntrar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel3.setBackground(new java.awt.Color(116, 194, 225));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Gestion administrador ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(116, 194, 225));

        btnCerrar1.setText("VOLVER A INICIO DE SESION ");
        btnCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrar1)
                .addGap(47, 47, 47))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnCerrar1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btnAnadirUsuario.setText("AÑADIR USUARIO");
        btnAnadirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirUsuarioActionPerformed(evt);
            }
        });

        btnAnadirPreguntas.setText("AÑADIR PREGUNTAS");
        btnAnadirPreguntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirPreguntasActionPerformed(evt);
            }
        });

        btnAnadirRespuestas.setText("AÑADIR RESPUESTAS");
        btnAnadirRespuestas.setToolTipText("");
        btnAnadirRespuestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirRespuestasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAnadirUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAnadirPreguntas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAnadirRespuestas, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAnadirUsuario)
                .addGap(18, 18, 18)
                .addComponent(btnAnadirPreguntas)
                .addGap(18, 18, 18)
                .addComponent(btnAnadirRespuestas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	/**
	 * 
	 * @param evt 
	 * Este método es el evento del boton añadir usuario que desactiva esta vista y te lleva a la vista para añadir un usuario
	 */
    private void btnAnadirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirUsuarioActionPerformed
        this.setVisible(false);

			java.awt.EventQueue.invokeLater(new Runnable() {
				public void run() {
				new NuevoUsuario().setVisible(true);
			}
		});
    }//GEN-LAST:event_btnAnadirUsuarioActionPerformed

	/**
	 * 
	 * @param evt 
	 * Este método es el evento del boton cerrar que vuelve al inicio de sesion
	 */
    private void btnCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar1ActionPerformed
        this.setVisible(false);

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {

				try {
					new Inicio_sesion().setVisible(true);
				} catch (IOException ex) {
					Logger.getLogger(Vista_administrador.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		});
    }//GEN-LAST:event_btnCerrar1ActionPerformed

	/**
	 * 
	 * @param evt 
	 * Este método es el evento del boton añadir preguntas, desactiva esta vista y te lleva a la vista de añadir preguntas 
	 */
    private void btnAnadirPreguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirPreguntasActionPerformed
        this.setVisible(false);
			
			/* Create and display the form */
			java.awt.EventQueue.invokeLater(new Runnable() {
				public void run() {
				new NuevaPregunta().setVisible(true);
			}
		});
    }//GEN-LAST:event_btnAnadirPreguntasActionPerformed

	/**
	 * 
	 * @param evt 
	 * Este método es el evento del boton añadir ubicacion, desactiva esta vista y te lleva a la vista de añadir ubicacion 
	 */
    private void btnAnadirRespuestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirRespuestasActionPerformed
//        this.setVisible(false);
//			
//			/* Create and display the form */
//			java.awt.EventQueue.invokeLater(new Runnable() {
//				public void run() {
//				new NuevaRespuesta().setVisible(true);
//			}
//		});
    }//GEN-LAST:event_btnAnadirRespuestasActionPerformed

	/**
	 * @param args the command line arguments
	 * el main que inicia esta vista 
	 */
	public static void main(String args[]) {

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Vista_administrador().setVisible(true);
			}
		});
	}
	
/**
 * Declaracion de todos los elementos graficos de esta vista 
 */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnadirPreguntas;
    private javax.swing.JButton btnAnadirRespuestas;
    private javax.swing.JButton btnAnadirUsuario;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnCerrar1;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
