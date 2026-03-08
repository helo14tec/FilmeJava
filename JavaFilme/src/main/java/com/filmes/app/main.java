package main.java.com.filmes.app;

import src.model.Filme;

public class main {

//Aula  27/02 OBJETO
     public static void main(String[] args) {
 //feito em sala (pessoa) Scanner sc = new Scanner(System.in);

       filme filme1 = new Filme(
                "Coraline",
                "Animação",
                2009,
                140,
                "Henry Selick"
        );

        // Chamam os métodos
        System.out.println(filme1);      
        filme1.exibirDetalhes();           
        filme1.filmeAntigo();       

    public static void imprimirInformacao(){

    }
 
}

