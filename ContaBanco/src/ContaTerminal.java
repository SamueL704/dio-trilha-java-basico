import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();

        System.out.println("numero da conta: ");
        conta.numero = scanner.nextInt();
        
        System.out.println("agencia: ");
        conta.agencia = scanner.next();
        
        System.out.println("Seu nome: ");
        conta.nomeCliente = scanner.next();

        System.out.println("\nBem vindo "+conta.nomeCliente+" todos os nossos clientes começam com uma bonificação de R$1000 de saldo\n");

        System.out.println("Nome: "+conta.nomeCliente);
        System.out.println("numero da conta: "+conta.numero);
        System.out.println("agencia: "+conta.agencia);
        System.out.println("saldo: "+conta.saldo);
    }
}
