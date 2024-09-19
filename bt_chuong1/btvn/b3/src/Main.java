import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        while (true) {
            System.out.print("Nhập số ngẫu nhiên: ");
            n = input.nextInt();
            if (n < 0) {
                System.out.println("Nhập sai! Hãy nhập số nguyên dương.");
            } else {
                break;
            }
        }
        System.out.println("Các ước số của n là.");
        for (int i = 0; i <= n; i++) {
            if( i % 3 == 0){
                System.out.println(i);
            }
        }
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if( i % 3 == 0){
                count++;
            }
        }
        System.out.print("Số lượng ước số của "+n+" là: "+count);
    }
}