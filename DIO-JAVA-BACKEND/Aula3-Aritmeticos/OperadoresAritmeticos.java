import java.util.Scanner;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("informe o primeiro número");
        var valor1 = scanner.nextInt();
        System.out.println("informe o segundo número");
        var valor2 = scanner.nextInt();
        System.out.printf("%s - %s = %s\n", valor1, valor2, valor1 - valor2);
    }
}
