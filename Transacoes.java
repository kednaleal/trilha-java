import java.util.ArrayList;

public class Transacoes{
    private String destinatario;
    private Double valor;
    private String descricao;
    LocalDate vencimento;
    private List<Transacoes> historico;

    historico = new ArrayList<>();

    public String getDestinatario(){
        return destinatario;
    }
    public void setDestinario(String destinatario ){
        this.destinatario = destinatario;
    }
    public String getValor(){
        return valor;
    }
    public void setValor(Double valor ){
        this.valor = valor;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao ){
        this.descricao = descricao;
    }


    public void deposito(Double valor){
        if(valor > 0){
            setSaldo(getSaldo() + valor);
            System.out.println("Depósito feito com sucesso");
        }else{
            System.out.println("Não é possivél depósitar");
        }

        historico.add(transacoes);
    }

    public void sacar(){
        if(valor > 0 && this.getSaldo() >=valor){
            System.out.println("Saque feito com sucesso");
            historico.add(transacoes);
        }
        else{
            System.out.println("Não foi possivél realizar o saque");
        }
    }

    public void mostrarHistorico(){
        System.out.println("Histórico de transações: ");
        for(Transacoes transacoes : historico){
            System.out.println(transacoes);
        }
    }
}
