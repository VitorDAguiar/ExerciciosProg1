import java.util.*;

public class VitorAguiar_Exercicio9{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        float lados, nd;

        System.out.println("Digite o número de lados do polígono: ");
        lados = teclado.nextFloat();

        nd = lados*(lados-3)/2;

       
        System.out.println("O número de diagonais do polígono é: " + nd);


    }
}
