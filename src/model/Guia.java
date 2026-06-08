package model;



public class Guia {


     //ATRIBUTOS
    private String nombre;
    private int edad;
    private String empresa;
    private String especialidad;
    private Rut rut;



    //CONSTRUCTOR
    public Guia(String nombre, int edad, String empresa, String especialidad, Rut rut){
        this.nombre = nombre;
        this.edad = edad ;
        this.empresa = empresa;
        this.especialidad = especialidad;
        this.rut = rut;


    }

    //GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad () {
        return edad;
    }
        public void setEdad(int edad) {
            this.edad = edad;
    }
    public String getEmpresa() {
        return empresa;
    }
        public void setEmpresa(String empresa){
        this.empresa = empresa;

        }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Rut getRut() {
        return rut;
    }

    public void setRut(Rut rut) {
        this.rut = rut;
    }

    //TOSTRING
    public String toString() {
        return "--Guia--" + "\n" +
                "Nombre: " + nombre + "\n" +
                "Rut: " + rut + "\n" +
                "Edad: " + edad + "\n" +
                "Empresa: " + empresa + "\n" +
                "Especialidad: " + especialidad + "\n";

    }




    }








