import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe Scanner
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        String agencia, nomeCliente;
        int numeroConta;
        float saldo;
        /*Exibir  as mensagens para o nosso usuário
        Obter pela scanner os valores digitados no terminal*/
        System.out.println("Por favor, digite o número da Agência: ");
        agencia = leia.nextLine();
        System.out.println("Por favor, digite o número de sua Conta: ");
        numeroConta = leia.nextInt();
        System.out.println("Por favor, digite o nome do Cliente: ");
        nomeCliente = leia.next();
        System.out.println("Por favor, digite o saldo de sua Conta: ");
        saldo = leia.nextFloat();
        //Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " +
                numeroConta + " e seu saldo R$ " +
                String.format("%.2f",saldo) + " já está disponível para saque.");
        leia.close();
    }
}
