package Interfaces;

import controladores.ControladorInicioSesion;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jorge,Ivan y Noelia
 */
public class Vista_inicio_sesion extends javax.swing.JFrame {

	private String usuario;
	private String password;	
        private ControladorInicioSesion controlador;


	/**
	 * Constructor de esta vista inicia los componentes se le añade una localizacion
	 */
	public Vista_inicio_sesion() throws IOException {
		initComponents();
                controlador=new ControladorInicioSesion(this);
                btnEntrar.addActionListener(controlador);
                btnEntrar.setActionCommand("ENTRAR");
                btnCerrar.setActionCommand("SALIR");
                btnCerrar.addActionListener(controlador);  
		this.setLocation(700, 250);
		asignarRecordado();
	}
        
        public String getNombre(){
            usuario = txtUsuario.getText().toString();
            return usuario;
        }
        
        public String getPassword(){
            password = txtContraseña.getText().toString();
            return password;
        }

	/**
	 * Este método se llama desde el constructor para inicializar el formulario.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        btnEntrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        checkRecordar = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de sesion");

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBackground(new java.awt.Color(116, 194, 225));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inicio de sesion");

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
                .addGap(29, 29, 29))
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

        btnEntrar.setText("ENTRAR");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(183, Short.MAX_VALUE)
                .addComponent(btnEntrar)
                .addGap(18, 18, 18)
                .addComponent(btnCerrar)
                .addGap(46, 46, 46))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrar)
                    .addComponent(btnEntrar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        jLabel2.setText("Usuario : ");

        jLabel3.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        jLabel3.setText("Contraseña :");

        txtContraseña.setToolTipText("");

        checkRecordar.setText("Recordar datos acceso");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(txtContraseña)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(checkRecordar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(checkRecordar)
                .addGap(18, 18, 18)
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
	 * este metodo guarda en un fichero los datos del usuario cuando marca el check de recordar datos 
	 * @throws IOException 
	 */
	public void guardarRecordado() throws IOException{
		usuario = txtUsuario.getText().toString();
		password = txtContraseña.getText().toString();
		
		if(checkRecordar.isSelected()){
			PrintWriter pw = new PrintWriter(new FileWriter("usuarios.txt"));
			pw.println(usuario+"-"+password);
			pw.close();
		}
		
	}
	
	/**
	 * este metodo asigna los datos del ultimo usuario que ha accedido y ha marcado el check de recordar datos en este equipo
	 * @throws FileNotFoundException
	 * @throws IOException 
	 */
	public void asignarRecordado() throws FileNotFoundException, IOException{
            FileReader fr = new FileReader("usuarios.txt");
            BufferedReader lector = new BufferedReader(fr);
            String datos = lector.readLine();
            System.out.println(datos);
            String[] separar = datos.split("-");
            txtUsuario.setText(separar[0]);
            txtContraseña.setText(separar[1]);
            fr.close();

	}
	
	/**
	 * @param args the command line arguments el main que inicia esta vista
	 */
	public static void main(String args[]) {

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Vista_inicio_sesion().setVisible(true);
				} catch (IOException ex) {
					Logger.getLogger(Vista_inicio_sesion.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		});
	}
        
        public void quitarVista() {
             this.setVisible(false);
        }
	/**
	 * Declaracion de todos los elementos graficos de esta vista
	 */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JCheckBox checkRecordar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField txtContraseña;
    public static javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    
}
