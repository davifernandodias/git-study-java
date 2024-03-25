package academy.devdojo.maratonajava.introducao;

public class class08Array01 {
    public static void main(String[] args) {
        int [] ages = new int[3];
        for (int i=0;i<ages.length;i++){
            ages[i]=1+i;
            System.out.println(ages[i]);
        }
    }
}
