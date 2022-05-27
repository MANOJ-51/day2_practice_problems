public class ReverseNumberWhile {
    public static void main(String[] args) {
        int number=546;
        int reverse=0;
        int reaminder=0;
        while(number !=0){
            reaminder=number%10;
            reverse=reverse*10+reaminder;
            number=number/10;
        }
        System.out.println("reverse number:"+reverse);
    }
}
