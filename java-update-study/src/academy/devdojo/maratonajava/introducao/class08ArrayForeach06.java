package academy.devdojo.maratonajava.introducao;

public class class08ArrayForeach06 {
    public static void main(String[] args) {
        int [][] days = new int[3][3];
        // array 1
        days[0][0] = 1;
        days[0][1] = 2;
        days[0][2] = 3;

        // array 2
        days[1][0] = 10;
        days[1][1] = 20;
        days[1][2] = 30;

        // array 3
        days[2][0] = 100;
        days[2][1] = 200;
        days[2][2] = 300;
        
            for(int[] arraybases:days){
                for (int num:arraybases){
                    System.err.println(num);
                }
            }
    }
}
