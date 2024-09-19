import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số ngẫu nhiên: ");
        int n = input.nextInt();
        System.out.println("Các số chẵn chia hét cho 5 nhỏ hơn " + n + " là: ");
        for (int i = 0; i < n; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

    }
}