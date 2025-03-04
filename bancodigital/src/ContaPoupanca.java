public class ContaPoupanca extends Conta{
    
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato conta corrente ===");
        super.imprimirInformacoes();
    }


    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }


}
