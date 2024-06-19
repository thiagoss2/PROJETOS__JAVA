package simulacao__banco;

public class GeradorPagamentoCartaoCredito implements GeradorPagamento {

    @Override
    public void processaPagamento(String tipoPagamento) {
        if (tipoPagamento.equals("cartao")) {
            System.out.println("Pagamento realizado com sucesso via Cartão de Crédito");
        } else {
            System.out.println("Pagamento não realizado via Cartão de Crédito");
        }
    }
}
