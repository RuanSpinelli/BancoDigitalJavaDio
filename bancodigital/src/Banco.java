import java.util.ArrayList;
import java.util.List;

public class Banco {
    
    private String nome;
    private List<Conta> contas;

    // Construtor que inicializa a lista de contas
    public Banco() {
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void addConta(Conta conta) {
        this.contas.add(conta);
    }

    public void imprimirContas(){
        for (Conta conta: contas){
            conta.imprimirInformacoes();
        }
    }

}
