package java.com.filmes.app;

import java.util.Scanner;

import com.filmes.model.Filme;
import com.filmes.utils.Validacoes;

public class testemenu {
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Filme filme = new Filme("Coraline", "Animação", 2009, 140, "Henry Selick");

        int opcao;

        do {

            imprimirMenu();

            opcao = recebeOp(scanner);

            switch (opcao) {

                case 1:
                    System.out.println(filme.toString());
                    break;

                case 2:
                    alterarTitulo(filme, scanner);
                    break;

                case 3:
                    alterarAno(filme, scanner);
                    break;

                case 4:
                    filme.exibirDetalhes();
                    break;

                case 5:
                    alterarDuracao(filme, scanner);
                    break;

                case 0:
                    System.out.println("Programa finalizado!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }

    public static void imprimirMenu() {

        System.out.println("\n=== Menu de Filmes ===");
        System.out.println("1. Mostrar dados do filme");
        System.out.println("2. Alterar título");
        System.out.println("3. Alterar ano de lançamento");
        System.out.println("4. Mostrar detalhes do filme");
        System.out.println("5. Alterar duração");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static int recebeOp(Scanner scanner){

        int opcao;

        try {
            opcao = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Por favor, digite um número válido!");
            opcao = -1;
        }

        return opcao;
    }

    public static void alterarTitulo(Filme filme, Scanner scanner) {

        System.out.print("Digite o novo título: ");
        String novoTitulo = scanner.nextLine();

        if (Validacoes.tituloValido(novoTitulo)) {
            filme.setTitulo(novoTitulo);
            System.out.println("Título alterado com sucesso!");
        } else {
            System.out.println(Validacoes.mensagemErroTitulo(novoTitulo));
        }
    }

    public static void alterarAno(Filme filme, Scanner scanner) {

        System.out.print("Digite o novo ano de lançamento: ");

        try {

            int novoAno = Integer.parseInt(scanner.nextLine());

            if (Validacoes.anoValido(novoAno)) {
                filme.setAnoLancamento(novoAno);
                System.out.println("Ano alterado com sucesso!");
            } else {
                System.out.println(Validacoes.mensagemErroAno(novoAno));
            }

        } catch (NumberFormatException e) {

            System.out.println("Erro: Digite um número válido!");
        }
    }

    public static void alterarDuracao(Filme filme, Scanner scanner) {

        System.out.print("Digite a nova duração do filme: ");

        try {

            int novaDuracao = Integer.parseInt(scanner.nextLine());

            if (Validacoes.duracaoValida(novaDuracao)) {
                filme.setDuracao(novaDuracao);
                System.out.println("Duração alterada com sucesso!");
            } else {
                System.out.println(Validacoes.mensagemErroDuracao(novaDuracao));
            }

        } catch (NumberFormatException e) {

            System.out.println("Erro: Digite um número válido!");
        }
    }

}
    

