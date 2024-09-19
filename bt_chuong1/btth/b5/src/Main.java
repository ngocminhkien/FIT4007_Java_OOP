import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int n = input.nextInt();

        if ( n % 2 == 0 && n % 3 != 0) {
            System.out.println("So "+n+" la so chan va khong chi het cho 3.");
        }else if( n % 2 == 0 && n % 3 == 0) {
            System.out.println("So "+n+" la so chan va chia het cho 3.");
        }else{
            System.out.println("So "+n+" la so le");
        }
    }
}