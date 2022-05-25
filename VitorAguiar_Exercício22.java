import java.util.*;

public class VitorAguiar_Exercício22{
public static void main(String[] args){

    float a, b, c;

    
  Scanner teclado = new Scanner(System.in);

  System.out.println("Digite o valor de A: ");
  a = teclado.nextFloat();

  System.out.println("Digite o valor de B: ");
  b = teclado.nextFloat();

  c = a;
  a = b;
  b = c;

  System.out.println("Agora o valor de A é:"+ a);
  System.out.println("E o valor de B é: "+ b);
 


}
}