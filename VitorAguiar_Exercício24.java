import java.util.*;

public class VitorAguiar_Exercício24{
public static void main(String[] args){

    double a, b, c, delta, x1, x2;

    
  Scanner teclado = new Scanner(System.in);

  System.out.println("Digite o valor do coeficiente A: ");
  a = teclado.nextDouble();

  System.out.println("Digite o valor do coeficiente B: ");
  b = teclado.nextDouble();

  System.out.println("Digite o valor do coeficiente C: ");
  c = teclado.nextDouble();


  delta = (Math.pow(b, 2)) - (4*a*c);


  System.out.println("----------------------------------------");
    System.out.println("Delta: "+ delta);
    System.out.println("");
 

  if(delta < 0){
      System.out.println("Delta menor que 0, a equação não possui raíz real.");
  }

  else if(delta == 0){
      x1 = -b/(2*a);
      System.out.println("A equação possui apenas uma raíz real, que é: "+ x1);
  }

  else if(delta > 0){
    x1 = (-b + Math.sqrt(delta))/(2 * a);
        System.out.println("Primeira raíz da equação: "+ x1);

        System.out.println("");

    x2 = (-b - Math.sqrt(delta))/(2 * a);
        System.out.println("Primeira raíz da equação: "+ x2);
  }

  


 


}
}