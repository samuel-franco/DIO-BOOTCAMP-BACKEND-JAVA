import java.time.OffsetDateTime;
import java.util.Scanner;

public class ExercicioAula5 {

    public static void main(String[] args) {

        var anoBase = OffsetDateTime.now().getYear(); // esse metodo pega a data atual
        var scanner = new Scanner(System.in);
        System.out.println("Informe o seu nome: ");
        var nome = scanner.next();

        System.out.println("Informe o seu ano de nascimento: ");
        var ano = scanner.nextInt();
        var idade = anoBase - ano;
        System.out.printf("Olá %s, você tem %s anos de idade. \n", nome, idade);
    }
}
