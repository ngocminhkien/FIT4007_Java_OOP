import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        int n = input.nextInt();
        System.out.print("Nhap so thu hai: ");
        int i = input.nextInt();

        int s = n + i;
        int H = n - i;
        int Tich = n * i;

        System.out.println("tong cua "+n+" va "+i+" bang "+s);
        System.out.println("hieu cua "+n+" va "+i+" bang "+H);
        System.out.println("tich cua "+n+" va "+i+" bang "+Tich);
        if(i == 0){
            System.out.print("Khong co ket qua.");
        }else{
            float T = n / i;
            System.out.println("thuong cua "+n+" va "+i+" bang "+T);
        }
    }
}