package quarto.java;

import hospede.java.hospede;

public class Quarto {
    private int numero;
    private String tipo;
    private double precoPorNoite;
    private boolean ocupado;
    private Hospede HospedeAtual;

    public Quarto(int numero, String tipo, double precoPorNoite){
        this.numero=numero;
        this.tipo=tipo;
        this.precoPorNoite=precoPorNoite;
        this.ocupado=false;
    }

    public void ocupar(Hospede hospede){
        if (this.ocupado){
            System.out.println("Quarto já está ocupado!");
        }else {
            this.hospedeAtual=hospede;
            this.ocupado=true;
        }
    }

    public void liberar(){
        if (this.ocupado){
            this.hospedeAtual=null;
            this.ocupado=false;
        }else {
            System.out.println("Quarto já disponivel!");
        }
    }

    public int getNumero(){
        return this.numero;
    }

    public boolean isOcupado(){
        return this.ocupado;
    }

    public Hospede getHospedeAtual(){
        return this.hospedeAtual;
    }

    public String getTipo(){
        return this.tipo;
    }

}
