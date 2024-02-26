public class App {
    public static void main(String[] args) throws Exception {
        String sigla = "M";
        
        switch (sigla){
            case "a":{
                System.out.println("A");
                break;
            }
            case "M": {
                System.out.println("fala");
                break;
            }
            default:{
                System.out.println("nome");
            }
        }
    }
}
