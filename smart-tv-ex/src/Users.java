public class Users {
    public static void main(String[] args) throws Exception {
        
        SmartTV smartTV = new SmartTV();

        System.out.println("tv ligada? " + smartTV.on);
        System.out.println("what channel is here? " + smartTV.channel);
        System.out.println("what sons is here? " + smartTV.sons);

        smartTV.onTV();
        System.out.println("tv ligada? " + smartTV.on);
        smartTV.offTV();
        System.out.println("tv ligada? " + smartTV.on);
        smartTV.increaseSons();
        System.out.println("what sons is here? " + smartTV.sons);
        smartTV.toDecreaseSons();
        System.out.println("what sons is here? " + smartTV.sons);
    }

    
}
