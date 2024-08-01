import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite os dados da conta");
        System.out.print("Número: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Titular: ");
        String holder = scanner.nextLine();
        System.out.print("Saldo inicial: ");
        double balance = scanner.nextDouble();
        System.out.print("Limite de saque: ");
        double withdrawLimit = scanner.nextDouble();

        Account acc = new Account(number, holder, balance, withdrawLimit);

        System.out.println();
        System.out.print("Valor para saque: ");
        double amount = scanner.nextDouble();

        try{
            acc.withdraw(amount);
            System.out.printf("Novo saldo: %.2f", acc.getBalance());
        } catch(BusinessException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}