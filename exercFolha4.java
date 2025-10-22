import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class exercFolha4 {

    // Exercício 1: Ler 10 números e calcular soma e média
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
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

    }

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

        sc.close();
    }

}
