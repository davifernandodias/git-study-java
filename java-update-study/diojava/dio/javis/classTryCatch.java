import java.util.InputMismatchException;
import java.util.Scanner;

public class classTryCatch {
/**
 *treatment de exeções
 */
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("tpye a number");
            int number = sc.nextInt();
            System.out.println(number);
        }
        catch (InputMismatchException e){
            System.out.println("value informed is different of Integer");
    }
    }
}


