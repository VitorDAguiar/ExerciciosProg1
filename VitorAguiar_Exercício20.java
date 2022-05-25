import java.util.*;

public class VitorAguiar_Exercício20{
public static void main(String[] args){

    Float horastrab, horasextra, salariomin, valorhora, vhextra, salario;

    
  Scanner teclado = new Scanner(System.in);

  System.out.println("Digite o número de horas trabalhadas: ");
  horastrab = teclado.nextFloat();
  System.out.println("Digite o número de horas extras trabalhadas: ");
  horasextra = teclado.nextFloat();
  System.out.println("Digite o salário mínimo: ");
  salariomin = teclado.nextFloat();

  valorhora = (float) (horastrab*(salariomin*0.125));
  vhextra = (float) (horasextra*(salariomin*0.25));
  salario = valorhora + vhextra;




 System.out.println("Valor por hora trabalhada: " + valorhora);
 System.out.println("Valor por hora extra trabalhada: "+ vhextra);
 System.out.println("O salário a receber é: "+ salario);




 


}
}