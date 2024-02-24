import java.util.Scanner;
public class ContaTerminalQuestion {
    public static void main(String[] args) throws Exception{
        MsgBanks msg = new MsgBanks();
        Scanner sc = new Scanner(System.in);


        String Agencia;
        String NomeCliente;
        double Saldo;
        int Numero;



        System.out.println("Digite agencia: ");
        Agencia = sc.next();

        System.out.println("Digita nome do cliente: ");
        NomeCliente = sc.next();

        System.out.println("Digite saldo: ");
        Saldo = sc.nextDouble();

        System.out.println("Digite numero da conta ");
        Numero = sc.nextInt();

        msg.boasvindas(NomeCliente,Agencia,Numero,Saldo);

    }

}
