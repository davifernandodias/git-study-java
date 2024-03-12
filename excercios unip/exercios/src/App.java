import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe sexo: M/F");
        String sexo = sc.nextLine();
        sexo = sexo.toLowerCase();
        System.out.println("informe altura");
        double altura = sc.nextDouble();
        if (sexo == "m"){
            double ideal = (72.7*altura)-58;
            System.out.println(ideal);
        } else if (sexo == "f"){
            double ideal = (62.1*altura)-44.7;
            System.out.println(ideal);
        }

    }
}
