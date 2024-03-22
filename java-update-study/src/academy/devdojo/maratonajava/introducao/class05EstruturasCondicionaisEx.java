package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;
public class class05EstruturasCondicionaisEx {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Type From amount: ");
        double amout = sc.nextDouble();
        if (amout <34712 || amout == 0){
            amout *= 0.097;
        } else if (amout >=34712 && amout <= 68507){
            amout *= 0.3735;
        } else {
            amout*=0.495;
        }
        System.out.println(amout);
    }
}
