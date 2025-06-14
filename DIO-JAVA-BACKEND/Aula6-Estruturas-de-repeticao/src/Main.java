import java.util.Scanner;

// Estudando estruturas de repetição if e else.

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o seu nome:");
        var nome = scanner.next();
        System.out.println("Informe a sua idade:");
        var idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.printf("Você %s tem %s anos, você pode dirigir! \n", nome, idade);
        } else {
            System.out.printf("%s, você não pode dirigir \n", nome);
        }
        System.out.println("Fim da execução");
    }
}