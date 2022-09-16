package lab1_tp2_viajes;

public class Camion extends Vehiculo {

    public Camion() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }
    
     public double calcularCosto() {
        double r = 12 * combustible.getPrecio()/100;
        return r; 
    }
    
}
