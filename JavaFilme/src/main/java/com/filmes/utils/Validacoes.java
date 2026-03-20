package com.filmes.utils;

public class Validacoes {

    private Validacoes() {
    
    }

     // validando o título
    public static boolean tituloValido(String titulo) {
        return !(titulo == null || titulo.trim().isEmpty());
    }

    public static String mensagemErroTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            return "Erro: O título não pode estar vazio!";
        }
        return "";
    }

     // validando gênero
    public static boolean generoValido(String genero) {
        return !(genero == null || genero.trim().isEmpty() || genero.matches(".*\\d+.*"));
    }

    public static String mensagemErroGenero(String genero) {
        if (genero == null || genero.trim().isEmpty()) {
            return "Erro: O gênero não pode estar vazio!";
        } else if (genero.matches(".*\\d+.*")){
            return "Erro: O gênero com número?";
        }
        return "";
    }

     // validando ano
    public static boolean anoValido(int ano) {
        return ano >= 1888 && ano <= 2100;
    }

    public static String mensagemErroAno(int ano) {
        if (ano < 1888) {
            return "Erro: Ano inválido! O cinema começou em 1888.";
        } else if (ano > 2100) {
            return "Erro: Ano muito alto!";
        }
        return "";
        //ultilizei pesquisas no ano
    }

    // validando duração
    public static boolean duracaoValida(int duracao) {
        return duracao > 0 && duracao <= 500;
    }

    public static String mensagemErroDuracao(int duracao) {
        if (duracao <= 0) {
            return "Erro: A duração deve ser maior que 0!";
        } else if (duracao > 500) {
            return "Erro: Duração muito longa!";
        }
        return "";
    }

    // valida diretor
    public static boolean diretorValido(String diretor) {
        return !(diretor == null || diretor.trim().isEmpty() || diretor.matches(".*\\d+.*"));
    }

    public static String mensagemErroDiretor(String diretor) {
        if (diretor == null || diretor.trim().isEmpty()) {
            return "Erro: O diretor não pode estar vazio!";
            // O ".matches" é uma função que detecta se há números nesse caso
        } else if (diretor.matches(".*\\d+.*")){
            return "Erro: O nome do diretor com número?";
        }
        return "";
    }
    
}
