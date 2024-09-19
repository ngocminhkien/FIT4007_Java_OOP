import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i =0;
        while (true){
            System.out.print("Nhap so luong san pham: ");
            i = input.nextInt();
            if(i <= 0){
                System.out.println("Nhap sai. Vui long nhap lai");
            }else{
                break;
            }
        }
        int n = 0;
        while (true){
            System.out.print("Nhap gia mot san pham: ");
            n = input.nextInt();
            if(n <= 0){
                System.out.println("Nhap sai. Vui long nhap lai");
            }else {
                break;
            }
        }
        int gia = n * i;
        double thue = gia * 0.2;
        double tong = gia + thue;
        System.out.println("Gia khi mua "+i+" san pham voi gia "+n+" moi san pham bang "+gia);
        System.out.println("Thue khi mua "+i+" san pham voi gia "+n+" moi san pham bang "+thue);
        System.out.println("Tong tienphai tra khi mua "+i+" san pham voi gia "+n+" moi san pham bang "+tong);
    }
}