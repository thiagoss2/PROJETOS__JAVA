package simulacao__banco;

public class Titular {
    private String nome;
    private String cpf;
    private String rg;
    private Conta conta;



    public Titular(String nome , String cpf, String rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    /**
     * @return Conta return the conta
     */
    public Conta getConta() {
        return conta;
    }

    /**
     * @param conta the conta to set
     */
    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public void mostraInformacoes() {
        System.out.println("=== DADOS DO TITULAR ===");
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("RG: " + this.getRg());
        System.out.println("Numero da conta: " + this.getConta().getNumero());
        System.out.println("Digito: " + this.getConta().getDigito());
        System.out.println("Saldo: R$ " + String.format("%.2f", this.getConta().getSaldo()));
        System.out.println();

    }

}
