import java.util.*;

public class VitorAguiar_Exercício19{
public static void main(String[] args){

    double num, quad, cubo, raizq, raizc;

    
  Scanner teclado = new Scanner(System.in);

  System.out.println("Digite um número positivo: ");
  num = teclado.nextDouble();

  if(num<=0){
      System.out.println("O número deve ser positivo.");
      return;
  }

  quad = Math.pow(num, 2);
  cubo = Math.pow(num, 3);
  raizq = Math.sqrt(num);
  raizc = Math.cbrt(num);


  System.out.println("O quadrado do número é: "+ quad);
  System.out.println("O cubo do número é: "+ cubo);
  System.out.println("A raiz quadrada do número é: "+ raizq);
  System.out.println("A raiz cúbica do número é: "+ raizc);




 


}
}