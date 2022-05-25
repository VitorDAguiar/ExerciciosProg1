import java.util.*;

public class VitorAguiar_Exercício6{
public static void main(String[] args){

    double salariofix, salariograt, grat, vendas;
   

    Scanner teclado = new Scanner(System.in);

    System.out.println("Salário Base em R$: ");
    salariofix = teclado.nextDouble();

    System.out.println("Valor de vendas em R$: ");
    vendas = teclado.nextDouble();

    grat = vendas * 0.04;
    salariograt = salariofix+grat;

    System.out.println("Salário a receber: " + salariograt);



    }

}
