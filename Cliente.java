import java,util.LocalDate;

public class Cleinte{
    String nome;
    String CPF = "777.333.456-00";
    LocalDate dataNascimento;
    String email = "aluno@gmail.com";
    int numero_celular = 966668899 ;
    String endereco = "Avenida Getúlio Vagas";
}

public void acessarConta( String entrarNaConta){
    System.out.println("Digite seu nome: ");
    Scanner in = new Scanner(System.in);
    String nome = in.nextLine();
}