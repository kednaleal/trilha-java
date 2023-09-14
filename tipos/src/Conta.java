import java.util.ArrayList;
import java.util.List;

public class Conta{
    private int agencia;
    private String numeroConta;
    private int saldo = 0;
    List <Transacoes> mostrarHistorico;


    public Conta(int agencia, int saldo, String numeroConta){
        this.agencia = agencia;
        this.saldo = saldo;
        this.numeroConta= numeroConta;
        this.mostrarHistorico = new ArrayList<>();
    }

    public void sacar( double valor){
        if(valor > 0 && this.saldo >=valor){
            this.saldo -= valor;
            addHistorico(valor, "saque");
            System.out.println("Saque feito com sucesso");
        }
        else{
            System.out.println("Não foi possivél realizar o saque");
        }
    } 

    

    public void mostrarHistorico(){
        System.out.println("Histórico de transações: ");
        // for(Transacoes transacoes : historico){
        //     System.out.println(transacoes);
        // }
        System.out.println("##############");
    }

    
    private void addHistorico(double valor, String descricao){
        Transacoes t = new Transacoes("kkkk",  "1990", 100, "saque");
        this.mostrarHistorico.add(t);
    }
   
    public void deposito(Double valor){
        if(valor > 0){
            this.saldo += valor;
            addHistorico(valor, "deposito");
            System.out.println("Depósito feito com sucesso");
        }else{
            System.out.println("Não é possivél depósitar");
        }

    
    }

    
    
}

