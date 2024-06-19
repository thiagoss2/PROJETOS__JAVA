package simulacao__banco;

// idente o codigo pra mim remova os espaços em branco
public class Conta {

    private int numero;
    private double saldo;
    private int digito;
    private Titular titular;
    private int numeroDeSaques;
    private GeradorPagamento geradorPagamento;

    public Conta(int numero, int digito, Titular titular) {
        this.numero = numero;
        this.digito = digito;
        this.titular = titular;
    }

    public void setTipoPagamento(GeradorPagamento geradorPagamento) {
        this.geradorPagamento = geradorPagamento;
    }

    public int getNumeroDeSaques() {
        return numeroDeSaques;
    }

    public int getNumero() {
        return this.numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getDigito() {
        return digito;
    }

    public Titular getTitular() {
        return this.titular;
    }

    public void deposita(double saldo) {
        this.saldo += saldo;
        this.dadosDoDeposto(saldo);
    }

    public void sacar(double saldo) {
        if (saldo > this.saldo) {
            throw new IllegalArgumentException("O VALOR DE SAQUE EXEDE O LIMITE DA CONTA");
        } else {
            this.saldo -= saldo;
            this.numeroDeSaques++;
            this.dadosSaque(saldo);
        }
    }

    public GeradorPagamento getGeradorPagamento() {
        return geradorPagamento;
    }

    public void trasferePara(Conta outraConta, double valor) {
        this.sacar(valor);
        outraConta.deposita(valor);
        mostraDadosTrasferencia(outraConta, valor);
    }

    private void mostraDadosTrasferencia(Conta outraConta, double valor) {
        System.out.println("=== DADOS DA TRASFERENCIA ===");
        System.out.println("Titular da conta de origem: " + this.getTitular().getNome());
        System.out.println("Favorecido: " + outraConta.getTitular().getNome());
        System.out.println("Trasferencia realizada com sucesso");
        System.out.println("Valor: " + valor);
        System.out.println("Conta de origem: " + this.getNumero());
        System.out.println("Conta de destino: " + outraConta.getNumero());
        System.out.println();
    }

    private void dadosDoDeposto(double saldo) {
        System.out.println("=== DADOS DO DEPOSITO ===");
        System.out.println("Titular da conta: " + this.getTitular().getNome());
        System.out.println("Valor depositado: " + saldo);
        System.out.println();
    }

    private void dadosSaque(double saldo) {
        System.out.println("=== DADOS DO SAQUE ===");
        System.out.println("Titular da conta: " + this.getTitular().getNome());
        System.out.println("Valor sacado: " + saldo);
        System.out.println("Numero de saques realizados: " + this.getNumeroDeSaques());
        System.out.println();
    }

    public void mostraInformacoes() {
        this.getTitular().mostraInformacoes();
        System.out.println();
    }

    public void geradorPagamento(String tipoPagamento) {
        this.geradorPagamento.processaPagamento(tipoPagamento);
    }
}
