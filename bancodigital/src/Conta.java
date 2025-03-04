
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
    
    
    // Métodos
    

    
    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        
    }

    
    /**
     * Serve para sacar o valor da conta. O valor vai ser subtraído da instancia 
     *  
     * @param valor
     */
    @Override
    public void sacar(double valor){
        this.saldo -= valor;
    }


    
    /** 
     * @param valor
     */
    // Método depositar
    @Override
    public void depositar(double valor){
        this.saldo += valor;
    }

    
    
    /** 
     * @param valor
     * @param contaDestino
     */
    @Override
    public void transferir(double valor, Conta contaDestino){

    }

    
    /** 
     * @return int
     */
    public int getAgencia(){
        return this.agencia;
    }

    public int getNumero(){
        return this.numero;
    }

    public double getSaldo(){
        return this.saldo;
    }

}
