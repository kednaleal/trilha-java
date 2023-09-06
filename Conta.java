import java.util.ArrayList;
import java.util.List;

public class Conta{
    private int agencia;
    private String numeroConta;
    private Double saldo = 0.0;

    List <Transacao> mostrarHistorico;

    public Conta(int agencia, Double  saldo, String numeroConta){
        this.agencia = agencia;
        this.saldo = saldo;
        this.numeroConta= numeroConta;
        this.mostrarHistorico = new ArrayList<>();
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

    public void mostrarHistorico(){
        System.out.println("Histórico de transações: ");
        for(Transacoes transacoes : historico){
            System.out.println(transacoes);
        }
        System.out.println("##############");
    }
    public void addHistorico(double valor, String descricao){
        Transacao t = new Transacao(Local.Date.now(), valor, descricao);
        mostrarHistorico.add(t);
    }
    public void sacar(){
        if(valor > 0 && this.getSaldo() >=valor){
            this.saldo -= valor;
            addHistorico(valor, "saque")
            System.out.println("Saque feito com sucesso");
        }
        else{
            System.out.println("Não foi possivél realizar o saque");
        }
    } 
    public void deposito(Double valor){
        if(valor > 0){
            this.saldo += valor;
            addHistorico(valor, "deposito")
            System.out.println("Depósito feito com sucesso");
        }else{
            System.out.println("Não é possivél depósitar");
        }

    
    }

    
    
}

