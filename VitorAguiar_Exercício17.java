import java.util.*;

public class VitorAguiar_Exercício17{
public static void main(String[] args){

    double num, fracionária; 
    int inteira;

    
  Scanner teclado = new Scanner(System.in);

  System.out.println("Digite um número real: ");
  num = teclado.nextDouble();

  inteira = (int) (num + 0);
  fracionária = num - inteira;

  System.out.println("Número real: " + num);
  System.out.println("Parte inteira: " + inteira);
  System.out.printf("Parte fracionária: %.7f", fracionária);



}
}