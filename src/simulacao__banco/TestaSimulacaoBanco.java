package simulacao__banco;

public class TestaSimulacaoBanco {

    public static void main(String[] args) throws IllegalArgumentException {

        // Conta Do Andre
        Titular titular = new Titular("João", "123.456.789-00", "1234567-8");
        titular.setConta(new Conta(46, 2, titular));
        titular.getConta().mostraInformacoes();
        titular.getConta().deposita(1000);
        titular.getConta().mostraInformacoes();

        // try {
        //     titular.getConta().sacar(1200);
        // } catch (IllegalArgumentException e) {
        //    e.printStackTrace();
        // }

        titular.getConta().mostraInformacoes();

        // Conta do Joao
        Titular titular2 = new Titular("Andre", "123.456.789-00", "1234567-8");
        titular2.setConta(new Conta(0032, 06, titular2));
        titular2.getConta().mostraInformacoes();
        titular2.getConta().deposita(1000);
        titular2.getConta().mostraInformacoes();
         
        System.out.println("BLOCO JOAO");
       try {
        titular.getConta().trasferePara(titular2.getConta(), 100.00);
       } catch(IllegalArgumentException e ) {
         e.printStackTrace();
       }
        
        // informaçoes do titular joao
        titular.getConta().mostraInformacoes();
        // informaçoes do titular andre
        titular2.getConta().mostraInformacoes();
 
    }
}
