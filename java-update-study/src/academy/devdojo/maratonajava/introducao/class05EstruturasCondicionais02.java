package academy.devdojo.maratonajava.introducao;

public class class05EstruturasCondicionais02 {
    public static void main(String[] args) {
        double salary = 3000;
        String mensgagemDoar = "eu vou doar 500 pro devDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter";
        String result = salary > 5000? mensgagemDoar : mensagemNaoDoar;
        System.out.println(result);
    }
}
