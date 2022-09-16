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
        return r; 
    }
    
    public double calcularCostPeaje() {
        double valorPeaje = 100.00;
        if (vehiculo instanceof Camion) {
            valorPeaje = (valorPeaje + 50) * peaje;
        } else {
            valorPeaje = valorPeaje * peaje;
        }
        return valorPeaje;
    }
    
   public double calcularCostCombus() {
        if (vehiculo instanceof Auto) {
            Auto au = (Auto) vehiculo;
        } else if (vehiculo instanceof Camioneta) {
            Camioneta neta = (Camioneta) vehiculo;
        } else {
            Camion mion = (Camion) vehiculo;
        }
        if (origen.getRuta() == destino.getRuta()) {
            return calcularDistancia() * vehiculo.calcularCosto();
        } else {
            return vehiculo.calcularCosto() * distancia;
        }

    }
    
    public double calcularTotal(){
         if (origen.getRuta() == destino.getRuta()) {
            return calcularDistancia()+ calcularCostCombus()+calcularCostPeaje();
        } else {
            return distancia+ calcularCostCombus()+calcularCostPeaje();
        }
        
      
    }
}
