import java.util.*;

public class VitorAguiar_Exercício16{
public static void main(String[] args){

    int minutos, horas, resto; 

    
  Scanner teclado = new Scanner(System.in);

  System.out.println("Digite a quantidade de minutos: ");
  minutos = teclado.nextInt();

  resto = minutos%60;
  horas = (minutos-resto)/60;
  

    if(horas == 1){
        if(resto == 0){
        System.out.println(horas + " hora");
        }

        else{
        System.out.println(horas + " hora e " + resto + " minutos");
        }

    }

    else{
        if(resto == 0){
        System.out.println(horas + " horas");
        }

        else{
        System.out.println(horas + " horas e " + resto + " minutos");
        }
    }   
  
    }

}
