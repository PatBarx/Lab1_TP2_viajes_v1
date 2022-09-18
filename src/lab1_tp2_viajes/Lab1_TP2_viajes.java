package lab1_tp2_viajes;

import java.util.Scanner;

/**
 * @author "Equipo 10".
 */
public class Lab1_TP2_viajes {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Viaje viaje = new Viaje();
        System.out.println("Bienvenido al gestor de Viajes:\n*  *  *  - - -   *   - - -  *  *  *");
        System.out.println("Complete según corresponda:");
        System.out.print("1 - Ciudad de ORIGEN: ");
        Ciudad ciudad1 = new Ciudad();
        ciudad1.setNombre(leer.next());

        System.out.print("Ingrese la RUTA en que se encuentra la Ciudad de ORIGEN: \n-RUTA: ");
        ciudad1.setRuta(leer.nextInt());
        System.out.print("Ingrese el *km* en que se encuentra ciudad de ORIGEN \n-KM: ");
        ciudad1.setKm(leer.nextDouble());
        viaje.setOrigen(ciudad1);

        System.out.print("2 - Ciudad de DESTINO: ");
        Ciudad ciudad2 = new Ciudad();
        ciudad2.setNombre(leer.next());
        System.out.print("Ingrese la RUTA en que se encuentra la ciudad de DESTINO: \n-RUTA: ");
        ciudad2.setRuta(leer.nextInt());
        System.out.print("Ingrese el *km* en que se encuentra ciudad de DESTINO \n-KM: ");
        ciudad2.setKm(leer.nextDouble());
        viaje.setDestino(ciudad2);

        System.out.println("Elija un vehiculo");
        System.out.print("Elija la opcion:  \n1 - AUTO.\n2 - CAMIONETA.\n3 - CAMION.\nOpcion: ");
        int x = leer.nextInt();
        switch (x) {
            case 1: {
                Auto auto = new Auto();
                System.out.print("Ingrese la marca del auto: ");
                auto.setMarca(leer.next());
                System.out.print("Ingrese la patente del vehiculo: ");
                auto.setPatente(leer.next());
                System.out.print("Ingrese el combustible que usa el vehiculo: ");
                Combustible combustible = new Combustible();

                combustible.setTipo(leer.next());
                System.out.print("Ingrese el precio del cobustible: ");
                combustible.setPrecio(leer.nextDouble());
                auto.setCombustible(combustible);
                viaje.setVehiculo(auto);
            }
            break;
            case 2: {
                Camioneta camioneta = new Camioneta();
                System.out.print("Ingrese la marca de la camioneta: ");
                camioneta.setMarca(leer.next());
                System.out.print("Ingrese la patente del vehiculo: ");
                camioneta.setPatente(leer.next());
                System.out.print("Ingrese el combustible que usa el vehiculo: ");
                Combustible combustible = new Combustible();

                combustible.setTipo(leer.next());
                System.out.print("Ingrese el precio del cobustible: ");
                combustible.setPrecio(leer.nextDouble());
                camioneta.setCombustible(combustible);
                viaje.setVehiculo(camioneta);
            }
            break;
            case 3: {
                Camion camion = new Camion();
                System.out.print("Ingrese la marca del camion:");
                camion.setMarca(leer.next());
                System.out.print("Ingrese la patente del vehiculo:");
                camion.setPatente(leer.next());
                System.out.print("Ingrese el tipo de combustible que usa el vehiculo:");
                Combustible combustible = new Combustible();

                combustible.setTipo(leer.next());
                System.out.print("Ingrese el precio del cobustible: $");
                combustible.setPrecio(leer.nextDouble());
                camion.setCombustible(combustible);
                viaje.setVehiculo(camion);
            }
            break;
            default:
                System.out.println("Usted no eligio una opcion valida\n - - - -  - - - - - -  - - - ");
                ;
        }
        if(viaje.getOrigen().getRuta() != viaje.getDestino().getRuta()){
            System.out.print("***Las ciudades *NO* se encuentran sobre la misma ruta ***"
                    + "\nIngrese la distancia a recorrer en KM: ");
                viaje.setDistancia(leer.nextDouble());
        } 
        //***Con el If de Arriba le ahorramos al User la eleccion de rutas igual o diferente
        /*
        System.out.println("*** Si las ciudades *NO* se encuentran en la misma ruta ***");
        System.out.println("Ingrese 1. En otro caso, ingrese otro numero");
        int a = leer.nextInt();
        switch (a) {
            case 1: {
                System.out.print("Ingrese la distancia a recorrer en KM: ");
                viaje.setDistancia(leer.nextDouble());
            }
            break;
            default:
                break;
        }*/
        System.out.print("Ingrese la cantidad de peajes: ");
        viaje.setPeaje(leer.nextInt());
        System.out.println("* - - - - - - - - - - - - - - - - - - - - *\nInformacion de su viaje:");
        System.out.println("El vehiculo " + viaje.getVehiculo());
        System.out.println("Origen: "+viaje.getOrigen());
        System.out.println("Destino: "+viaje.getDestino());
        System.out.println("La distancia recorrida es: " + viaje.calcularDistancia());
        System.out.println("Costo de peajes " + viaje.calcularCostPeaje());
        System.out.println("Costo de combustible " + (viaje.calcularCostCombus()));
        System.out.println("\nCosto total del viaje " + viaje.calcularTotal());

    }

}
