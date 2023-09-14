

public class Cliente{
    public String nome;
    private String cpf;
    private String  dataNascimento;
    private Conta conta;

    public Cliente(String nome, String cpf, String dataNascimento, Conta conta){
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.conta = conta;
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
    public String getDataNascimento(){
        return dataNascimento;
    }
    

}
