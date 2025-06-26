/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    Connection conectar = null;
    String usuario = "admin";
    String contraseña = "root";
    String bd = "Inventario";
    String ip = "localhost";
    String puerto = "1433";

    public Connection establecerConexion() {
        try {
            String cadena = "jdbc:sqlserver://" + ip + ":" + puerto + ";" +
                            "databaseName=" + bd + ";" +
                            "encrypt=true;" +
                            "trustServerCertificate=true;";

            conectar = DriverManager.getConnection(cadena, usuario, contraseña);
            JOptionPane.showMessageDialog(null, "✅ Conectado a la base de datos");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "❌ Error al conectar a la base de datos:\n" + e.toString());
        }
        return conectar;
    }
}
