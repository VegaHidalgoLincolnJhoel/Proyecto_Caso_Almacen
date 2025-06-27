package CRUD;
import DAO.ProductoDAO;
import Modelo.Categoria;
import Modelo.Producto;

import java.util.List;
/**
 *
 * @author Jeremy
 */
public class PruebaCRUD {
    public static void main(String[] args) {
        ProductoDAO dao = new ProductoDAO();

        List<Producto> productos = dao.obtenerTodos();
        productos.forEach(p -> System.out.println(p.getId() + " - " + p.getNombre() + " - " + p.getCategoria()));

        Categoria cat = new Categoria(1, "Ropa");
        Producto nuevo = new Producto(999999, "Gorra Adidas", 10, 19.99, cat);
        dao.insertar(nuevo);

        nuevo.aumentarStock(5);
        dao.actualizar(nuevo);

        dao.eliminar(999999);
    }
}
