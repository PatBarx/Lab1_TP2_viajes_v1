package lab1_tp2_viajes;

public class Viaje {
    private Ciudad origen;
    private Ciudad destino;
    double distancia;
    Vehiculo vehiculo;
    int peaje;

    public Viaje() {
    }
    

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

    public Ciudad getOrigen() {
        return origen;
    }

    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    public Ciudad getDestino() {
        return destino;
    }

    public void setDestino(Ciudad destino) {
        this.destino = destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getPeaje() {
        return peaje;
    }

    public void setPeaje(int peaje) {
        this.peaje = peaje;
    }

    @Override
    public String toString() {
        return "Viaje{" + "origen=" + origen + ", destino=" + destino + ", distancia=" + distancia + ", vehiculo=" + vehiculo + ", peaje=" + peaje + '}';
    }
    
    public double calcularDistancia(){
        double r=0;
        if (origen.getRuta()==destino.getRuta()){
        r= origen.getKm()-destino.getKm();
        distancia= Math.abs(r);
        } else {
            r=distancia;
        }        
        // if(r<0){ r=r *(-1);
        return Math.abs(r); 
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
//       
//        if (vehiculo instanceof Auto) {
//             Auto au=(Auto)vehiculo;
//        } else if (vehiculo instanceof Camioneta) {
//            Camioneta neta = (Camioneta) vehiculo;
//        } else {
//            Camion mion = (Camion) vehiculo;
//        }
//      
//          return distancia*vehiculo.calcularCosto() ;
            double r=     vehiculo.calcularCosto()*distancia;

     return r;

           }
    
    public double calcularTotal(){
         
            return calcularCostCombus()+calcularCostPeaje();
        }       
      
    }

