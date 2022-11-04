package org.example.clasesHalloween;

public class Fiesta {
    //ATRIBUTOS
    private String fecha;

    private double costosAlimento;

    private double costosBebidas;

    private double costosLugar;

   private double costosEquipo;


    private final double VALOR_ENTRADA=50000;

    // CONSTRUCTOR

    public Fiesta() {

    }

    public Fiesta(String fecha, double costosAlimento, double costosBebidas, double costosLugar, double costosEquipo) {
        this.fecha = fecha;
        this.costosAlimento = costosAlimento;
        this.costosBebidas = costosBebidas;
        this.costosLugar = costosLugar;
        this.costosEquipo = costosEquipo;
    }

    //METODOS

    //Metodos  de encapsulado
    //(para acceder a modificar o a mostrat nuestros atrivutos privados)

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }



    public double getCostosAlimento() {
        return costosAlimento;
    }

    public void setCostosAlimento(double costosAlimento) {
        if(costosAlimento>0){
            this.costosAlimento = costosAlimento;
        }else{
            System.out.println("No aceptamos valores negativos");
        }
    }

    public double getCostosBebidas() {
        return costosBebidas;
    }

    public void setCostosBebidas(double costosBebidas) {
        if (costosBebidas>0) {
            this.costosBebidas = costosBebidas;
        }else{
            System.out.println("No acepto valores negativos");
        }
    }

    public double getCostosLugar() {
        return costosLugar;
    }
    
    public void setCostosLugar(double costosLugar) {
        if(costosLugar>0) {
            this.costosLugar = costosLugar;
        }else{
            System.out.println("No acepto valores negativos");
        }
    }

    public double getCostosEquipo() {
        return costosEquipo;
    }

    public void setCostosEquipo(double costosEquipo) {
        if(costosEquipo>0) {
            this.costosEquipo = costosEquipo;
        }else {
            System.out.println("No acepto valores negativos");
        }
    }



    //Metodos ordinarios


    public double calcularCostos(){
        return(this.costosAlimento+this.costosBebidas+this.costosLugar+this.costosEquipo);
    }
}
