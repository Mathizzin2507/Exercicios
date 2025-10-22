import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

public class exercFolha4 {

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

    public void exercicio1(Scanner sc) {
        double soma = 0;
        double media = 0;

        System.out.println("Exercício 1: Soma e Média de 10 valores");

        for (int i = 0; i < 10; i++) {
            double valor = 0;
            boolean valido = false;

            // Tratamento de entrada para garantir que o usuário digite um número válido
            while (!valido) {
                System.out.print("Digite o " + (i + 1) + "º valor: ");
                if (sc.hasNextDouble()) {
                    valor = sc.nextDouble();
                    valido = true;
                } else {
                    System.out.println("Valor inválido! Digite um número real.");
                    sc.next(); // descarta entrada inválida
                }
            }

            soma += valor;
        }

        media = soma / 10;

        System.out.println("-------------------------");
        System.out.println("Soma dos valores: " + soma);
        System.out.println("Média dos valores: " + media);
        System.out.println("-------------------------");
    }

    // Exercício 2: Crescimento de Chaves e Quico
    public void exercicio2(Scanner sc) {
        System.out.println("Exercício 2: Crescimento de Chaves e Quico");

        BigDecimal quico = new BigDecimal("1.40");
        BigDecimal chaves = new BigDecimal("1.10");
        BigDecimal crescimentoQuico = new BigDecimal("0.02");
        BigDecimal crescimentoChaves = new BigDecimal("0.03");
        int anos = 0;

        while (chaves.compareTo(quico) <= 0) { // enquanto chaves <= quico
            quico = quico.add(crescimentoQuico);
            chaves = chaves.add(crescimentoChaves);
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para que Chaves seja maior que Quico.");
        System.out.println("Altura final de Chaves: " + chaves.setScale(5, RoundingMode.HALF_UP) + " m");
        System.out.println("Altura final de Quico: " + quico.setScale(5, RoundingMode.HALF_UP) + " m");
        System.out.println("Diferença final: " + chaves.subtract(quico).setScale(5, RoundingMode.HALF_UP) + " m");
        System.out.println("-------------------------");

    }

    void exercicio3(Scanner sc) {
        // Elaborar um programa que leia um número inteiro positivo do teclado e mostre
        // a sua
        // tabuada de 1 a 10.
        System.out.print("digite um número inteiro positivo:");
        int numero = sc.nextInt();
        System.out.println("Tabuada de " + numero + ":");
        if (numero < 0) {
            System.out.println("Número inválido! Digite um número inteiro positivo.");
            return;
        }
        for (int i = 1; i <= 10; i++) {
            float resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

    }

    void exercicio4(Scanner sc) {

        System.out.println("Exercício 4: Média Aritmética de Números Pares de 1 a 100");
        int soma = 0;
        int contador = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) { // verifica se o número é par
                soma += i;
                contador++;
            }
        }
        double media = (double) soma / contador;
        System.out.println("A média aritmética dos números pares de 1 a 100 é: " + media);
    }

    void exercicio5() {
        ArrayList<Integer> numerosDivisiveisPor4 = new ArrayList<>();
        // Preenchendo a lista
        for (int i = 1; i <= 100; i++) {
            if (i % 4 == 0) {
                numerosDivisiveisPor4.add(i);
            }
        }
        // Imprimindo a lista inteira
        System.out.println(numerosDivisiveisPor4);
    }

    void exercicio6(Scanner sc) {
        double soma = 0;
        int quantidade = 0;
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;

        System.out.println("Digite números positivos (digite um número negativo para sair):");

        while (true) {
            System.out.print("Número: ");
            double valor = sc.nextDouble();

            if (valor < 0) {
                break; // encerra o loop se o valor for negativo
            }

            soma += valor;
            quantidade++;

            if (valor > maior) {
                maior = valor;
            }
            if (valor < menor) {
                menor = valor;
            }
        }

        if (quantidade > 0) {
            double media = soma / quantidade;
            System.out.println("\nQuantidade de números lidos: " + quantidade);
            System.out.println("Média: " + media);
            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);
        } else {
            System.out.println("Nenhum número positivo foi informado.");
        }
    }

    // Método principal
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        exercFolha4 exerc = new exercFolha4();

        exerc.exercicio1(sc);
        clear(sc);
        exerc.exercicio2(sc);
        clear(sc);
        exerc.exercicio3(sc);
        clear(sc);
        exerc.exercicio4(sc);
        clear(sc);
        exerc.exercicio5();
        clear(sc);
        exerc.exercicio6(sc);
        clear(sc);

        sc.close();
    }

}
