import java.util.*;

public class VitorAguiar_Exercício23{
public static void main(String[] args){

    int a, b, c, ab, ac, bc, abc, entrevistados, nenhuma;

    
  Scanner teclado = new Scanner(System.in);

  System.out.println("Quantos telespectadores foram entrevistados?: ");
  entrevistados = teclado.nextInt();

  System.out.println("Quantos telespectadores gostam da novela A?: ");
  a = teclado.nextInt();

  System.out.println("Quantos telespectadores gostam da novela B?: ");
  b = teclado.nextInt();

  System.out.println("Quantos telespectadores gostam da novela C?: ");
  c = teclado.nextInt();

  System.out.println("Quantos telespectadores gostam das novelas A e B?: ");
  ab = teclado.nextInt();

  System.out.println("Quantos telespectadores gostam das novelas A e C?: ");
  ac = teclado.nextInt();

  System.out.println("Quantos telespectadores gostam das novelas B e C?: ");
  bc = teclado.nextInt();

  System.out.println("Quantos telespectadores gostam das novelas A, B e C?: ");
  abc = teclado.nextInt();

  
  nenhuma =  entrevistados - (a + b + c - ab - ac - bc + abc);

  System.out.println("O numero de telespectadores que não gostam de nenhuma novela é: "+ nenhuma);

 
}
}