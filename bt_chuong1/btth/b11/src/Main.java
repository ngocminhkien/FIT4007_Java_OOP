import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = 0;
        while (true) {
            System.out.print("Nhap ban kinh duong tron: ");
            r = input.nextInt();
            if(r < 0 ){
                System.out.println("Nhap sai. Nhap lai");
            }else{
                break;
            }
        }
        double pi = 3.141592654;
        double C = 2 * pi * r;
        double S = pi * ( r * r );
        System.out.println("C = " + C);
        System.out.println("S = " + S);
    }
}