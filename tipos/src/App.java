

public class App {

    public static void main(String[] args) throws Exception {
      Conta conta = new Conta(1, 100, "123456789");

      Cliente cliente = new Cliente("Samuca", "123.456.789-00", "10/10/2020",  conta);

      System.out.printf(cliente.nome);
        
    }


}
