import java.util.*;

public class VitorAguiar_Exercício10{
public static void main(String[] args){

    double montante, elevado;

   // Valor investido: capital = 2000 
   // Taxa de juros: 0.5/100 = 0.005
   // Tempo: 2 anos = 24 meses
   
  
    elevado = (float) (Math.pow((1+0.005), 24));
    montante = 2000 * elevado;

    
    System.out.printf("O total acumulado em dois anos é: %.2f", montante);
   


    }

}
