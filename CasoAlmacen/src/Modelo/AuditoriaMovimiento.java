package Modelo;

public class AuditoriaMovimiento {
   private int id;
   private String tipo;
   private String movimiento;

    public AuditoriaMovimiento() {
    }

   
    public AuditoriaMovimiento(int id, String tipo, String movimiento) {
        this.id = id;
        this.tipo = tipo;
        this.movimiento = movimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }
}
    
