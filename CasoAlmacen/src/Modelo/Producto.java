package Modelo;

/**
 *
 * @author Jeremy xd
 */
public class Producto {
    private int id;
    private String nombre;
    private int stock;
    private double precio;
    private Categoria categoria;

    public Producto(int id, String nombre, int stock, double precio, Categoria categoria) {
        this.id = id;
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
        this.categoria = categoria;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public int getStock() { return stock; }
    public double getPrecio() { return precio; }
    public Categoria getCategoria() { return categoria; }

    public void reducirStock(int cantidad) {
        if (stock >= cantidad) stock -= cantidad;
    }

    public void aumentarStock(int cantidad) {
        stock += cantidad;
    }
}
