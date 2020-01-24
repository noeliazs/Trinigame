/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import controladores.ControladorPregunta;
import controladores.ControladorTimer;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Noelia,ivan, jorge
 */
public class Vista_pregunta extends javax.swing.JFrame {
	
        private static String nombre;
        private Timer timer;
        private static final int SEGUNDOS = 1000;
	private static final int SEGUNDOSMIN = 0;
        private int contadorSegundos=40;
        private ControladorTimer controladorTimer;
        private ControladorPregunta control;
        private static int contadorPuntos;
	

    /**
     * Creates new form Vista_pregunta
     */
    public Vista_pregunta(int contador,String nombre) throws ParseException {
                contadorPuntos=contador;
                this.nombre=nombre;
                initComponents();
                controladorTimer=new ControladorTimer(this);
                crearTimer();        
                control=new ControladorPregunta(this,nombre);
                btnRespuesta1.addActionListener(control);
                btnRespuesta2.addActionListener(control);
                btnRespuesta3.addActionListener(control);
                btnRespuesta4.addActionListener(control);
                btnRespuesta1.setActionCommand("BOTON1");
                btnRespuesta2.setActionCommand("BOTON2");
                btnRespuesta3.setActionCommand("BOTON3");
                btnRespuesta4.setActionCommand("BOTON4");
                
    }
    
    public String getBoton1(){
        return btnRespuesta1.getText();
    }
    
    public String getBoton2(){
        return btnRespuesta2.getText();
    }
    
    public String getBoton3(){
        return btnRespuesta3.getText();
    }
    
    public String getBoton4(){
        return btnRespuesta4.getText();
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

        btnRespuesta2.setText("Respuesta 2");

        btnRespuesta3.setText("Respuesta 3");

        btnRespuesta4.setText("Respuesta 4");

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

 
    public static void main(String args[]) {

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
    
    
    /**
	 * Creamos el timer
	 */
	public void crearTimer() {
		timer = new Timer(SEGUNDOS,controladorTimer);
		timer.setActionCommand("TIEMPO");
		timer.setRepeats(true);
		timer.start();
	}

	/**
	 * Cada segundo vamos a mandar escribir los segundos que nos quedan
	 */
	public void calcularTimer() {
		if (contadorSegundos > SEGUNDOSMIN) {
			contadorSegundos--;
			txtTiempo.setText(contadorSegundos+"");
		} else {
			timer.stop();
			System.out.println("SE ACABO EL TIEMPO");
                        this.setVisible(false);
                         new Vista_fallo(contadorPuntos).setVisible(true);
                        
		}
	}
        
        public void escribir(String categoria, String pregunta, String nPregunta,int contadorPuntos){
            txtCategoria.setText(categoria);
	    txtPregunta.setText(pregunta);
	    txtNpregunta.setText(nPregunta);
            txtPuntuacion.setText("Puntuacion "+contadorPuntos);
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

    public void escribirRespuestas(ArrayList<String> respuestas) {
             btnRespuesta1.setText(respuestas.get(0));
             btnRespuesta2.setText(respuestas.get(1));
	     btnRespuesta3.setText(respuestas.get(2));
             btnRespuesta4.setText(respuestas.get(3));
    }
}
