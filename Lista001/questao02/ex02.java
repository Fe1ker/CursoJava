import java.util.Scanner;

public class ex02{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        float  n1;
        float  n2;
        
        System.out.println("Digite um número decimal :");
        n1 = entrada.nextInt();
        System.out.println(n1);
        
        
        System.out.println("Digite outro número decimal :");
        n2 = entrada.nextInt();
        System.out.println(n2);

        float soma = n1 + n2;

        System.out.println("O Resultado da soma é : " + soma);
    }
}