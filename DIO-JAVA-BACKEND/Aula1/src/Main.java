import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, informe o seu nome: ");
        String name = scanner.next();
        System.out.println("Olá, informe a sua idade: ");
        int idade = scanner.nextInt();
        System.out.printf("Olá %s, sua idade é %s anos. \n", name, idade);
    }
}



// Aqui é um comentário de uma linha

/*
Aqui é um comentário de várias linhas
* */