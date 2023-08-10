package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import entities.Endereco;
import util.ApiCep;

public class Main {
    public static void main(String[] args) {


        Endereco end1 = new Endereco(new ApiCep("94.920-170").getCep_preenchido(), "208","" );
        mostraEndereco(end1);
        Endereco end2 = new Endereco(new ApiCep("94.920-190").getCep_preenchido(), "18936" );
        mostraEndereco(end2);
    }

    public static void mostraEndereco(Endereco end){
        System.out.println(end.toString());
    }

}