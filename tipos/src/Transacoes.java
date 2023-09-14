
public class Transacoes {
    private String destinatario;
    private int valor;
    private String descricao;
    public String vencimento;

    public Transacoes(String destino, String venc,int valor, String desc){
        this.destinatario = destino;
        this.vencimento = venc;
        this.valor = valor;
        this.descricao = desc;
    }

    public String getDestinatario(){
        return destinatario;
    }
    public void setDestinario(String destinatario ){
        this.destinatario = destinatario;
    }
    public int getValor(){
        return valor;
    }
    public void setValor(int valor ){
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
        "data=" + vencimento +
        ", valor =" + valor+
        ", descricao = " + descricao + " } ";
    }

}
