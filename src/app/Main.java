package app;

import model.Guia;
import model.Rut;
import util.RutInvalidoException;
import model.Cliente;
import model.Tour;


public class Main {
    public static void main (String[] args){


        try{

            //Cliente 1
            Rut rut1 = new Rut("12345478-k");
            Rut rut2 = new Rut("19446723-4");
            Guia guia1 = new Guia("Juan David", 36, "Los aventureros", "Senderismo", rut2);
            Tour tour = new Tour("Los aventureros", "Trekking",20);


            //Cliente 2
            Rut rut3 = new Rut("19443527-7");
            Rut rut4 = new Rut("18455712-6");
            Guia guia2 = new Guia("Esteban Pino", 42, "Los ulmos","Escalada", rut4);
            Tour tour2 = new Tour("Los aventureros", "Trekking",20);




            Cliente cliente1 = new Cliente ("Misael Riveros", 30, "Los florines #673", rut1, guia1, tour);
            Cliente cliente2 = new Cliente("Luis Hernandez", 25, "Pto madero #482", rut3, guia2, tour);

            System.out.println(cliente1.toString());
            System.out.println(cliente2.toString());


            tour.agregarCliente(cliente1);
            tour.agregarCliente(cliente2);





        }catch (RutInvalidoException e){

            System.out.println(e.getMessage());

        }




    }
}
