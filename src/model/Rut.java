package model;

import util.RutInvalidoException;

public class Rut {

    private String rut;





    public Rut(String rut) throws RutInvalidoException{
        if(!rut.matches("[0-9]+-[0-9Kk]")){
            throw new RutInvalidoException("--¡Formato de rut no valido!--");

        }
        this.rut = rut;


    }

    public String getRut() {
        return rut;


    }

    public String toString (){
        return rut;

    }


}


