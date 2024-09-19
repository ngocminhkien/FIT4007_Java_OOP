import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        while (true) {
            System.out.print("Nhập vào một số: ");
            n = input.nextInt();
            if(n < 0){
                System.out.print("Vui lòng nhập số nguyên dương.");
            }else{
                break;
            }
        }
        if(n % 1 == 0 && n % n == 0){
            System.out.print("Số "+n+" là số nguyên tố.");
        }else{
            System.out.print("Số "+n+" không phải là số nguyên tố.");
        }
    }
}