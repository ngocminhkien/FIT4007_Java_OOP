import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the account number: ");
        long number = sc.nextLong();

        System.out.print("Enter the account name: ");
        String name = sc.next();

        System.out.print("Enter the balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter the deposit: ");
        double deposit = sc.nextDouble();

        System.out.print("Enter the withdrawal: ");
        double withdrawal = sc.nextDouble();

        System.out.print("Enter the transfer: ");
        double transfer = sc.nextDouble();

        AccountBank ACB = new AccountBank(number, name, balance);
        System.out.println(ACB.toString());
    }
}