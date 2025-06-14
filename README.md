# DIO Bootcamp Java Back-end - Banco Santander 2025.

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












