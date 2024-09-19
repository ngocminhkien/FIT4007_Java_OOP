import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        while (true){
            System.out.print("Nhap so nhau nhien tu 2 --> 8: ");
            n = input.nextInt();
            if(n < 2 || n > 8){
                System.out.println("Nhap sai. Vui long nhap cac so tu 2 --> 8.");
            }else{
                break;
            }
        }
        if( n == 2){
            System.out.println("Thu 2.");
        }else if( n == 3){
            System.out.println("Thu 3");
        }else if( n == 4){
            System.out.println("Thu 4");
        }else if( n == 5){
            System.out.println("Thu 5");
        } else if ( n == 6) {
            System.out.println("Thu 6");
        }else if( n == 7){
            System.out.println("Thu 7");
        }else{
            System.out.println("Chu nhat");
        }
    }
}