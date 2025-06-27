package Inventario;
import Modelo.Login;
import java.util.Scanner;

/**
 *
 * @author Jeremy
 */
public class InventarioApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== INICIO DE SESION ===");
        System.out.print("Usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Contrasena: ");
        String contraseña = scanner.nextLine();

        Login login = new Login("POO", "1234");

        if (login.verificarCredenciales(usuario, contraseña)) {
            System.out.println("Sesion iniciada correctamente.\n");
            mostrarMenu();
        } else {
            System.out.println("Usuario o contraseña incorrectos.");
        }

        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("===== MENU PRINCIPAL =====");
        System.out.println("1. Gestion de Productos");
        System.out.println("2. Movimientos de Inventario");
        System.out.println("3. Gestion de Usuarios");
        System.out.println("4. Ver Auditoria");
        System.out.println("0. Salir");
    }
}
