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
        double r=0;
        if (origen.getRuta()==destino.getRuta()){
        r= origen.getKm()-destino.getKm();}
        if(r<0){ r=r *(-1);}
        return r; //simbolico
    }
    
    public double calcularCostPeaje(){
        double valorPeaje = 100.00; 
        if (vehiculo  instanceof Auto ){
            valorPeaje = valorPeaje * peaje; 
            } else {
            valorPeaje = (valorPeaje + 50) * peaje;
        }
        
        return valorPeaje;
    }
    
    public double calcularCostCombus(){
        return 0; //simbolico
    }
    
    public double calcularTotal(){
        return 0; //simbolico
    }
}
