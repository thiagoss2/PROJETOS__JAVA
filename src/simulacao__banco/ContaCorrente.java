package simulacao__banco;

public class ContaCorrente extends Conta {

    public ContaCorrente(int numero, int digito, Titular titular) {
       super(numero, digito, titular);
    }
    
   
    @Override
    public void mostrarNovasInformacoes() { 
        System.out.println("Informação da conta corrente: ");
    }

}
