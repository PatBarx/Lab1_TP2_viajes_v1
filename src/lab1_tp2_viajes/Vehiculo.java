package lab1_tp2_viajes;

public abstract class Vehiculo {
    protected String marca,patente;
    protected Combustible combustible;

    public Vehiculo() {
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
    public String toString() {
        return ": " + "marca=" + marca + ", patente=" + patente + ", combustible=" + combustible + '.';
    }
    
    public abstract double calcularCosto();
}
