package Modelo;
import java.time.LocalDateTime;
/**
 *
 * @author Jeremy
 */
public class AuditoriaMovimiento {
    private int id;
    private String usuario;
    private String accion;
    private LocalDateTime fechaHora;
    private int idProducto;

    public AuditoriaMovimiento(int id, String usuario, String accion, int idProducto) {
        this.id = id;
        this.usuario = usuario;
        this.accion = accion;
        this.fechaHora = LocalDateTime.now();
        this.idProducto = idProducto;
    }

    public int getId() { return id; }
    public String getUsuario() { return usuario; }
    public String getAccion() { return accion; }
    public LocalDateTime getFechaHora() { return fechaHora; }
    public int getIdProducto() { return idProducto; }
}
