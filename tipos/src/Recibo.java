public class Recibo{

    private String destinatario;
    private String instituicao;
    private String origem;

    
    public Recibo (String destino, String nomeDoBanco, String origem){
        this.destinatario = destino;
        this.instituicao = nomeDoBanco;
        this.origem = origem;
    }
    public String getDestinatario() {
        return destinatario;
    }
    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    public String getInstituicao() {
        return instituicao;
    }
    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }
    public String getOrigem() {
        return origem;
    }
    public void setOrigem(String origem) {
        this.origem = origem;
    }
    public void compartilhar(){
        System.out.println("Deseja Compartilhar ");
    }

}



