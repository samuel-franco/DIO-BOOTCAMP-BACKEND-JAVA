import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe um número de 1 até 7");
        var option = scanner.nextInt();
        var mensagem = switch (option) {
            case 1, 7 -> {
                var dia = option == 1 ? "Domingo" : "Sábado";
                yield String.format("Hoje é %s, fim de semana uhuull \\o/", dia);
            }
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            default -> "Opção inválida";
        };
        System.out.println(mensagem);
    }
}