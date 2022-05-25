import java.util.*;

public class VitorAguiar_Exercício18{
public static void main(String[] args){

    double salariomin, qwconsm, valorqw, vpresid, desc;

    
  Scanner teclado = new Scanner(System.in);

  System.out.println("Digite o valor do salário mínimo atual: ");
  salariomin = teclado.nextDouble();

  valorqw = salariomin/5;

  System.out.println("Digite a quantidade consumida de quilowatts na residência: ");
  qwconsm = teclado.nextDouble();

  vpresid = qwconsm * valorqw;

  desc = vpresid - vpresid * 0.15;

  System.out.println("O valor pago por quilowatt é: "+ valorqw);
  System.out.println("O valor a ser pago pelo consumo da residência é: "+ vpresid);
  System.out.println("o valor a ser pago com desconto é: "+ desc);




 


}
}