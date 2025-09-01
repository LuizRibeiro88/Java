import java.util.Random;
import java.util.Scanner;

public class Adivinhacao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String jogarNovamente;

        do {
            int numeroSecreto = random.nextInt(100) + 1;
            int tentativas = 0;
            boolean acertou = false;

            System.out.println("=== Jogo da Adivinhação ===");
            System.out.println("Tente adivinhar o número entre 1 e 100!");

            while (!acertou) {
                System.out.print("Digite seu palpite: ");
                int palpite = scanner.nextInt();
                tentativas++;

                if (palpite < numeroSecreto) {
                    System.out.println("O número é maior!");
                } else if (palpite > numeroSecreto) {
                    System.out.println("O número é menor!");
                } else {
                    System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas!");
                    acertou = true;
                }
            }

            // Pergunta se quer jogar novamente
            System.out.print("Quer jogar novamente? (s/n): ");
            jogarNovamente = scanner.next();
            System.out.println();

        } while (jogarNovamente.equalsIgnoreCase("s"));

        System.out.println("Obrigado por jogar! Até a próxima.");
        scanner.close();
    }
}
