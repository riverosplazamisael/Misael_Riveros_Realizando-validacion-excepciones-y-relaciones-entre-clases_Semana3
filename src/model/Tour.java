package model;
import java.util.ArrayList;

public class Tour {

    //ATRIBUTOS
    private String empresa;
    private String servicio;
    private int cupos;

    private ArrayList<Cliente> clientes;






    //CONSTRUCTOR
    public Tour(String empresa, String serivicio, int cupos){
        this.empresa = empresa;
        this.servicio = serivicio;
        this.cupos = cupos;

        this.clientes = new ArrayList<>();

    }

     //AGREGAR CLIENTE
    public void agregarCliente(Cliente cliente){
        this.clientes.add(cliente);


    }

    //GETTER Y SETTER
    public String getEmpresa (){
        return empresa;

    }
    public void setEmpresa(String empresa){
        this.empresa = empresa;

    }

    public String getSerivicio(){
        return servicio;

    }
    public void setSerivicio(String servicio){
        this.servicio = servicio;

    }
public int getCupos(){
        return cupos;

}
public void setCupos(int cupos){
        this.cupos = cupos;

}
    //TOSTRING
    public String toString(){
        return "---Operador de tour---" + "\n" +
                "Empresa: " + empresa + "\n" +
                "Servicio: " + servicio + "\n" +
                "Cupos: " + cupos + "\n";

    }






}
