public interface IConta {
    
// dentro de uma interface não precisa por public, é redundante

    void sacar(double valor);
    
    void depositar(double Valor);

    void transferir(double valor, Conta contaDestino);

}
