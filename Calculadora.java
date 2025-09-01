import java.util.Scanner; // Para ler o que o usuário digita

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria o scanner para entrada de dados
        
        System.out.println("Bem-vindo à calculadora simples!");
        
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble(); // Primeiro número
        
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble(); // Segundo número

        System.out.print("Digite o terceiro número: ");
        double num3 = scanner.nextDouble(); // Terceiro número
        
        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma (+)");
        System.out.println("2 - Subtração (-)");
        System.out.println("3 - Multiplicação (*)");
        System.out.println("4 - Divisão (/)");
        System.out.print("Digite o número da operação: ");
        int operacao = scanner.nextInt(); // Lê a operação escolhida
        
        double resultado = 0; // Variável para guardar o resultado
        
        // Verifica qual operação o usuário escolheu
        if (operacao == 1) {
            resultado = num1 + num2 + num3; // Soma
        } else if (operacao == 2) {
            resultado = num1 - num2 - num3; // Subtração
        } else if (operacao == 3) {
            resultado = num1 * num2 * num3; // Multiplicação
        } else if (operacao == 4) {
            if (num2 != 0 && num3 != 0) { // verifica os dois números
            resultado = num1 / num2 / num3;
            } else {
                System.out.println("Erro: não pode dividir por zero!");
                scanner.close();
                return; // Encerra o programa
            }
        } else {
            System.out.println("Error!");
            scanner.close();
            return; // Encerra o programa
        }
        
        System.out.println("O resultado é: " + resultado); // Mostra o resultado
        scanner.close(); // Fecha o scanner
    }
}
