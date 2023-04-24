package main;
import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private EstruturaDeDados estruturaDeDados;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    public void iniciar() {
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\nEscolha a estrutura de dados:");
            System.out.println("1 - Pilha");
            System.out.println("2 - Fila");
            System.out.println("3 - Mostrar dados");
            System.out.println("4 - Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    estruturaDeDados = new Pilha();
                    menuOperacoes();
                    break;
                case 2:
                    estruturaDeDados = new Fila();
                    menuOperacoes();
                    break;
                case 3:
                    if (estruturaDeDados != null) {
                        estruturaDeDados.mostrarDados();
                    } else {
                        System.out.println("Estrutura de dados não selecionada.");
                    }
                    break;
                case 4:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        scanner.close();
    }

    private void menuOperacoes() {
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\nEscolha a operação:");
            System.out.println("1 - Adicionar dado");
            System.out.println("2 - Remover dado");
            System.out.println("3 - Mostrar dados");
            System.out.println("4 - Voltar");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarDado();
                    break;
                case 2:
                    removerDado();
                    break;
                case 3:
                    if (estruturaDeDados != null) {
                        estruturaDeDados.mostrarDados();
                    } else {
                        System.out.println("Estrutura de dados não selecionada.");
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }

    private void adicionarDado() {
        System.out.println("Digite o dado a ser adicionado:");
        int dado = scanner.nextInt();

        estruturaDeDados.adicionar(dado);
    }

    private void removerDado() {
        int dadoRemovido = estruturaDeDados.remover();

        if (dadoRemovido != -1) {
            System.out.println("Dado removido: " + dadoRemovido);
        } else {
            System.out.println("Não há dados para remover.");
        }
    }
}
