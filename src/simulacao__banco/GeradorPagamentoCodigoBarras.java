package simulacao__banco;

public class GeradorPagamentoCodigoBarras implements GeradorPagamento {

    @Override
    public void processaPagamento(String tipoPagamento) {
        if(tipoPagamento.equals("codigoBarras")){
            System.out.println("Pagamento realizado com sucesso via Código de Barras");
        }
    }
}