package Modelo;

/**
 *
 * @author Jeremy
 */
public class Movimiento {
    private int id;
    private Producto producto;
    private int cantidad;
    private String tipoMovimiento; 
    private int stockFinal;

    public Movimiento(int id, Producto producto, int cantidad, String tipoMovimiento, int stockFinal) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
        this.tipoMovimiento = tipoMovimiento;
        this.stockFinal = stockFinal;
    }

    public int getId() { return id; }
    public Producto getProducto() { return producto; }
    public int getCantidad() { return cantidad; }
    public String getTipoMovimiento() { return tipoMovimiento; }
    public int getStockFinal() { return stockFinal; }
}
