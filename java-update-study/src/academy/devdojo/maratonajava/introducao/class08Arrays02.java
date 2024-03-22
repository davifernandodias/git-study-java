package academy.devdojo.maratonajava.introducao;

public class class08Arrays02 {
    /**
     * Values Default
     * - byte, short, int, long, float and double 0
     * - char '\u0000' line white
     * - boolean false
     * - String null
     */
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "davis";
        names[1] = "fernando";
        names[2] = "dias";
        
        for (int i=0;i<names.length;i++){
            System.out.print(names[i]+" ");
        }
    }
}
