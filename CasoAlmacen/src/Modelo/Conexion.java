package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private static Connection conectar = null;
    private static boolean yaConectado = false;

    private final String usuario = "admin";
    private final String contraseña = "root2";
    private final String bd = "Inventario";
    private final String ip = "localhost";
    private final String puerto = "1433";

    public Connection establecerConexion() {
        if (conectar != null) {
            return conectar;
        }

        try {
            String cadena = "jdbc:sqlserver://" + ip + ":" + puerto + ";"
                    + "databaseName=" + bd + ";"
                    + "encrypt=true;"
                    + "trustServerCertificate=true;";

            conectar = DriverManager.getConnection(cadena, usuario, contraseña);

            if (!yaConectado) {
                JOptionPane.showMessageDialog(null, "✅ Conectado a la base de datos");
                yaConectado = true;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "❌ Error al conectar a la base de datos:\n" + e.toString());
        }

        return conectar;
    }
}
