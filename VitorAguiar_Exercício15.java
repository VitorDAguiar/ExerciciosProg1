import java.util.*;

public class VitorAguiar_Exercício15{
public static void main(String[] args){

    double raio, pi, area;  

    pi = 3.1416;
  Scanner teclado = new Scanner(System.in);

  System.out.println("Digite o valor do raio: ");
  raio = teclado.nextDouble();

  area = (float) (pi * (Math.pow(raio, 2)));


  System.out.printf("A área é: %.2f ", area);


   
  
    }

}
