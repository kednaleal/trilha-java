import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();
        cliente.nome = "Kedna";
        cliente.cpf = "000.111.333 - 22";
        cliente.dataNascimento = LocalDate.of(2000,3,13);
        cliente.email = "aluno@gmail.com";

        Transacoes transacoes = Transacoes();


        transacoes.deposito(1000.0);
        transacoes.deposito(500.0);
        transacoes.sacar();
        transacoes.mostrarHistorico();

    }


}
