public class Transacoes{
    float valor;
    LocalDate vencimento;

    public void pagamento(String nome, String cpf, float valor, String instituicao){
        this.nome = nome;
        this.CPF = cpf;
        this.valor = valor;
        this.instituicao = instituicao;
    
    }

    public void saque(){
        system.out.println("Qual valor deseja sacar");
    }
}
