package Gestor;
import Modelo.Producto;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Jeremy
 */
public abstract class GestorProductos extends gestor {
    protected List<Producto> productos = new ArrayList<>();

    @Override
    public boolean estaEnStock(int id) {
        return productos.stream().anyMatch(p -> p.getId() == id && p.getStock() > 0);
    }

    @Override
    public void eliminarProducto(int id) {
        productos.removeIf(p -> p.getId() == id);
    }
}