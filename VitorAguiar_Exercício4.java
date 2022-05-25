import java.util.*;

public class VitorAguiar_Exercício4{
public static void main(String[] args){

    double num1, num2, num3, peso1, peso2, peso3, numerador, denominador, res;

    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite a 1° nota:");
    num1 = teclado.nextDouble();
    System.out.println("Digite o 1° peso:");
    peso1 = teclado.nextDouble();


    System.out.println("Digite a 2° nota:");
    num2 = teclado.nextDouble();
    System.out.println("Digite o 2° peso:");
    peso2 = teclado.nextDouble();


    System.out.println("Digite a 3° nota:");
    num3 = teclado.nextDouble();
    System.out.println("Digite o 3° peso:");
    peso3 = teclado.nextDouble();

    

    numerador = (num1*peso1) + (num2*peso2) + (num3*peso3);
    denominador = peso1 + peso2 + peso3;

    if(denominador == 0){
    System.out.println("O denominador não pode ser igual a 0.");
    }

    else{
    res = numerador/denominador;


    System.out.println("Numerador: " + numerador + " // Denominador: " + denominador);
    System.out.println("Resultado: " +res);
    }

}
}