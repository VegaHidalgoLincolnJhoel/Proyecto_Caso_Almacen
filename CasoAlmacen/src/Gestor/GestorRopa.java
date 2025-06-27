package Gestor;
import Modelo.Producto;
import java.util.List;
import java.util.stream.Collectors;
/**
 *
 * @author Jeremy
 */
public class GestorRopa extends GestorProductos {

    @Override
    public List<Producto> buscarPorCategoria() {
        return productos.stream()
            .filter(p -> p.getCategoria().getNombre().equalsIgnoreCase("Ropa"))
            .collect(Collectors.toList());
    }

    @Override
    public void registrarProducto(Producto p) {
        if (p.getCategoria().getNombre().equalsIgnoreCase("Ropa")) {
            productos.add(p);
        }
    }
}
