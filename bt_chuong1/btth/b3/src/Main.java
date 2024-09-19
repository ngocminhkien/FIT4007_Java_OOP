import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        while (true) {
            System.out.print("Nhap mot gia tri: ");
             n = input.nextInt();
            if( n < 0){
                System.out.println("Nhap sai. Nhap gia tri duong");
            }else{
                break;
            }
        }
        if( n % 2 == 0){
            System.out.println("So "+n+" la so chan.");
        }else{
            System.out.println("So "+n+" la so le.");
        }
    }
}