import java.util.Scanner;

public class NaturalNumbersFor {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        int number= input.nextInt();
        int sum =0;
        for ( int i=1;i<=number;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
