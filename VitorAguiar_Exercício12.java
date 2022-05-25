import java.util.*;

public class VitorAguiar_Exercício12{
public static void main(String[] args){

    double ruaA, ruaB, ruaC, ruaC2, meta, quart, voltas;
    
   
  Scanner teclado = new Scanner(System.in);

  System.out.println("Digite a medida da rua A em metros: ");
  ruaA = teclado.nextDouble();

  System.out.println("Digite a medida da rua B em metros: ");
  ruaB = teclado.nextDouble();

  System.out.println("Digite o valor de km que é necessário caminhar: ");
  meta = (teclado.nextDouble() * 1000);


  ruaC2 = (Math.pow(ruaA, 2))+(Math.pow(ruaB, 2));
  ruaC = Math.sqrt(ruaC2);
 
  quart = ruaA + ruaB + ruaC;

  voltas = meta/quart;





  System.out.printf("O número de voltas necessárias para atingir a meta é de: %.2f", voltas);
   
  
    }

}
