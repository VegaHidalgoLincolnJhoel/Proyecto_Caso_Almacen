package Gestor;
import Modelo.Producto;
import java.util.List;
/**
 *
 * @author Jeremy
 */
public abstract class gestor {
    public abstract List<Producto> buscarPorCategoria();
    public abstract void registrarProducto(Producto p);
    public abstract void eliminarProducto(int id);
    public abstract boolean estaEnStock(int id);
}
