import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = input.nextInt();

        System.out.println("Nhap b: ");
        int b = input.nextInt();

        System.out.println("Nhap c: ");
        int c = input.nextInt();

        double b1 = (-b)/a;
        double delta = b*b - 4*a*c;
        double x = -c /a;
        if (a == 0 && b  == 0 ){
            System.out.println("Phương trình bậc nhất có vô số nghiệm.");
            System.out.println("Phương trình bậc hai có nghiệm bằng "+c);
        }else if(a != 0 && b != 0){
            System.out.println("Phương trình bậc nhất có một nghiệm duy nhất "+b1);
            if(delta < 0){
                System.out.println("Phương trình bậc 2 vô nghiệm.");
            }else if( delta > 0){
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình bậc 2 có hai nghiệm phân biệt:");
                System.out.println("x1 = "+x1);
                System.out.println("x2 = "+x2);
            }else{
               double x3 = -b/( 2* a);
               System.out.println("Phương trình bậc 2 có nghiệm kép:");
               System.out.println("x1 = x2 = "+x3);
            }
        }else if( a == 0 && b != 0){
            System.out.println("Phương trình bậc nhất vô nghiệm.");
            double d = -c / b;
            System.out.println("Phương trình bậc 2 trở thành phương trình bậc nhất và bằng "+d);
        }else{
            System.out.println("Phương trình bậc nhất có nghiệm x = 0.");
            if(x > 0){
                double x12 = Math.sqrt(x);
                double x13 = -1* Math.sqrt(x);
                System.out.println("Phương trình bậc 2 có hai nghiệm phân biệt.");
                System.out.println("x1 = "+x12);
                System.out.println("x2 = "+x13);
            }else if(x == 0){
                System.out.println("Phương trình bậc 2 có nghiệm kép.");
                System.out.println("x1 = x2 = 0");
            }else{
                System.out.println("Phương trình bậc 2 vô nghiệm.");
            }
        }
    }
}