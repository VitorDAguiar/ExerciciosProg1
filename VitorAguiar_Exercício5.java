import java.util.*;

public class VitorAguiar_Exercício5{
public static void main(String[] args){

    double salario, grat, imp;
    Scanner teclado = new Scanner(System.in);

    System.out.println("Salário Base em R$:");
    salario = teclado.nextDouble();

    grat = salario + (salario*0.1);

    System.out.println("Salário a receber sem imposto: " + grat);

    imp = grat - (grat*0.05);

    System.out.println("Salário a receber com imposto: " + imp);



    }

}
