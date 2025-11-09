package main;

import hospede.java.hospede;
import model.*;
import quarto.java.quarto;
public class Main {
    public static void main(String[] args) {


        Pessoa joao =new Pessoa("João Paulo");

        joao.addTelefone("9876543376");
        joao.listarTelefones();
        System.out.println("---------------");
        joao.addTelefone("2346789");
        joao.listarTelefones();
        System.out.println("---------------");
        joao.removerTelefone("9876543376");
        joao.listarTelefones();

    }
}
