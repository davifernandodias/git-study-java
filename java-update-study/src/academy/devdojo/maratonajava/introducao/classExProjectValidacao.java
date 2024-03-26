package academy.devdojo.maratonajava.introducao;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class classExProjectValidacao {
    public static void main(String[] args) {
        tentativaDeLigacao();
    }
    static void tentativaDeLigacao(){
        
        String [] candidatos = {"FELIPE","MARCIA","PEDRO","JOAO","SOUSA"};
        for (String canditato:candidatos){
            entrandoEmContato(canditato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("contato realizado com sucesso");
            tentativasRealizadas++;
        }while(tentativasRealizadas<2);
        if (atendeu)
            System.out.println("conseguimos contato com a "+ candidato + " na " + tentativasRealizadas);
        else
            System.out.println("não conseguimos contato com "+ candidato + " numero maximo de tentativas realizados "+ tentativasRealizadas);
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE","MARCIA","PEDRO","JOAO","SOUSA"};
        System.out.println("imprimir a lista de candidatos seleciolancos");

        for(int i=0;i<candidatos.length;i++){
            System.out.println("o candidato de n " + (i+1) +" E " + candidatos[i] );
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE","MARCIA","PEDRO","JOAO","SOUSA","PATRICIA"};
        int candidatoAtual =0;
        int candidatosSelecionados = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados<5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("o candidato "+ candidato +" solicitou este valor "+ salarioPretendido);
            if (salarioBase>=salarioPretendido){
                System.out.println("o canditato "+candidato+ " foi selecionado para essa vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
    

    static void analiseCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase>salarioPretendido){
            System.out.println("ligar para candidato");
        } else if(salarioBase==salarioPretendido){
            System.out.println("ligar para candidato com  outra propostra");
        }
        else{
            System.out.println("aguardando o resultado dos demais candidatos");
        }
    }
}
