import java.util.*;

public class VitorAguiar_Exercício13{
public static void main(String[] args){

    float Ano, copas, Anosp;  // Anosp são anos passados

  Scanner teclado = new Scanner(System.in);

  System.out.println("Digite o ano atual: ");
  Ano = teclado.nextFloat();

  Anosp = Ano - 1929;

  copas = Anosp/4-2;


  System.out.printf("O número de copas que já aconteceram até hoje: %.0f", copas);

  // se fizer Anosp = Ano - 1930; sempre mostra uma copa a menos do que realmente se passou e eu esqueci como faz sem burlar o sistema =P
   
  
    }

}
