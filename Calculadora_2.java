import java.util.Scanner;

public class Calculadora_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Calculadora!");

        while (true) { // loop infinito
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            System.out.print("Digite o terceiro número: ");
            double num3 = scanner.nextDouble();

            System.out.println("Escolha a operação:");
            System.out.println("1 - Soma (+)");
            System.out.println("2 - Subtração (-)");
            System.out.println("3 - Multiplicação (*)");
            System.out.println("4 - Divisão (/)");
            System.out.print("Digite o número da operação: ");
            int operacao = scanner.nextInt();

            double resultado = 0;

            if (operacao == 1) {
                resultado = num1 + num2 + num3;
            } else if (operacao == 2) {
                resultado = num1 - num2 - num3;
            } else if (operacao == 3) {
                resultado = num1 * num2 * num3;
            } else if (operacao == 4) {
                if (num2 != 0 && num3 != 0) {
                    resultado = num1 / num2 / num3;
                } else {
                    System.out.println("Erro: não pode dividir por zero!");
                    continue; // volta ao início do loop
                }
            } else {
                System.out.println("ERROR!");
                continue; // volta ao início do loop
            }

            System.out.println("O resultado é: " + resultado);
            System.out.println(); // linha em branco para separar operações
        }
    }
}
