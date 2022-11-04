package org.example;

import org.example.clasesHalloween.Fiesta;
import org.example.clasesHalloween.Invitado;
import org.example.clasesHalloween.Lugar;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner entradaPorTeclado=new Scanner(System.in);
        Invitado objetoInvitado = new Invitado();
        Lugar objetoLugar = new Lugar();
        Fiesta objetoFiesta = new Fiesta();

        System.out.println("FIESTA");

        System.out.println("1. gastos de comida: ");
        objetoFiesta.setCostosAlimento(entradaPorTeclado.nextDouble());
        System.out.println("el costo de alimentos es: "+objetoFiesta.getCostosAlimento());

    }
}