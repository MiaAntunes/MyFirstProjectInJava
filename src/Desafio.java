package src;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Estela";
        String tipoDeConta = "Corrente";
        double saldo = 2500.00;
        int opcaoDesejada = 0;

        System.out.println("*****************************");
        System.out.println("Dados iniciais do cliente\n");
        System.out.println("Nome: " + nome );
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo Inicial: " + saldo + "\n");
        System.out.println("***************************** \n");

        String menu = """
                *** Digite sua opção ***
                 1 - Consultar saldo
                 2 - Receber valor
                 3 - Transferir valor
                 4 - Sair
                """;

        Scanner leitura = new Scanner(System.in);


        while (opcaoDesejada != 4){
            System.out.println(menu);
            System.out.println("Digite a opção desejada: ");
            opcaoDesejada = leitura.nextInt();

            if (opcaoDesejada == 1){
                System.out.println("Saldo da conta: " + saldo + "\n");
            } else if (opcaoDesejada == 2) {
                System.out.println("Qual o valor a receber: \n");
                double valorRecebido = leitura.nextDouble();
                saldo += valorRecebido;

            } else if (opcaoDesejada == 3) {
                System.out.println("Qual o valor que você deseja tranferir");
                double valorTransferido = leitura.nextDouble();
                if (valorTransferido < saldo){
                    saldo -= valorTransferido;
                    System.out.println("Trasferência Feita com sucesso!");
                }else{
                    System.out.println("Você não tem saldo suficiente");
                }

            } else if (opcaoDesejada == 4) {
                System.out.println("Encerrando a sessão");

            } else{
                System.out.println("Número Inválido");
            }
        }

    }


}
