import java.util.Scanner;

public class ListaNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos nomes você deseja cadastrar? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        String[] nomes = new String[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.println("Nomes cadastrados:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}