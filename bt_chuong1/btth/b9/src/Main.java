import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        while (true){
            System.out.print("Nhap tuoi: ");
            n = input.nextInt();
            if(n < 1000){
                System.out.println("Nhap sai. Nhap nam 4 so. ");
            }else if(n > 2024){
                System.out.println("Nhap sai. Nhap nam nho hon 2024. ");
            }else{
                break;
            }
        }
        int tuoi = 2024 - n;
        System.out.println("bay gio ban " + tuoi+" tuoi");
        if(tuoi == 0){
            System.out.println("moi sinh chua duoc mot tuoi");
        }
    }
}