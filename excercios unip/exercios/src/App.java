import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int elem =3;
        int ac =0;
        System.out.println("informe numeros: ");
        for (int x=0;x<elem;x++){
            int numero = sc.nextInt();
            if(numero%2==0){
                ac +=numero;
            }
        }
        System.out.print(":"+ac);
    }
} 