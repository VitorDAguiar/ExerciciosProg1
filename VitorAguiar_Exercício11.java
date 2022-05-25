import java.util.*;

public class VitorAguiar_Exercício11{
public static void main(String[] args){

    double salario, conta1, conta2, saldo, multa1, multa2, porcentagem;
    
   
  Scanner teclado = new Scanner(System.in);

  System.out.println("Digite o valor do seu salário: ");
  salario = teclado.nextFloat();

  System.out.println("Digite o valor da primeira conta: ");
  conta1 = teclado.nextFloat();

  System.out.println("Digite o valor da segunda conta: ");
  conta2 = teclado.nextFloat();

  multa1 = conta1 + (conta1*0.02);

  multa2 = conta2 + (conta2*0.02);

  saldo = salario - (multa1 + multa2);

    
  System.out.printf("O saldo restante após pagar as contas será: %.2f", saldo);
   
  
    }

}
