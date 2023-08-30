import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0.0;

        //TO DO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        System.out.println("Por davor, digite o número de sua conta bancária:");
        numero = scanner.nextInt();

        System.out.println("Número  da agência:");
        agencia = scanner.next();
        
        System.out.println("Digite seu nome e sobrenome:");
        scanner.nextLine();
        nomeCliente = scanner.nextLine();

        System.out.println("Digite seu saldo:");
        saldo = scanner.nextDouble();
        
        //Exibir a mensagem conta criada
        System.out.printf("%nOlá %s  obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de R$%.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);
        
        scanner.close();

    }
}