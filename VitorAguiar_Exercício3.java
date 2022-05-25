import java.util.*;

public class VitorAguiar_Exercício3{
public static void main(String[] args){

    double num1, num2, num3, mult, div;

    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite 3 números:");

    num1 = teclado.nextDouble();
    num2 = teclado.nextDouble();
    num3 = teclado.nextDouble();

    if(num3 == 0){
        while (num3 == 0){
        System.out.println("O denominador (3° número), não pode ser igual a 0.");
        System.out.println("Digite novamente seu denominador: ");
        num3 = teclado.nextDouble();
        }
    }

    mult = num1 * num2;
    div = mult/num3;

    System.out.println("Multiplicação: " + mult + " // Divisão: " + div);


}
}