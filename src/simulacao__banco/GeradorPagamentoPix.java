package simulacao__banco;

public class GeradorPagamentoPix implements GeradorPagamento {

    @Override
    public void processaPagamento(String tipoPagamento) {
        if(tipoPagamento.equals("pix")){
            System.out.println("Pagamento realizado com sucesso via Pix");
        }
    }
   
}