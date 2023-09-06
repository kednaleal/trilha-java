import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        
        Transacoes transacoes = Transacoes();

        //System.out.printf("O nome é",cliente.nome);
        Scanner in = new Scanner(System.in);
        String nome = in.nextLine();
        Cliente cliente = new Cliente(nome, CPF, dataNascimento, email);

        transacoes.deposito(1000.0);
        transacoes.deposito(500.0);
        transacoes.sacar();
        transacoes.mostrarHistorico();

    }


}
