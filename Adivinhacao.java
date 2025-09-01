import java.util.Random; // Permite ler o que o usuário digita
import java.util.Scanner;  // Gera números aleatórios

public class Adivinhacao { // Define o programa chamado "Adivinhacao"
    public static void main(String[] args) { // Executa do programa
        Scanner scanner = new Scanner(System.in); // Lê o que o usuário digita
        Random random = new Random(); // Cria números aleatórios

        int numeroSecreto = random.nextInt(100) + 1; // Gera um número aleatório entre 1 e 100
        int tentativa = 0; // Aqui vamos guardar o número que o usuário digitar
        int tentativasRealizadas = 0; // Conta quantas tentativas o usuário já fez

        System.out.println("Bem-vindo ao jogo de adivinhação!"); // Mostra mensagem de boas-vindas
        System.out.println("Tente adivinhar o número entre 1 e 100."); // Explica a regra do jogo

        // Começa o loop do jogo, vai continuar enquanto o usuário não acertar
        while (tentativa != numeroSecreto) {
            System.out.print("Digite seu palpite: "); // Pede para o usuário digitar um número
            tentativa = scanner.nextInt(); // Lê o número digitado
            tentativasRealizadas++; // Soma 1 no total de tentativas

            // Verifica se o número digitado é menor, maior ou igual ao número secreto
            if (tentativa < numeroSecreto) {
                System.out.println("O número é maior!"); // Dá dica se o número secreto é maior
            } else if (tentativa > numeroSecreto) {
                System.out.println("O número é menor!"); // Dá dica se o número secreto é menor
            } else {
                System.out.println("Parabéns! Você acertou o número em " + tentativasRealizadas + " tentativas."); 
                // Mensagem de vitória com o total de tentativas
            }
        }

        scanner.close(); // Fecha o scanner, liberando recursos do computador
    }
}
