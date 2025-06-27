package DAO;

import Modelo.Conexion;
import Modelo.Categoria;
import Modelo.Producto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jeremy
 */
public class ProductoDAO {

    public List<Producto> obtenerTodos() {
        List<Producto> productos = new ArrayList<>();

        String sql = "SELECT p.id_producto, p.nombre, p.stock, p.precio, c.id_categoria, c.nombre_categoria " +
                     "FROM Producto p JOIN Categorias c ON p.id_categoria = c.id_categoria";

        Conexion conexion = new Conexion(); // ✅ Instancia obligatoria

        try (Connection conn = conexion.establecerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id_producto");
                String nombre = rs.getString("nombre");
                int stock = rs.getInt("stock");
                double precio = rs.getDouble("precio");
                int idCat = rs.getInt("id_categoria");
                String nombreCat = rs.getString("nombre_categoria");

                Categoria categoria = new Categoria(idCat, nombreCat);
                Producto producto = new Producto(id, nombre, stock, precio, categoria);
                productos.add(producto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return productos;
    }

    public boolean insertar(Producto p) {
        String sql = "INSERT INTO Producto (id_producto, nombre, stock, precio, id_categoria) VALUES (?, ?, ?, ?, ?)";

        Conexion conexion = new Conexion(); // ✅ Instancia obligatoria

        try (Connection conn = conexion.establecerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, p.getId());
            stmt.setString(2, p.getNombre());
            stmt.setInt(3, p.getStock());
            stmt.setDouble(4, p.getPrecio());
            stmt.setInt(5, p.getCategoria().getId());

            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean actualizar(Producto p) {
        String sql = "UPDATE Producto SET nombre = ?, stock = ?, precio = ?, id_categoria = ? WHERE id_producto = ?";

        Conexion conexion = new Conexion(); // ✅ Instancia obligatoria

        try (Connection conn = conexion.establecerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, p.getNombre());
            stmt.setInt(2, p.getStock());
            stmt.setDouble(3, p.getPrecio());
            stmt.setInt(4, p.getCategoria().getId());
            stmt.setInt(5, p.getId());

            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean eliminar(int id) {
        String sql = "DELETE FROM Producto WHERE id_producto = ?";

        Conexion conexion = new Conexion(); // ✅ Instancia obligatoria

        try (Connection conn = conexion.establecerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
