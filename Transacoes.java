import java.util.ArrayList;
import java.util.List;

public class Transacoes{
    private static final Transacoes Transacoes = null;
    private String destinatario;
    private Double valor;
    private String descricao;
    LocalDate vencimento;
    private List<Transacoes> historico = new ArrayList<>();

    public String getDestinatario(){
        return destinatario;
    }
    public void setDestinario(String destinatario ){
        this.destinatario = destinatario;
    }
    public Double getValor(){
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

        historico.add(Transacoes);
    }

    private void setSaldo(double d) {
    }
    private Double getSaldo() {
        return null;
    }
    public void sacar(){
        if(valor > 0 && this.getSaldo() >=valor){
            System.out.println("Saque feito com sucesso");
            historico.add(Transacoes);
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
