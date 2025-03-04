public class main {
    public static void main (String[] args) {
        
        Banco bra = new Banco();
        bra.setNome("brazil bank");





        Cliente p1 = new Cliente("Roberto");
        Cliente p2 = new Cliente("Fernando");

        

        Conta cp = new ContaPoupanca(p1);
        Conta cc = new ContaCorrente(p2);


        bra.addConta(cc);
        bra.addConta(cp);

    
        System.out.println(bra.getContas());


    }
}
