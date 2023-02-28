package org.example.list01;

import java.util.Scanner;

class Ex01 {

    /*
    * Uma livraria está fazendo uma promoção para pagamento a vista. O comprador pode escolher entre dois planos de pagamento:

    Critério A: R$ 0,25 por livro + R$ 7,50 fixo
    Critério B: R$ 0,50 por livro + R$ 2,50 fixo
    Faça um programa em que o usuário informe a quantidade positiva e não nula de livros seja impress qual o melhor plano de pagamento.

    Exemplo 1: Entrada = 100 | Saída = Criterio A
    Exemplo 2: Entrada = 5 | Saída = Criterio B
    Exemplo 3: Entrada = 20 | Saída = Indiferente
    Exemplo 4: Entrada = -5 | Saída = Erro
    Qualquer valor fora do domínio de entrada tem como saída esperada a String "Erro".
    */

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int qtdLivros = scanner.nextInt();
        final Ex01 ex = new Ex01();
        System.out.println(ex.compute(qtdLivros));
        scanner.close();
    }

    String compute(int qtdLivros) {
        String result = "Indiferente";

        if (qtdLivros <= 0) return "Erro";

        double precoA = qtdLivros * 0.25 + 7.5;
        double precoB = qtdLivros * 0.5 + 2.5;
        if (precoA < precoB) return "Criterio A";
        if (precoB < precoA) return "Criterio B";
        return result;
    }
}
