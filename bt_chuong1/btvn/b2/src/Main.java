import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số ngẫu nhiên: ");
        int n = input.nextInt();
        System.out.println("Các số lẻ chia hết cho 3 nhỏ hơn "+n+" là.");
        for(int i = 0; i < n; i++){
            if(i % 3 == 0){
                System.out.print(i+" ");
            }
        }
    }
}