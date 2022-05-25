import java.util.*;

public class VitorAguiar_Exercicio8{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        float menor, maior, alt, area, valorm, valorv;

        System.out.println("Digite o valor da base menor em metros: ");
        menor = teclado.nextFloat();

        System.out.println("Digite o valor da base maior em metros: ");
        maior = teclado.nextFloat();

        System.out.println("Digite o valor da altura em metros: ");
        alt= teclado.nextFloat();

        System.out.println("Digite o preço médio de venda pago por metro quadrado: ");
        valorv = teclado.nextFloat();


        area = ((menor + maior)*alt)/2 ;
        valorm = valorv * area;


        System.out.println("Área do trapézio: " + area + " m².");
        System.out.println("Valor médio de venda do terreno: " + valorm + " R$.");


    }
}
