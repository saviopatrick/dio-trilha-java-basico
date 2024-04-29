import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //print do numero da conta
        System.out.println("Número da Conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        //print do nimero da agencia
        System.out.println("Número da Agência:");
        String agencia = scanner.nextLine();

        //print do numero da agencia
        System.out.println("Nome do cliente:");
        String nomeCliente = scanner.nextLine();

        //pint do saldo da conta
        System.out.println("Saldo da conta:");
        double saldo = scanner.nextDouble();

        //print dos resultados
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
