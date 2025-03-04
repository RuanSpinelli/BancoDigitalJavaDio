
// Classe abstrata, para que apenas os filhos sejam manipulados, está implementando uma interface para as operações de conta
public abstract class Conta implements IConta{
    
    
    // Atributos 

    // Para definir automaticamente os valores de agencia e de número
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    //Os atributos que vão receber informação 
    protected int agencia;
    protected int numero;
    protected double saldo;
    private Cliente cliente;
    
    // Métodos
    

    
    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    
    /**
     * Serve para sacar o valor da conta. O valor vai ser subtraído da instância 
     *  
     * @param valor
     */
    @Override
    public void sacar(double valor){
        this.saldo -= valor;
    }


    
    /** 
     *  Serve para depositar o valor na conta. O valor vai ser adicionado na instância
     * @param valor
     */
    @Override
    public void depositar(double valor){
        this.saldo += valor;
    }

    
    
    /** 
     * Serve para transferir o valor para uma outra conta. Primeiro o valor é sacado (subtraído),
     * para que possa ser depositado em outra conta
     * 
     * @param valor O valor que vai ser transferido.
     * @param contaDestino A conta que vai receber o dinheiro que vai ser transferido.
     */
    @Override
    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInformacoes() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Âgencia: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
    
    
    /** 
     * Serve para obter a agência da conta
     * 
     * @return int Âgencia
     */
    public int getAgencia(){
        return this.agencia;
    }
    
    /**
     * Serve para obter o número da conta
     * 
     * @return int Numero
     */

    public int getNumero(){
        return this.numero;
    }

    /**
     * Serve para obter o saldo que tem na conta
     * 
     * @return Saldo
     */
    public double getSaldo(){
        return this.saldo;
    }

}
