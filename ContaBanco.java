import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        
        // Criando o objeto Scanner para leitura dos dados do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar e ler os dados do usuário
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();
        
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        
        // Limpar o buffer do scanner antes de ler o próximo texto
        scanner.nextLine();
        
        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.print("Por favor, digite o saldo da Conta: ");
        double saldo = scanner.nextDouble();
        
        // Exibir a mensagem formatada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                           ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
        // Fechar o scanner
        scanner.close();
    }
}
