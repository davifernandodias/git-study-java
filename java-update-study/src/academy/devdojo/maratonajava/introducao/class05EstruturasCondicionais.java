package academy.devdojo.maratonajava.introducao;

public class class05EstruturasCondicionais {
    public static void main(String[] args) {
        int age = 17;
        boolean togoto = 15 > 20;
        if (age > 17){
            System.out.println("vamo pro puteiro");
        }else if(age<=17){
            System.out.println("não vamos pro puteiro");
        }
        if (!togoto){ // se a condição for falsa e eu quero afirmar ! negação
            System.out.println("não e maior");
        }

    }
}
