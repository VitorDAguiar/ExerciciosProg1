import java.util.*;

public class VitorAguiar_Binariox{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double binario, num, i, decimal, resto;
        i = 0;
        decimal = 0;


    
        System.out.println("Digite o número binário: ");
        binario = teclado.nextFloat();
    
            while (i<4){
            resto = (binario%10);
            binario = binario/10;

            num = (int) (resto * Math.pow(2, i));

            decimal += num;
            i++;
            }

        System.out.println("Seu decimal é: " + decimal);


    }
}        