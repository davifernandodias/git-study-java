package academy.devdojo.maratonajava.introducao;

public class class08Arrays05 {
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


        for (int i=0;i<days.length;i++){
            for(int j=0;j<days[i].length;j++){
                System.out.println(days[i][j]);
            }
        }

    }
}
