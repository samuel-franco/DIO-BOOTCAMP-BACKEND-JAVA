# DIO Bootcamp Java Back-End - Banco Santander 2025.

Detalhes do bootcamp

Os primeiros passos com  a linguagem Java partindo da sintaxe básica até a implementação de uma API utilizando Spring para se tornar um profissional atrativo no mercado.

O objetivo do bootcamp é ensinar a dominar a sintaxe básica e os fundamentos do Java, criar APIs RESTful com Spring Boot, trabalhar com bancos de dados SQL e NoSQL aplicando as boas práticas de código como SOLID e testes unitários, construindo um portfólio profissional com projetos reais, como a criação de um banco digital.

## 🎯 Objetivos de Aprendizado

- Dominar a sintaxe e os conceitos fundamentais do Java
- Compreender os pilares da programação orientada a objetos
- Praticar algoritmos e estrutura de dados
- Conhecer frameworks e bibliotecas úteis no ecossistema Java

## 📖 Referências


### História do Java

<div align="justify">
<p>
A história do Java é realmente fascinante. Originalmente projetado para televisão interativa, a jornada de Java começou com a Green Team, um grupo da Sun Microsystems liderado por James Gosling. Seu objetivo era criar uma linguagem de programação para dispositivos digitais como decodificadores e televisores. No entanto, os recursos do Java superaram as necessidades da indústria de televisão a cabo digital na época. Em vez disso, encontrou seu nicho na programação da Internet, oferecendo uma solução que estava à frente de seu tempo.

---

### Aula 2 - Estruturas Condicionais If else e else if.

Estruturas Condicionais If else e else if
```java
import java.util.Scanner;

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




```

## 1 Primeiro projeto - Simulando Uma Conta Bancária Através Do Terminal/Console

Sintaxe - Desafio

Vamos exercitar todo o conteúdo apresentado no módulo de Sintaxe codificando o seguinte cenário.

Crie o projeto ContaBanco que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:
Dentro do projeto, crie a classe ContaTerminal.java para realizar toda a codificação do nosso programa.

Revise sobre regras de declaração de variáveis

Atributos	Tipo	Exemplo

Numero da conta: Inteiro (1021)

Agencia: Texto (067-8)

Nome Cliente: Texto (MARIO ANDRADE)

Saldo: Decimal (237.48)

Revise sobre terminal, main args e a classe Scanner

Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:

Programa: "Por favor, digite o número da Agência !"

Usuário: 1021 (depois ENTER para o próximo campo)

Revise sobre concatenação e classe String com método concat

Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:
"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".

Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários.

```java
import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        // Configurando o locale para usar ponto como separador decimal
        Locale.setDefault(Locale.US);
        
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
        
        // Exibindo a mensagem final
        String mensagem = "Olá " + nomeCliente + 
                         ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
                         ", conta " + numero + 
                         " e seu saldo " + String.format("%.2f", saldo) + 
                         " já está disponível para saque";
        
        System.out.println(mensagem);
    }
}

```
Adaptando o projeto para usar o Locale brasileiro (pt_BR) e formatar o saldo como moeda (Real). Aqui está a implementação atualizada:

```java
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
                         " e seu saldo " + saldoFormatado + 
                         " já está disponível para saque";
        
        System.out.println(mensagem);
    }
}
```












