import java.util.Scanner;

public class ArithmaticOperators {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the a value");
        int a= scanner.nextInt();
        System.out.println("Enter the b value");
        int b= scanner.nextInt();
        System.out.println("Enter the c value");
        int c= scanner.nextInt();
        System.out.println("a+b*c="+ (a + b * c));
        System.out.println("c+a/b="+ (c + a / b));
        System.out.println("a%b+c="+ (a % b + c));
        System.out.println("a*b+c="+ (a * b + c));
    }
}
