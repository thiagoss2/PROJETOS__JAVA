package simulacao__banco;

public class TestaTrasferenciaEntreContas {

    public static void main(String[] args) {

        // Conta Do Joao
        Titular titular = new Titular("João", "123.456.789-00", "1234567-8");
        titular.setConta(new ContaCorrente(3256, 5028, titular));
        titular.getConta().mostraInformacoes();
        titular.getConta().deposita(1000);
        titular.getConta().mostraInformacoes();
        
        // Conta do Andre
        Titular titular2 = new Titular("Andre", "123.456.789-00", "1234567-8");
        titular2.setConta(new Conta(0032, 06, titular2));
        titular2.getConta().mostraInformacoes();
        titular2.getConta().deposita(1000);
        titular2.getConta().mostraInformacoes();

        System.out.println("BLOCO DO ANDRE");
        try {
            titular2.getConta().trasferePara(titular2.getConta(), 100.00);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        // informaçoes do titular2 joao
        titular.getConta().mostraInformacoes();
        // informaçoes do titular2 andre
        titular2.getConta().mostraInformacoes();

    }
}
