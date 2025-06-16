// Simulando Uma Conta Bancária Através Do Terminal/Console

// TODO:
// Conhecer e importar a classe Scanner
// Exibir as mensagens para o nosso usuário
// Obter pelo scanner os valores digitados pelo usuário
// Exibir a mensagem de conta criada


import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

public class ContaTerminal {
    public static void main(String[] args) {
        // Configurando o locale para Brasil (Real)
        Locale.setDefault(new Locale("pt", "BR"));

        // Criando o objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicitando e lendo os dados da conta
        System.out.println("Por favor, digite o número da Conta !");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumindo a quebra de linha

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente !");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta !");
        double saldo = scanner.nextDouble();

        // Fechando o scanner
        scanner.close();

        // Formatando o saldo como moeda brasileira
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance();
        String saldoFormatado = formatoMoeda.format(saldo);

        // Exibindo a mensagem final
        String mensagem = "Olá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numero +
                " e seu saldo de " + saldoFormatado +
                " reais já está disponível para saque";

        System.out.println(mensagem);
    }
}
