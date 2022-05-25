import java.util.*;

public class VitorAguiar_Exercício7
{
public static void main(String[] args){

    float area, perimetro, base, altura;
   

    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite o valor da base do retângulo: ");
    base = teclado.nextFloat();

    System.out.println("Digite o valor da altura: ");
    altura = teclado.nextFloat();

    perimetro = (base*2)+(altura*2);
    area = base*altura;

    System.out.println("Perímetro do retângulo: " + perimetro + " m.");
    System.out.println("Área do retângulo: " + area + " m².");



    }

}
