import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        while (true) {
            System.out.print("Nhap diem mon toan: ");
            a = input.nextInt();
            if(a < 0 || a > 10){
                System.out.println("Nhap sai. Nhap lai.");
            }else{
                break;
            }
        }
        int b = 0;
        while (true) {
            System.out.print("Nhap diem mon ly: ");
            b = input.nextInt();
            if(b < 0 || b > 10){
                System.out.println("Nhap sai. Nhap lai.");
            }else{
                break;
            }
        }
        int c = 0;
        while (true) {
            System.out.println("Nhap diem mon toan: ");
            c = input.nextInt();
            if(c < 0 || c > 10){
                System.out.println("Nhap sai. Nhap lai.");
            }else{
                break;
            }
        }
        double tb = (a+b+c)/3;
        if(tb >=5){
            System.out.print("Ban da do");
        }else{
            System.out.println("Ban da truot");
        }
    }
}