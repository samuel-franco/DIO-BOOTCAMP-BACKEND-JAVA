import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Quanto é 2 + 2 ?");
        var resultado = scanner.nextInt();
        var resultadoCorreto = resultado == 4;
        System.out.printf("O resultado é 4, voce acertou? (%s)", resultadoCorreto);
    }
}
