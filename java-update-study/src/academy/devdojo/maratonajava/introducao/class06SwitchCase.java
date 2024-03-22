package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;
public class class06SwitchCase {
    public static void main(String[] args) {
        // imprimir dia da semana
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        byte day = sc.nextByte();
        // char, int, byte, short, enum, String
        switch(day){
            case 1:System.out.println("domingo"); break;
            case 2:System.out.println("segunda"); break;
            case 3:System.out.println("terça"); break;
            case 4:System.out.println("quarta"); break;
            case 5:System.out.println("quinta"); break;
            case 6:System.out.println("sexta"); break;
            case 7:System.out.println("sábado"); break;
        }
    }
}
