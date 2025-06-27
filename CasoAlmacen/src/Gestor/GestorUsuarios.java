package Gestor;
import Modelo.Login;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Jeremy
 */
public class GestorUsuarios {
    private List<Login> usuarios = new ArrayList<>();

    public void registrarUsuario(Login l) {
        usuarios.add(l);
    }

    public boolean verificarUsuario(String usuario, String contraseña) {
        return usuarios.stream()
            .anyMatch(u -> u.getUsuario().equals(usuario) && u.getContraseña().equals(contraseña));
    }
}
