package Modelo;

/**
 *
 * @author Jeremy
 */
public class Login {
    private String usuario;
    private String contraseña;

    public Login(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getUsuario() { return usuario; }
    public String getContraseña() { return contraseña; }

    public boolean verificarCredenciales(String user, String pass) {
        return this.usuario.equals(user) && this.contraseña.equals(pass);
    }
}
