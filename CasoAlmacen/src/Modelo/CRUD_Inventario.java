/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author linco
 */
public class CRUD_Inventario {

    //Mostrar la tabla Ropa
    public void mostrarTablaRopa(JTable paramTablaMostrar) {
        Conexion link = new Conexion();

        DefaultTableModel modelo = new DefaultTableModel();

        String sql = "";
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Stock");
        modelo.addColumn("Precio/unidad");
        modelo.addColumn("Categoria");

        paramTablaMostrar.setModel(modelo);
        //añadir los elementos del menu

        sql = "select * from Ropa";

        String[] datos = new String[5];

        Statement st;

        try {
            st = link.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);

                modelo.addRow(datos);
            }
            paramTablaMostrar.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostar los registros\n" + "Error: " + e.toString());
        }
    }

    //Mostrar la tabla Deporte
    public void mostrarTablaDeporte(JTable paramTablaMostrar) {
        Conexion link = new Conexion();

        DefaultTableModel modelo = new DefaultTableModel();

        String sql = "";
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Stock");
        modelo.addColumn("Precio/unidad");
        modelo.addColumn("Categoria");

        paramTablaMostrar.setModel(modelo);
        //añadir los elementos del menu

        sql = "select * from Deporte";

        String[] datos = new String[5];

        Statement st;

        try {
            st = link.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);

                modelo.addRow(datos);
            }
            paramTablaMostrar.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostar los registros\n" + "Error: " + e.toString());
        }
    }

    //Mostrar la tabla Electronico
    public void mostrarTablaElectronico(JTable paramTablaMostrar) {
        Conexion link = new Conexion();

        DefaultTableModel modelo = new DefaultTableModel();

        String sql = "";
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Stock");
        modelo.addColumn("Precio/unidad");
        modelo.addColumn("Categoria");

        paramTablaMostrar.setModel(modelo);
        //añadir los elementos del menu

        sql = "select * from Electronico";

        String[] datos = new String[5];

        Statement st;

        try {
            st = link.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);

                modelo.addRow(datos);
            }
            paramTablaMostrar.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostar los registros\n" + "Error: " + e.toString());
        }
    }

    //Mostrar la tabla Alimentos
    public void mostrarTablaAlimentos(JTable paramTablaMostrar) {
        Conexion link = new Conexion();

        DefaultTableModel modelo = new DefaultTableModel();

        String sql = "";
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Stock");
        modelo.addColumn("Precio/unidad");
        modelo.addColumn("Categoria");

        paramTablaMostrar.setModel(modelo);
        //añadir los elementos del menu

        sql = "select * from Alimentos";

        String[] datos = new String[5];

        Statement st;

        try {
            st = link.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);

                modelo.addRow(datos);
            }
            paramTablaMostrar.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostar los registros\n" + "Error: " + e.toString());
        }
    }

    //Mostrar la tabla Limpieza
    public void mostrarTablaLimpieza(JTable paramTablaMostrar) {
        Conexion link = new Conexion();

        DefaultTableModel modelo = new DefaultTableModel();

        String sql = "";
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Stock");
        modelo.addColumn("Precio/unidad");
        modelo.addColumn("Categoria");

        paramTablaMostrar.setModel(modelo);
        //añadir los elementos del menu

        sql = "select * from Limpieza";

        String[] datos = new String[5];

        Statement st;

        try {
            st = link.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);

                modelo.addRow(datos);
            }
            paramTablaMostrar.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostar los registros\n" + "Error: " + e.toString());
        }
    }

    public void SeleccionarElemento(JTable paramTablaMostrar, JTextField paramID, JTextField paramNombre,
            JTextField paramStock, JTextField paramPrecioUnidad, JTextField paramCategoria) {
        try {
            int fila = paramTablaMostrar.getSelectedRow();

            if (fila >= 0) {
                paramID.setText(paramTablaMostrar.getValueAt(fila, 0).toString());
                paramNombre.setText(paramTablaMostrar.getValueAt(fila, 1).toString());
                paramStock.setText(paramTablaMostrar.getValueAt(fila, 2).toString());
                paramPrecioUnidad.setText(paramTablaMostrar.getValueAt(fila, 3).toString());
                paramCategoria.setText(paramTablaMostrar.getValueAt(fila, 4).toString());
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo sleccionar los registros");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de seleccion \n" + "Error: " + e.toString());
        }
    }

    public boolean actualizarRegistro(String nombreTabla, JTextField jTextID, JTextField jTextNombre, JTextField jTextStock, JTextField jTextPrecioUnid, JTextField jTextCategoria) {
        Conexion link = new Conexion();

        String id = jTextID.getText();
        String nombre = jTextNombre.getText();
        String stock = jTextStock.getText();
        String precioUnidad = jTextPrecioUnid.getText();
        String categoria = jTextCategoria.getText();

        // Validación básica
        if (nombreTabla == null || nombreTabla.isEmpty()) {
            JOptionPane.showMessageDialog(null, "❌ No se ha seleccionado ninguna tabla.");
        }

        String campoID = "id_" + nombreTabla.toLowerCase();

        // Determinar el campo ID según la tabla
        switch (nombreTabla.toLowerCase()) {
            case "ropa":
                campoID = "id_ropa";
                break;
            case "alimentos":
                campoID = "id_alimento";
                break;
            case "deporte":
                campoID = "id_deporte";
                break;
            case "tecnologia":
                campoID = "id_electronico";
                break;
            case "limpieza":
                campoID = "id_limpieza";
                break;
            default:
                JOptionPane.showMessageDialog(null, "❌ Tabla no reconocida: " + nombreTabla);
        }

        // Consulta SQL personalizada
        String sql = "UPDATE " + nombreTabla + " SET "
                + "nombre = '" + nombre + "', "
                + "stock = '" + stock + "', "
                + "precio_unitario = '" + precioUnidad + "', "
                + "id_categoria = '" + categoria + "' "
                + "WHERE " + campoID + " = '" + id + "'";

        try {
            Statement st = link.establecerConexion().createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "✅ Registro actualizado correctamente en la tabla " + nombreTabla);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "❌ Error al actualizar el registro:\n" + e.toString());
        }
        return false;
    }

    public void InsertarRegistro(String nombreTabla, JTextField jTextID, JTextField jTextNombre,
            JTextField jTextStock, JTextField jTextPrecioUnid, JTextField jTextCategoria) {
        Conexion link = new Conexion();

        String id = jTextID.getText();
        String nombre = jTextNombre.getText();
        String stock = jTextStock.getText();
        String precioUnidad = jTextPrecioUnid.getText();
        String categoria = jTextCategoria.getText();

        if (nombreTabla == null || nombreTabla.isEmpty()) {
            JOptionPane.showMessageDialog(null, "❌ No se ha seleccionado ninguna tabla.");
            return;
        }

        // Determinar el campo ID según la tabla
        String campoID = "id_" + nombreTabla.toLowerCase();

        switch (nombreTabla.toLowerCase()) {
            case "ropa":
                campoID = "id_ropa";
                break;
            case "alimentos":
                campoID = "id_alimento";
                break;
            case "deporte":
                campoID = "id_deporte";
                break;
            case "tecnologia":
                campoID = "id_electronico";
                break;
            case "limpieza":
                campoID = "id_limpieza";
                break;
            default:
                JOptionPane.showMessageDialog(null, "❌ Tabla no reconocida: " + nombreTabla);
        }
        // Armar sentencia SQL con placeholders (?)
        String sql = "INSERT INTO " + nombreTabla
                + " (" + campoID + ", nombre, stock, precio_unitario, id_categoria) VALUES (?, ?, ?, ?, ?)";

        try {
            PreparedStatement pst = link.establecerConexion().prepareStatement(sql);
            pst.setInt(1, Integer.parseInt(id));            // id
            pst.setString(2, nombre);                       // nombre
            pst.setInt(3, Integer.parseInt(stock));         // stock
            pst.setDouble(4, Double.parseDouble(precioUnidad)); // precio_unidad
            pst.setString(5, categoria);                    // categoria

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "✅ Registro insertado correctamente en la tabla " + nombreTabla);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "❌ Error al insertar:\n" + e.toString());
        }
    }
    
        public boolean EliminarRegistro(String nombreTabla, JTextField jTextID) {
        Conexion link = new Conexion();

        String id = jTextID.getText();

        // Validación básica
        if (nombreTabla == null || nombreTabla.isEmpty()) {
            JOptionPane.showMessageDialog(null, "❌ No se ha seleccionado ninguna tabla.");
        }

        String campoID = "id_" + nombreTabla.toLowerCase();

        // Determinar el campo ID según la tabla
        switch (nombreTabla.toLowerCase()) {
            case "ropa":
                campoID = "id_ropa";
                break;
            case "alimentos":
                campoID = "id_alimento";
                break;
            case "deporte":
                campoID = "id_deporte";
                break;
            case "tecnologia":
                campoID = "id_electronico";
                break;
            case "limpieza":
                campoID = "id_limpieza";
                break;
            default:
                JOptionPane.showMessageDialog(null, "❌ Tabla no reconocida: " + nombreTabla);
        }

        // Consulta SQL personalizada
        String sql = "DELETE FROM " + nombreTabla + "WHERE " + campoID + " = '" + id + "'";

        try {
            Statement st = link.establecerConexion().createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "✅ Registro Eliminado correctamente en la tabla " + nombreTabla);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "❌ Error al Eliminar el registro:\n" + e.toString());
        }
        return false;
    }

}
