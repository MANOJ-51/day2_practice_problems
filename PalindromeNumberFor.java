public class PlindromeNumberFor {
    public static void main(String[] args) {
        int number=121;
        int reverse=0;
        int remainder=0;
        int temp;
        temp=number;
        for(  ;number!=0; number=number/10){
            remainder=number%10;
            reverse=reverse*10+remainder;
        }
        System.out.println(reverse);
        if (temp==reverse){
            System.out.println("THE NUMBER IS A PALINDROME");
        }else {
            System.out.println("THE NUMBER IS NOT A PALINDROME");
        }
    }
}
