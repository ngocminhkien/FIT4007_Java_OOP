import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        int a = input.nextInt();

        System.out.print("Nhap so thu hai: ");
        int b = input.nextInt();
        if(a > b){
            System.out.println("So lon la a bang "+a);
            System.out.println("So be la b bang "+b);
        } else if (a < b) {
            System.out.println("So lon la b bang "+b);
            System.out.println("So be la a bang "+a);
        }else{
            System.out.println("hai so a va b bang nhau cung bang "+a);
        }
    }
}