import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();
        Transacoes transacoes = Transacoes();

        
        transacoes.deposito(1000.0);
        transacoes.deposito(500.0);
        transacoes.saque(150.0);
        transacoes.mostrarHistorico();

    }
}
