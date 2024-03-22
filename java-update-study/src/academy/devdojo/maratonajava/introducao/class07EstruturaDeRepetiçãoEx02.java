package academy.devdojo.maratonajava.introducao;

public class class07EstruturaDeRepetiçãoEx02{
    // value of car get amount x portion
    // valuePortion >= 100
    public static void main(String[] args) {
        int valueTotal = 30000;
        for (int portion =1; portion<=valueTotal;portion++){
            double valuePortion = valueTotal/portion;
            if (valuePortion >=1000){
                System.out.println("Portion: "+portion+" Value Portion: "+valuePortion);
            }
        }
    }
}