package lab1_tp2_viajes;

public class Viaje {
    private Ciudad origen;
    private Ciudad destino;
    double distancia;
    Vehiculo vehiculo;
    int peaje;

    public Viaje(Ciudad origen, Ciudad destino, Vehiculo vehiculo, int peaje) {
        this.origen = origen;
        this.destino = destino;
        this.vehiculo = vehiculo;
        this.peaje = peaje;
    }

    public Viaje(Ciudad origen, Ciudad destino, double distancia, Vehiculo vehiculo, int peaje) {
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
        this.vehiculo = vehiculo;
        this.peaje = peaje;
    }
    
    public double calcularDistancia(){
        return 0; //simbolico
    }
    
    public double calcularCostPeaje(){
        return 0; //simbolico
    }
    
    public double calcularCostCombus(){
        return 0; //simbolico
    }
    
    public double calcularTotal(){
        return 0; //simbolico
    }
}