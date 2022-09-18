package lab1_tp2_viajes;

public class Auto extends Vehiculo{

    public Auto() {
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
        double r = 7 * combustible.getPrecio()/100;
        return r;
    }

//    @Override
//    public String toString() {
//        return "Auto: " + '}';
//    }
     
    
    
}
