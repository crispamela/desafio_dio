
    public interface IConta<Conta> {

    
     void sacar(double valor); 

     void depositar(double valor);

     void transferir(double valor, Conta contaDestino);

    }

