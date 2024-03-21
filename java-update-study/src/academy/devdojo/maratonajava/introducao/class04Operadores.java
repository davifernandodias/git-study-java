package academy.devdojo.maratonajava.introducao;
public class class04Operadores{
    public static void main(String[] args) {
        int number01 = 10;
        int number02 = 20;
        double result = number01 /(double) number02; // int int retorna int
        System.err.println(result);
        // % resto da divisão
        int resto = 11%2;
        System.out.println(resto);

        // < > <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);

        // and &&
        // or  ||
        // not !

        int recebe = 0;
        recebe++; // chama a variavel e depois adiciona mais um
        recebe--; // chama a variavel e depois subtrai menos um
        System.out.println(recebe);
    }
}