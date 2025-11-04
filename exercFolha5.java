import java.util.Scanner;

public class exercFolha5 {

    public static void clear(Scanner sc) {

        System.out.println("\nPressione Enter para continuar...");

        if (sc.hasNextLine())
            sc.nextLine();

        sc.nextLine();

        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("Erro ao limpar a tela: " + e.getMessage());
        }
    }

    double nota(Scanner sc) {

        int nota1 = 0;
        int nota2 = 0;

        while (true) {
            System.out.print("Digite a primeira nota (0 a 10): ");
            nota1 = sc.nextInt();

            System.out.print("Digite a segunda nota (0 a 10): ");
            nota2 = sc.nextInt();

            if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10) {
                System.out.println("Notas inválidas! Tente novamente.");
            } else {
                double media = (nota1 + nota2) / 2.0;
                return media;
            }
        }
    }

    void exercicio1(Scanner sc) {

        double media = nota(sc);

        System.out.printf("Média do aluno: %.2f\n", media);

        if (media >= 7) {
            System.out.println("Situação: Aprovado");
        } else if (media >= 4) {
            System.out.println("Situação: Em recuperação");
        } else {
            System.out.println("Situação: Reprovado");
        }

    }

    void exercicio2(Scanner sc) {
        // Construa um algoritmo que funcione como uma calculadora simples. A
        // calculadora
        // deve realizar as operações de soma (+), subtração (-), multiplicação (*) e
        // divisão (/). O
        // usuário deve informar ao algoritmo dois operandos (dois números reais) e a
        // operação. O
        // algoritmo deve retornar o resultado da operação ou uma mensagem de erro caso
        // o usuário
        // solicite uma operação não definida. Cada uma das operações deve ter sua
        // própria função
        // ou procedimento

        int x = 0;
        while (x != 5) {
            System.out.print("Escolha a operação (1 = +,2 = -,3 = *,4 = /, 5 para sair): ");
            x = sc.nextInt();
            clear(sc);
            switch (x) {
                case 1:
                    System.out.println("Soma");
                    System.out.println("Digite o primeiro número: ");
                    int a = sc.nextInt();
                    System.out.println("Digite o segundo número: ");
                    int b = sc.nextInt();
                    System.out.println("Resultado: " + (a + b));
                    break;
                case 2:
                    System.out.println("Subtração");
                    System.out.println("Digite o primeiro número: ");
                    int c = sc.nextInt();
                    System.out.println("Digite o segundo número: ");
                    int d = sc.nextInt();
                    System.out.println("Resultado: " + (c - d));
                    break;
                case 3:
                    System.out.println("Multiplicação");
                    System.out.println("Digite o primeiro número: ");
                    int e = sc.nextInt();
                    System.out.println("Digite o segundo número: ");
                    int f = sc.nextInt();
                    System.out.println("Resultado: " + (e * f));
                    break;
                case 4:
                    System.out.println("Divisão");
                    System.out.println("Digite o primeiro número: ");
                    int g = sc.nextInt();
                    System.out.println("Digite o segundo número: ");
                    int h = sc.nextInt();
                    if (h == 0) {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                    } else {
                        System.out.println("Resultado: " + (g / h));
                    }
                    break;
                case 5:
                    System.out.println("Saindo da calculadora.");
                    break;
                default:
                    break;
            }

        }

    }

    void exercicio3(Scanner sc) {
        // implemente aqui o exercício 3
    }

    boolean divisivelPor2ou3(int valor) {
        return (valor % 2 == 0 || valor % 3 == 0);
    }

    void exercicio4(Scanner sc) {

        // implemente aqui o exercício 4
        // Elaborar uma função (com ou sem retorno) que apresente a mensagem "Este valor
        // é
        // divisível por 2 ou 3". Deve ser solicitado pelo programa principal o valor a
        // ser verificado.
        // Caso o valor não atenda à condição desejada, a função deve apresentar a
        // mensagem
        // "Valor inválido"
        System.out.print("Digite um valor inteiro: ");
        int valor = sc.nextInt();
        if (divisivelPor2ou3(valor)) {
            System.out.println("Este valor é divisível por 2 ou 3.");
        } else {
            System.out.println("Valor inválido.");
        }

    }

    void tornarPositivo(int numero) {
        if (numero < 0) {
            numero = -numero;
        }
        System.out.println("Número positivo: " + numero);
    }

    void exercicio5(Scanner sc) {
        // Elaborar um programa que apresente como resultado um número positivo, mesmo
        // que a entrada tenha sido feita com um valor negativo. Use um procedimento com
        // passagem
        // de valor por referência.
        System.out.print("Digite um número (positivo ou negativo): ");
        int numero = sc.nextInt();
        tornarPositivo(numero);

    }

    void exercicio6(Scanner sc) {
        // Crie um programa que leia um número de 1 a 12 e imprima o nome do mês
        // correspondente
        int mes = 0;

        while (mes != 13) {
            clear(sc);
            System.out.println("Digite um número de 1 a 12 para o mes ou 13 para sair: ");
            mes = sc.nextInt();

            switch (mes) {
                case 1 -> System.out.println("Janeiro");
                case 2 -> System.out.println("Fevereiro");
                case 3 -> System.out.println("Março");
                case 4 -> System.out.println("Abril");
                case 5 -> System.out.println("Maio");
                case 6 -> System.out.println("Junho");
                case 7 -> System.out.println("Julho");
                case 8 -> System.out.println("Agosto");
                case 9 -> System.out.println("Setembro");
                case 10 -> System.out.println("Outubro");
                case 11 -> System.out.println("Novembro");
                case 12 -> System.out.println("Dezembro");
                case 13 -> System.out.println("Saindo...");
                default -> System.out.println("Número inválido! Deve ser entre 1 e 12.");
            }

        }

    }

    void exercicio7(Scanner sc) {
        System.out.print("Quantidade do produto A (R$10 cada): ");
        int quantidadeA = sc.nextInt();
        System.out.print("Quantidade do produto B (R$20 cada): ");
        int quantidadeB = sc.nextInt();
        double totalA = quantidadeA * 10;
        double totalB = quantidadeB * 20;
        double total = totalA + totalB;
        double desconto = 0;
        if (quantidadeA > 0 && quantidadeB > 0) {
            desconto = total * 0.15;
        } else if (quantidadeA > 0 || quantidadeB > 0) {
            desconto = total * 0.10;
        }
        double valorFinal = total - desconto;
        System.out.println("Total antes do desconto: R$" + total);
        System.out.printf("Valor total da compra: R$%.2f\n", valorFinal);

    }

    void exercicio8(Scanner sc) {
        // Escreva um programa que simule a compra de um lanche em uma padaria. O
        // programa deve ser executado enquanto o cliente informar o que deseja comprar
        // e a
        // quantidade desejada. A cada novo item inserido na compra, o programa deve
        // mostrar na
        // tela o subtotal a ser pago. Ao final da execução apresente o valor total da
        // compra.

        double totalCompra = 0.0;
        String item;
        int quantidade;
        do {
            System.out.print("Digite o item que deseja comprar (ou 'sair' para finalizar): ");
            item = sc.next();
            if (item.equalsIgnoreCase("sair")) {
                break;
            }
            System.out.print("Digite a quantidade desejada: ");
            quantidade = sc.nextInt();

            double precoUnitario;
            switch (item.toLowerCase()) {
                case "pao":
                    precoUnitario = 1.50;
                    break;
                case "bolo":
                    precoUnitario = 15.00;
                    break;
                case "cafe":
                    precoUnitario = 5.00;
                    break;
                default:
                    System.out.println("Item não disponível.");
                    continue;
            }

            double subtotal = precoUnitario * quantidade;
            totalCompra += subtotal;
            System.out.printf("Subtotal da compra até agora: R$%.2f\n", totalCompra);

        } while (true);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        exercFolha5 exerc = new exercFolha5();
        int opcao = 0;

        while (true) {
            System.out.println("\n===== Exercícios da Folha 4 =====");
            System.out.println("1 - Exercício 1");
            System.out.println("2 - Exercício 2");
            System.out.println("3 - Exercício 3");
            System.out.println("4 - Exercício 4");
            System.out.println("5 - Exercício 5");
            System.out.println("6 - Exercício 6");
            System.out.println("7 - Exercício 7");
            System.out.println("8 - Exercício 8");
            System.out.println("9 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> exerc.exercicio1(sc);
                case 2 -> exerc.exercicio2(sc);
                case 3 -> exerc.exercicio3(sc);
                case 4 -> exerc.exercicio4(sc);
                case 5 -> exerc.exercicio5(sc);
                case 6 -> exerc.exercicio6(sc);
                case 7 -> exerc.exercicio7(sc);
                case 8 -> exerc.exercicio8(sc);
                case 9 -> {
                    System.out.println("Encerrando programa...");
                    sc.close();
                    return;
                }
                default -> System.out.println("Opção inválida! Tente novamente.");
            }

            System.out.println("\nPressione ENTER para continuar...");
            sc.nextLine(); // Consumir a nova linha pendente
            sc.nextLine(); // Esperar o ENTER do usuário
        }

    }
}
