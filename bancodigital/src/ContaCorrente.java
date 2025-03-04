public class ContaCorrente extends Conta{
    
    
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato conta corrente ===");
        super.imprimirInformacoes();

    }



    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }
}
