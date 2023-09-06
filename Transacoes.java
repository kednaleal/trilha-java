import java.time.LocalDate;

public class Transacoes {
    private String destinatario;
    private Double valor;
    private String descricao;
    LocalDate vencimento;

    public Transacao(String destino, LocalDate venc,double valor, String desc){
        this.destinatario = destino;
        this.vencimento = venc;
        this.Valor = valor;
        this.descricao = desc;
    }

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


    public String toString(){
        return "Transação{ " +
        "data=" + data +
        ", valor =" + valor+
        ", descricao = " + desc '}';
    }

}
