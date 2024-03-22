package academy.devdojo.maratonajava.introducao;

public class class08Arrays03 {
    public static void main(String[] args) {
        int [] numbers = new int[3];
        int [] numbers2 ={1,2,3,4,5}; // declarar array com valores
        int [] numbers3 = new int[]{1,2,3,4,5};
        for (int i=0;i<numbers2.length;i++){
            System.out.println(numbers2[i]);
        }
        System.out.println(numbers);
        System.out.println(numbers3);
        System.out.println("======================");
        for(int num:numbers3){
            System.out.println(num);
        }
    }
}
