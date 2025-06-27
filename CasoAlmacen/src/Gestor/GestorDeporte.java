package Gestor;
import Modelo.Producto;
import java.util.List;
import java.util.stream.Collectors;
/**
 *
 * @author Jeremy
 */
public class GestorDeporte extends GestorProductos {

    @Override
    public List<Producto> buscarPorCategoria() {
        return productos.stream()
            .filter(p -> p.getCategoria().getNombre().equalsIgnoreCase("Deporte"))
            .collect(Collectors.toList());
    }

    @Override
    public void registrarProducto(Producto p) {
        if (p.getCategoria().getNombre().equalsIgnoreCase("Deporte")) {
            productos.add(p);
        }
    }
    
}
