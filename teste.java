import java.util.Scanner;

public class teste {

    public static boolean ehPalindromo(String str) {
        // Remover espaços em branco e converter para minúsculas
        str = str.replaceAll("\\s", "").toLowerCase();

        int comprimento = str.length();
        for (int i = 0; i < comprimento / 2; i++) {
            // Comparar caracteres correspondentes 
            if (str.charAt(i) != str.charAt(comprimento - 1 - i)) {
                return false; // Não é um palíndromo
            }
        }
        return true; // É um palíndromo
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma string para verificar se é um palíndromo:");
        String entrada = scanner.nextLine();

        if (ehPalindromo(entrada)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }
    }
}
