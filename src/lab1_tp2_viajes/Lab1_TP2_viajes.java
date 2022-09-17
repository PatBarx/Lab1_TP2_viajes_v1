package lab1_tp2_viajes;

import java.util.Scanner;

/**
 * @author "Equipo 10".
 */
public class Lab1_TP2_viajes {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //instanciar Viaje en auto San Luis (RN7) --> Mercedes (RN 7)(Nafta)
        //instanciar VIaje en camioneta Naschel (RN141) ---> Villa Dolores (RN141)(GNC)
        Viaje viaje = new Viaje();

        System.out.println("elija la opcion para");
        System.out.println("1:elija ciudad de origen");
        Ciudad ciudad1 = new Ciudad();
        ciudad1.setNombre(leer.next());

        System.out.println("ingrese la ruta en que se encuentra la ciudad de origen");
        ciudad1.setRuta(leer.nextInt());
        System.out.println("ingrese el km en que se encuentra ciudad de origen");
        ciudad1.setKm(leer.nextDouble());
        viaje.setOrigen(ciudad1);

        System.out.println("2:elija ciudad de destino");
        Ciudad ciudad2 = new Ciudad();
        ciudad2.setNombre(leer.next());
        System.out.println("ingrese la ruta en que se encuentra la ciudad de destino");
        ciudad2.setRuta(leer.nextInt());
        System.out.println("ingrese el km en que se encuentra ciudad de destino");
        ciudad2.setKm(leer.nextDouble());
        viaje.setDestino(ciudad2);

        System.out.println("Elija un vehiculo");
        System.out.println("Elija :  1:auto, 2:camineta, 3:camion");
        int x = leer.nextInt();
        switch (x) {
            case 1: {
                Auto auto = new Auto();
                System.out.println("ingrese la marca del auto");
                auto.setMarca(leer.next());
                System.out.println("ingrese la patente del vehiculo");
                auto.setPatente(leer.next());
                System.out.println("ingrese el combustible que usa el vehiculo");
                Combustible combustible = new Combustible();

                combustible.setTipo(leer.next());
                System.out.println("ingrese el precio del cobustible");
                combustible.setPrecio(leer.nextDouble());
                auto.setCombustible(combustible);
                viaje.setVehiculo(auto);
            }
            break;
            case 2: {
                Camioneta camioneta = new Camioneta();
                System.out.println("ingrese la marca de la camioneta");
                camioneta.setMarca(leer.next());
                System.out.println("ingrese la patente del vehiculo");
                camioneta.setPatente(leer.next());
                System.out.println("ingrese el combustible que usa el vehiculo");
                Combustible combustible = new Combustible();

                combustible.setTipo(leer.next());
                System.out.println("ingrese el precio del cobustible");
                combustible.setPrecio(leer.nextDouble());
                camioneta.setCombustible(combustible);
                viaje.setVehiculo(camioneta);
            }
            break;
            case 3: {
                Camion camion = new Camion();
                System.out.println("ingrese la marca del camion");
                camion.setMarca(leer.next());
                System.out.println("ingrese la patente del vehiculo");
                camion.setPatente(leer.next());
                System.out.println("ingrese el combustible que usa el vehiculo");
                Combustible combustible = new Combustible();

                combustible.setTipo(leer.next());
                System.out.println("ingrese el precio del cobustible");
                combustible.setPrecio(leer.nextDouble());
                camion.setCombustible(combustible);
                viaje.setVehiculo(camion);
            }
            break;
            default:
                System.out.println("usted no eligio una opcion valida");
                ;
        }
        System.out.println("en el caso de que las ciudades no se encuentren en la misma ruta ");
        System.out.println("ingrese 1 en otro caso otro numero");
        int a = leer.nextInt();
        switch (a) {
            case 1: {
                System.out.println("ingrese la distancia a recorrer");
                viaje.setDistancia(leer.nextDouble());
            }

            break;

            default:
                break;
        }

        System.out.println("Ingrese la cantidad de peajes");
        viaje.setPeaje(leer.nextInt());
        System.out.println("el vehiculo"+viaje.getVehiculo());
        System.out.println("el origen"+viaje.getOrigen());
        System.out.println("el destino"+viaje.getDestino());
        System.out.println("la distancia recorrida es :" + viaje.calcularDistancia());
        System.out.println("costo de peajes " + viaje.calcularCostPeaje());
        System.out.println("costo de combustible " + (viaje.calcularCostCombus()));
        System.out.println("el costo total del viaje " + viaje.calcularTotal());

    }

}
