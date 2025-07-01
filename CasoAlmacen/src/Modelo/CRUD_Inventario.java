/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author linco
 */
public class CRUD_Inventario {

    public void mostrarTabla(JTable paramTablaMostrar) {
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
}
