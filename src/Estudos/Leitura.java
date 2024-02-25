package src.Estudos;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um filme:");
        String filme = leitura.nextLine();
        System.out.println("Qual seu ano de lançamento?");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Qual sua avaliação?");
        double avaliacao = leitura.nextDouble();


        System.out.println("O Filme é: " + filme + " , seu ano de lançamento é " + anoDeLancamento + " e avaliação é de " + avaliacao);


    }
}
