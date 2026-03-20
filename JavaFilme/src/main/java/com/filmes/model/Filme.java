package com.filmes.model;

public class Filme {

//atributos do filme

    private String titulo;
    private String genero;
    private int anoLancamento;
    private int duracao; 
    private String diretor;

//construtores 
public Filme() {
}


public Filme(String titulo, String genero, int anoLancamento, int duracao, String diretor) {
        this.titulo = titulo;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
        this.diretor = diretor;
}

//métodos do filme

public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Gênero: " + genero);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println("Diretor: " + diretor);
 } 

// se o filme for mais velho que os anos 2000 retorna se é moderno ou antigo
       
public void filmeAntigo() {

    if (anoLancamento < 2000) {
        System.out.println("Filme antigo");
     } 

    else {
        System.out.println("Filme moderno");
     }

 }

 //Gets e sets
 public String getTitulo() {
        return titulo;
    }

public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

public void setGenero(String genero) {
        this.genero = genero;
    }

public int getAnoLancamento() {
        return anoLancamento;
    }

public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

@Override
public String toString() {
    return "Filme [titulo=" + titulo +
           ", genero=" + genero +
           ", anoLancamento=" + anoLancamento +
           ", duracao=" + duracao +
           ", diretor=" + diretor + "]";
}
    
}

//ultilizei como métodos de pesquisa o canal FernandaDev e a classe feita em sala (Pessoa)
