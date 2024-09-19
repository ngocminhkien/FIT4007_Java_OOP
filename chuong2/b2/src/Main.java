import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Students sv1 = new Students(55555, "NguyenVanA", 8.5f, 9.0f);

        // Tạo đối tượng sv2 với thông tin của người bạn thân nhất
        Students sv2 = new Students(44444, "NgocThiB", 7.5f, 8.0f);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the student code: ");
        int code = sc.nextInt();

        System.out.print("Enter the name: ");
        String name = sc.next();

        System.out.print("Enter the theoretical score: ");
        float theoretic = sc.nextFloat();

        System.out.print("Enter the practical score: ");
        float practical = sc.nextFloat();

        Students std = new Students(code, name, theoretic, practical);
        System.out.printf("%-10s %-20s %-10s %-10s %-10s%n", "MSSV", "Họ tên", "Điểm LT", "Điểm TH", "Điểm TB");
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(std.toString());

    }
}
