import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.println("informe final");
    int n = sc.nextInt();
    int a = 0,b=1;
    System.out.print(a+" "+ b + " ");
    for (int i = 2; i < n; i++){
        int soma = a + b;
        System.out.print(soma+ " ");
        a = b;
        b = soma;

        

    }

    }
}
