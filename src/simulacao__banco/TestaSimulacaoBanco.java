package simulacao__banco;

import java.util.Date;

public class TestaSimulacaoBanco {

    public static void main(String[] args) throws IllegalArgumentException {

      Date date = new Date();

        // Conta Do Andre
        Titular titular = new Titular("João", "123.456.789-00", "1234567-8");
        titular.setConta(new ContaCorrente(0032 , 5028,titular));
        // titular.getConta().mostraInformacoes();
        // titular.getConta().deposita(1000);
        // titular.getConta().mostrarNovasInformacoes();
        // titular.getConta();

       titular.getConta().setTipoPagamento(new GeradorPagamentoCartaoCredito());
       titular.getConta().getGeradorPagamento().processaPagamento("cartao");

       titular.getConta().setTipoPagamento(new GeradorPagamentoCodigoBarras());
       titular.getConta().getGeradorPagamento().processaPagamento("codigoBarras");

     
      //   // try {
      //   //     titular2.getConta().sacar(1200);
      //   // } catch (IllegalArgumentException e) {
      //   //    e.printStackTrace();
      //   // }

      //   titular2.getConta().mostraInformacoes();

      //   // Conta do Joao
      //   Titular titular2 = new Titular("Andre", "123.456.789-00", "1234567-8");
      //   titular2.setConta(new Conta(0032, 06, titular2));
      //   titular2.getConta().mostraInformacoes();
      //   titular2.getConta().deposita(1000);
      //   titular2.getConta().mostraInformacoes();
         
      //   System.out.println("BLOCO JOAO");
      //  try {
      //   titular2.getConta().trasferePara(titular2.getConta(), 100.00);
      //  } catch(IllegalArgumentException e ) {
      //    e.printStackTrace();
      //  }
        
      //   // informaçoes do titular2 joao
      //   titular2.getConta().mostraInformacoes();
      //   // informaçoes do titular2 andre
      //   titular2.getConta().mostraInformacoes();
 
           // Conta Do Andre
        // Titular titular2 = new Titular("João", "123.456.789-00", "1234567-8");
        // titular2.setConta(new ContaCorrente(46, 2, titular2));
        // titular2.getConta().mostraInformacoes();
        // titular2.getConta().deposita(1000);
        // titular2.getConta().mostraInformacoes();

    }
}
