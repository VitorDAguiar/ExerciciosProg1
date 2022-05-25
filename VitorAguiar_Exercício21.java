import java.util.*;

public class VitorAguiar_Exercício21{
public static void main(String[] args){

    double parede, angulo, seno, escada;

    
  Scanner teclado = new Scanner(System.in);

  System.out.println("Digite a altura da parede: ");
  parede = teclado.nextDouble();
  System.out.println("Digite o valor do ângulo: ");
  angulo = teclado.nextDouble();

  seno = Math.sin(angulo);
  escada = parede/seno;

  System.out.println("A medida da escada será: "+ escada);

}
}