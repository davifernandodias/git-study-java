public class SmartTV {
    boolean on = false;
    int channel =1;
    int sons = 50;

    public void onTV(){
        on = true;
        System.out.println( "TV calling...");
    }
    public void offTV(){
        on = false;
        System.out.println( "TV turning off...");
    }
    public void increaseSons(){
        sons++;
        System.out.println("increase volume "+sons);
    }
    public void toDecreaseSons(){
        sons--;
        System.out.println("to deincrease volume  "+sons);
    }
    public void changeChannel(int newchannel){
        channel = newchannel;
        System.out.println("channel change for " +channel);
    }
}
