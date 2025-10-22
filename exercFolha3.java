import java.util.Scanner;

public class exercFolha3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Elabore um algoritmo que leia dois números e imprima qual é maior, qual é
        // menor, ou se são iguais.
        exercFolha3 exerc = new exercFolha3();
        exerc.UmcompareNumbers(scanner, scanner);

        // Efetuar a leitura de um valor numérico inteiro positivo ou negativo
        // representado pela variável N e apresentar o valor lido como sendo positivo.
        // Dica: se o valor
        // lido for menor que zero, ele deve ser multiplicado por -1.
        exerc.DoispositiveValue(scanner);

        // Desenvolva um algoritmo para aplicar um percentual de desconto sobre o valor
        // de uma compra informado pelo usuário. Os percentuais de desconto são:
        // ● 15% para compras acima de R$ 500,00;
        // ● 10% para compras entre R$ 200,00 e R$ 499,99;
        // ● 5% para compras abaixo de R$ 200,00.
        // O algoritmo deverá exibir o valor antes do desconto, o valor do desconto e o
        // valor a ser
        // pago.
        exerc.TresapplyDiscount(scanner);

        // 1. Desenvolva um algoritmo que leia 4 números inteiros do teclado e
        // apresente:
        // ● Média dos números ímpares
        // ● Maior número par
        // ● Diferença entre o maior e o menor número

        exerc.QuatroAlgoritmo(scanner);

    }

    void UmcompareNumbers(Scanner scanner1, Scanner scanner2) {

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner1.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner2.nextInt();

        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
            System.out.println("O menor número é: " + num2);
        } else if (num2 > num1) {
            System.out.println("O maior número é: " + num2);
            System.out.println("O menor número é: " + num1);
        } else {
            System.out.println("Os números são iguais.");
        }
    }

    void DoispositiveValue(Scanner scanner) {

        System.out.print("Digite um valor numérico inteiro (positivo ou negativo): ");
        int N = scanner.nextInt();

        if (N < 0) {
            N = N * -1;
        }

        System.out.println("O valor positivo é: " + N);
    }

    void TresapplyDiscount(Scanner scanner) {

        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = scanner.nextDouble();
        double desconto = 0.0;

        if (valorCompra > 500.00) {
            desconto = valorCompra * 0.15;
        } else if (valorCompra >= 200.00 && valorCompra <= 499.99) {
            desconto = valorCompra * 0.10;
        } else {
            desconto = valorCompra * 0.05;
        }

        double valorAPagar = valorCompra - desconto;

        System.out.printf("Valor antes do desconto: R$ %.2f%n", valorCompra);
        System.out.printf("Valor do desconto: R$ %.2f%n", desconto);
        System.out.printf("Valor a ser pago: R$ %.2f%n", valorAPagar);
    }

    void QuatroAlgoritmo(Scanner scanner) {

        int[] numeros = new int[4];
        int somaImpares = 0;
        int countImpares = 0;
        Integer maiorPar = null;
        int maiorNumero = Integer.MIN_VALUE;
        int menorNumero = Integer.MAX_VALUE;

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o número inteiro " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            // Verifica se é ímpar
            if (numeros[i] % 2 != 0) {
                somaImpares += numeros[i];
                countImpares++;
            } else { // Verifica se é par
                if (maiorPar == null || numeros[i] > maiorPar) {
                    maiorPar = numeros[i];
                }
            }

            // Verifica maior e menor número
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
            if (numeros[i] < menorNumero) {
                menorNumero = numeros[i];
            }
        }

        // Calcula a média dos números ímpares
        double mediaImpares = countImpares > 0 ? (double) somaImpares / countImpares : 0;

        System.out.printf("Média dos números ímpares: %.2f%n", mediaImpares);
        if (maiorPar != null) {
            System.out.println("Maior número par: " + maiorPar);
        } else {
            System.out.println("Não há números pares.");
        }
        System.out.println("Diferença entre o maior e o menor número: " + (maiorNumero - menorNumero));
    }
}