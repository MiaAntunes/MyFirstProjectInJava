package src.Estudos;

public class Rascunhos {
    public static void main(String[] args) {
        // ! Usando uma condição:
        double media = (9.8 + 6.3 + 8)/3 ;
        System.out.println("Média: " + media);

        String senha = "1234";

        if(senha.equals("1234")){
            System.out.println("Acesso autorizado!");
        }else{
            System.out.println("Acesso negado!");
        }


        // ! Casting:
        //É usado quando o tipo de dado de origem é incompatível com o tipo de dado de destino;
        double x = 10.5;
        int y = (int) x; // casting explícito
    }
}
