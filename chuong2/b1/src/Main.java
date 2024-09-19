import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the height: ");
        double height = sc.nextDouble();
        System.out.print("Enter the width: ");
        double width = sc.nextDouble();

        Rectangle rect = new Rectangle(height, width);
        System.out.println(rect.toString());

        sc.close();
    }
}
