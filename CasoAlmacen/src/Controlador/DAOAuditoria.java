/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.sql.*;
import Modelo.Conexion;
import Modelo.AuditoriaMovimiento;
import javax.swing.JOptionPane;


/**
 *
 * @author Sofia
 */
public class DAOAuditoria {

    Connection cn;
    Conexion con = new Conexion();
    PreparedStatement stmt;
    ResultSet rs;

    public boolean insertar(AuditoriaMovimiento c) {
        String SQL = "insert into AuditoriaMovimientos (Categoria ,tipo_de_movimiento) VALUES (?,?)";
        try {
            cn = con.establecerConexion();
            stmt = cn.prepareStatement(SQL);
            stmt.setString(1, c.getTipo());
            stmt.setString(2, c.getMovimiento());
            int n = stmt.executeUpdate();
            if(n!= 0){
                return true;
            }else {
                return false;
            }
            
        } catch (Exception e){
           JOptionPane.showConfirmDialog(null, e);
           return false;
        }
    }
}
