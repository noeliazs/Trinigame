package Interfaces;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Jorge Martin Zaballos PRUEBAAAAAAAAAAAAAAAAAAAAAAAAAAA
 */
public class Inicio_sesion extends javax.swing.JFrame {

	private String usuario;
	private String password;	
	private String valorNombre;


	/**
	 * Constructor de esta vista inicia los componentes se le añade una localizacion
	 */
	public Inicio_sesion() throws IOException {
		initComponents();
		this.setLocation(700, 250);
		asignarRecordado();
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inicio de sesion");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));

        btnCerrar.setText("CERRAR");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnEntrar.setText("ENTRAR");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

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
                .addGap(34, 34, 34)
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
	 *
	 * @param evt Este método es el evento del boton entrar y envia una peticion al servidor para comprobar si el usuario y la clave estan registrados en la BD
	 */
    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
		comprobarIngreso();
    }//GEN-LAST:event_btnEntrarActionPerformed

	/**
	 *
	 * @param evt Este método es el evento del boton cerrar y cierra todo el sistema
	 */
    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
		System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

	/**
	 * Este método es el que se llama desde el boton entrar y pregunta al servidor si estan esos datos guardados en la BD el servidor 
	 * devuelve un Json con los datos si estan en la BD, de esos datos comprobamos si el usuario es admin o usuario normal 
	 * en caso de admin va a vista administrador en caso de ser usuario normal pasa a la vista de seleccionar ubicacion
	 * en caso de no estar registrado muestra mensaje de usuario no registrado 
	 */
	public void comprobarIngreso() {
		usuario = txtUsuario.getText().toString();
		password = txtContraseña.getText().toString();

		URL url;
		try {
			// Creando un objeto URL
			url = new URL("http://localhost/servidor/public/usuario/" + usuario + "/" + password + "/");  

			// Realizando la petición GET
			URLConnection con = url.openConnection();

			// Leyendo el resultado
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

			String linea;
			linea = in.readLine();
			//System.out.println(linea);

			JSONParser parser = new JSONParser();
			Object obj = parser.parse(linea);
			JSONArray json = (JSONArray) obj;
			noRegistrado();
			JSONObject object = (JSONObject) json.get(0);
			valorNombre = object.get("nombre").toString();
			
			
			
			 if(valorNombre.equals("admin")) {
				 System.out.println("ENTRAMOS ADMINISTRADOR");
//				guardarRecordado();
//				this.setVisible(false);
//				
//				java.awt.EventQueue.invokeLater(new Runnable() {
//					public void run() {
//						new Vista_administrador().setVisible(true);
//					}
//				});
			}else{
				guardarRecordado();
				System.out.println("ENTRAMOS USUARIO");
//				this.setVisible(false);
//
//				java.awt.EventQueue.invokeLater(new Runnable() {
//					public void run() {
//						try {
//							new Vista_ubicacion(valorNombre).setVisible(true);
//							//System.out.println(valorNombre);
//						} catch (ParseException ex) {
//							Logger.getLogger(Inicio_sesion.class.getName()).log(Level.SEVERE, null, ex);
//						}
//					}
//				});
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ParseException ex) {
			Logger.getLogger(Inicio_sesion.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	/**
	 * este metodo manda peticion al servidor y comprueba si el usuario esta registrado o no 
	 * si no esta en la BD lanza mensaje de usuario no registrado
	 */
	public void noRegistrado(){
		usuario = txtUsuario.getText().toString();
		password = txtContraseña.getText().toString();

		URL url;
		try {
			// Creando un objeto URL
			url = new URL("http://localhost/TriniGame/public/usuario/" + usuario + "/" + password + "/");

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
			
			System.out.println(linea.length() + "siiiiiii");
			
			
			if (linea.length() == 2) {

					System.out.println("Usuario no registrado ");
					JOptionPane.showMessageDialog(null, "Usuario no registrado");

			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ParseException ex) {
			Logger.getLogger(Inicio_sesion.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
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
					new Inicio_sesion().setVisible(true);
				} catch (IOException ex) {
					Logger.getLogger(Inicio_sesion.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		});
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField txtContraseña;
    public static javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
