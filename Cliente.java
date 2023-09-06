import java.util.LocalDate;

public class Cliente{
    public String nome;
    private String cpf;
    LocalDate dataNascimento;
    private String email;

    public Cliente(String nome, String cpf, LocalDate dataNascimento, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;

    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getcpf(){
        return cpf;
    }
    public void setcpf(String cpf){
        this.cpf = cpf;
    }
    public String getEmail(){
        return email;
    }
    public String setEmail(String Email){
        return email;
    }

    

}
