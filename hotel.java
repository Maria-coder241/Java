package hotel.java;

import hospede.java.hospede;
import quarto.java.quarto;

import java.util.ArrayList;

public class hotel {
    private String nome;
    private String endereco;
    private ArrayList<quarto> quartos;

    public hotel(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
        this.quartos = new ArrayList<>();
    }

    public void adicionarQuarto(quarto quarto){
        this.quartos.add(quarto);
    }

    public boolean hospedar(hospede hospede, int numeroQuarto){
        for (quarto q : quartos){
            if (q.getNumero() == numeroQuarto){
                q.ocupar(hospede);
                return true;
            }
        }
        return false;
    }

    public void realizarCheckout(int numeroQuarto){
        for (quarto q : quartos){
            if (q.getNumero() == numeroQuarto){
                q.liberar();
            }
        }
    }

    public ArrayList<quarto> getQuartos(){ return this.quartos; }
}
