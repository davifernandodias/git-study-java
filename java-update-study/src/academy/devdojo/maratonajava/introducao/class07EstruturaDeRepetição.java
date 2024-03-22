package academy.devdojo.maratonajava.introducao;

public class class07EstruturaDeRepetição {
    /**
     *
     *  ESTRUTURAS DE REPETIÇÕES WHILE, DO WHILE, FOR, VARIAVEL DE CONTROLE I AND X
     */
    public static void main(String[] args) {
        int i = 0;
        while (i <10){
            System.out.println(i);
            i++;
        }
        do {
            System.out.println("dentro do Do");
        } while(i<10);{
            System.out.println(i);

        }
        for (int x = 0;x<10;x++){
            System.out.print(x);
        }
    }
}
