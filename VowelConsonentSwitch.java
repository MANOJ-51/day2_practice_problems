import java.util.Scanner;

public class VowelConsonentSwitch {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("ENTER A CHARACTER:");
        char alphabet=input.next().charAt(0);
        switch(alphabet){
            case 'a':
                System.out.println("ALPHABET IS VOWEL");
                break;
            case 'e':
                System.out.println("e"+" IS A VOWEL");
                break;
            case'i':
                System.out.println("i IS A VOWEL");
                break;
            case 'o':
                System.out.println("o IS A VOWEL");
                break;
            case 'u':
                System.out.println("u IS A VOWEL");
                break;
            default:
                System.out.println(alphabet+" IS A CONSONENT");
        }
    }
}
