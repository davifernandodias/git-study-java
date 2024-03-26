package academy.devdojo.maratonajava.introducao;
import java.util.InputMismatchException;
import java.util.Scanner;
public class trabalho {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        try{
            System.out.println("informed one args integer: ");
            int oneArgs = sc.nextInt();
            System.out.println("informed two args integer: ");
            int twoArgs = sc.nextInt();
            contar(oneArgs, twoArgs);
            
    } catch(InputMismatchException e){
        System.out.println("informed number different of type Integer!!!!!");
    }
    }
    static void contar(int parameterOne, int parameterTwo) throws IllegalArgumentException{
        if (parameterOne > parameterTwo){
            System.out.println("erro, parameter one tem que ser menor que o segundo");
        }
        else if (parameterTwo > parameterOne){
            for(int i = parameterOne;i<parameterTwo+1;i++){
                System.out.println(i);
            }
        }
    }
    
}
