package org.example.clasesHalloween;

public class Lugar {
    //ATRIBUTOS
    String direccion;
    String hora;
    public int aforo;
    public String barrio;


    //CONSTRUCTOR

    public Lugar() {


    }

    public Lugar(String direccion, String hora, int aforo, String barrio) {
        this.direccion = direccion;
        this.hora = hora;
        this.aforo = aforo;
        this.barrio = barrio;
    }

    //METODOS
}
