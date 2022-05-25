import java.util.*;

public class VitorAguiar_Exercício1{
public static void main(String[] args){

    float num1, num2, num3, media, soma;

    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite 3 números:");

    num1 = teclado.nextFloat();
    num2 = teclado.nextFloat();
    num3 = teclado.nextFloat();

    soma = num1 + num2 + num3;
    media = soma/3;

    System.out.println("Soma:" + soma);
    System.out.println("Média:" + media);
    
}
}