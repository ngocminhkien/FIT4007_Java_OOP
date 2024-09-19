import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        while (true) {
            System.out.print("Nhap mot so ngau hien tu 1 --> 12: ");
            i = input.nextInt();
            if(i < 1 || i > 12){
                System.out.println("Nhap sai. vui long nhap tu 1 --> 12 ");
            }else{
                break;
            }
        }
        if(i == 1){
            System.out.println("Thang 1");
        } else if (i == 2) {
            System.out.println("Thang 2");
        } else if (i == 3) {
            System.out.println("Thang 3");
        } else if (i == 4) {
            System.out.println("Thang 4");
        } else if (i == 5) {
            System.out.println("Thang 5");
        } else if (i == 6) {
            System.out.println("Thang 6");
        } else if (i == 7) {
            System.out.println("Thang 7");
        } else if (i == 8) {
            System.out.println("Thang 8");
        } else if (i == 9) {
            System.out.println("Thang 9");
        } else if (i == 10) {
            System.out.println("Thang 10");
        } else if (i == 11) {
            System.out.println("Thang 11");
        }else{
            System.out.println("Thang 12");
        }
    }
}