package academy.devdojo.maratonajava.introducao;

public class class08Array04 {
    public static void main(String[] args) {
        int[] ages = new int[3];
        int[] ages2 = {1,2,3,4,5};
        for (int i=0;i<ages2.length;i++){
            System.out.println(ages2[i]);
        }
        System.out.println(ages);

        for(int i:ages2){
            System.out.println(i);
        }
    }
}
