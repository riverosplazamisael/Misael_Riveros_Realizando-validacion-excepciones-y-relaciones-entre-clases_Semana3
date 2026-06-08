package model;
import model.Rut;
import model.Guia;
import model.Tour;



public class Cliente {

    //ATRIBUTOS
    private String nombre;
    private int edad;
    private String direccion;
    private Rut rut;
    private Guia guia;
    private Tour tour;




   //CONSTRUCTOR CLIENTE----
    public Cliente(String nombre, int edad, String direccion, Rut rut, Guia guia, Tour tour) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.rut = rut;
        this.guia = guia;
        this.tour = tour;




    }

//GETTER Y SETTER----
    public String getNombre() {

        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {

        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


        public Rut getRut () {
            return rut;
        }

            public void setRut(Rut rut){
                this.rut = rut;

            }

    public Guia getGuia() {
        return guia;
    }

    public void setGuia(Guia guia) {
        this.guia = guia;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    //TOSTRING-----
    @Override
    public String toString() {
        return "--Cliente--\n" +
                "nombre: " + nombre + "\n" +
                "Rut: " + rut + "\n" +
                "direccion: " + direccion + "\n" +
                "edad: " + edad + "\n" + "\n" +
                 guia + "\n" +
                tour + "\n" ;

    }
}
