import java,util.LocalDate;

public class Cliente{
    public String nome;
    private String CPF;
    LocalDate dataNascimento;
    private String email;
    private int numero_celular;
    String endereco;

    public Cliente (String nome, String  cpf, String email){
        this.nome = nome;
        this.CPF = cpf;
        this.email = email;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.CPF = cpf;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String emmail){
        return email;
    }
    public void acessarConta( String entrarNaConta){
        System.out.println("Digite seu nome: ");
        Scanner in = new Scanner(System.in);
        String nome = in.nextLine();
    }
}
