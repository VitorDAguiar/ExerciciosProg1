import java.util.*;

public class VitorAguiar_Exercício2{
public static void main(String[] args){

    int num1, ant, suc;

    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite 1 número:");

    num1 = teclado.nextInt();
    ant = num1 - 1;
    suc = num1 + 1;

    System.out.println("Antecessor: " + ant + " // Sucessor: " + suc);
   
}
}