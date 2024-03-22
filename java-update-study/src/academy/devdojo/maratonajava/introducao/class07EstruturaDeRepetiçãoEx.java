package academy.devdojo.maratonajava.introducao;

public class class07EstruturaDeRepetiçãoEx {
    public static void main(String[] args) {
        for (int i = 0; i<10; i+=2){
            System.out.println(i);
        }
        System.out.println("=======================");
        for (int j =1; j<50;j++){
            if (j>25){
                break;
            }
            System.out.println(j);
        }
    }
}
