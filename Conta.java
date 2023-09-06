public class Conta{
    private int agencia;
    private String numeroConta;
    private Double saldo = 0.0;

     public Conta(int agencia, Double  saldo, String numeroConta){
        this.agencia= agencia;
        this.saldo = saldo;
        this.numeroConta= numeroConta;
    }

    public int getAgencia(){
        return agencia;
    }
    public void setAgencia(int agencia){
        this.agencia = agencia;
    }
    public String getNumeroConta(){
        return numeroConta;
    }
    public void setNumeroConta(String Conta){
        this.numeroConta = Conta;
    }
    public Double getSaldo(){
        return saldo;
    }
    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }

    
    
}

