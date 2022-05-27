import java.util.Scanner;

public class UnitTensHundreds {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Unit Number:");
        int number=input.nextInt();
        if (number==1){
            System.out.println("ONES");
        } else if (number==10) {
            System.out.println("TENS");
        } else if (number==100) {
            System.out.println("HUNDRED");
        } else if (number==1000) {
            System.out.println("thousands");
        }
    }
}
