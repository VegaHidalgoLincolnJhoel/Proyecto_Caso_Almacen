package Vista;

import Modelo.Login;
import javax.swing.*;

public class LoginFrame extends JFrame {

    private JTextField txtUsuario;
    private JPasswordField txtContraseña;
    private JButton btnIngresar;

    public LoginFrame() {
        setTitle("Login - StockMaster");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblUsuario = new JLabel("Usuario:");
        lblUsuario.setBounds(30, 30, 80, 25);
        add(lblUsuario);

        txtUsuario = new JTextField();
        txtUsuario.setBounds(120, 30, 130, 25);
        add(txtUsuario);

        JLabel lblContraseña = new JLabel("Contraseña:");
        lblContraseña.setBounds(30, 70, 80, 25);
        add(lblContraseña);

        txtContraseña = new JPasswordField();
        txtContraseña.setBounds(120, 70, 130, 25);
        add(txtContraseña);

        btnIngresar = new JButton("Ingresar");
        btnIngresar.setBounds(90, 110, 100, 30);
        add(btnIngresar);

        btnIngresar.addActionListener(e -> autenticar());
    }

    private void autenticar() {
        String user = txtUsuario.getText();
        String pass = new String(txtContraseña.getPassword());

        Login login = new Login("POO", "1234");

        if (login.verificarCredenciales(user, pass)) {
            JOptionPane.showMessageDialog(this, "✅ Acceso concedido");
            this.dispose(); // Cierra el login
            new VentanaPrincipal().setVisible(true); // Abre ventana principal
        } else {
            JOptionPane.showMessageDialog(this, "❌ Credenciales incorrectas");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginFrame().setVisible(true));
    }
}
