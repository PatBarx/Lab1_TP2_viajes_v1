
package lab1_tp2_viajes;

public class Camioneta extends Vehiculo{

    public Camioneta() {
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
    

    @Override
    public double calcularCosto() {
        double r = 10 * combustible.getPrecio()/100;
        return r; 
    }
    
}
