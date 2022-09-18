package lab1_tp2_viajes;

public class Ciudad {
     private String nombre;
    private double km;
    private int ruta;

    public Ciudad() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public int getRuta() {
        return ruta;
    }

    public void setRuta(int ruta) {
        this.ruta = ruta;
    }

    @Override
    public String toString() {
        return "Ciudad: " + nombre + ", ruta: " + ruta +  ", km: " + km +'.';
    }
    
    
}
