import java.util.*;

public class VitorAguiar_Exercício14{
public static void main(String[] args){

    float comp, larg, area, potn;  

  Scanner teclado = new Scanner(System.in);

  System.out.println("Digite o comprimento do cômodo: ");
  comp = teclado.nextFloat();

  System.out.println("Digite a largura do cômodo: ");
  larg = teclado.nextFloat();

  area = comp*larg;
  potn = area*18;


  System.out.printf("A potência de iluminação necessária é: %.2f W", potn);


   
  
    }

}
