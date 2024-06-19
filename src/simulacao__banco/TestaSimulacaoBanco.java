package simulacao__banco;

public class TestaSimulacaoBanco {

    public static void main(String[] args) throws IllegalArgumentException {

        // Conta Do Andre
        Titular titular = new Titular("João", "123.456.789-00", "1234567-8");
        titular.setConta(new ContaCorrente(0032, 5028, titular));
        titular.getConta().setTipoPagamento(new GeradorPagamentoCartaoCredito());
        titular.getConta().getGeradorPagamento().processaPagamento("cartao");
        titular.getConta().setTipoPagamento(new GeradorPagamentoCodigoBarras());
        titular.getConta().getGeradorPagamento().processaPagamento("codigoBarras");

    }
}
