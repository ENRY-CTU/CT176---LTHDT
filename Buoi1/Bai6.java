import java.util.Scanner;

public class Main {
    public static boolean primeNumber(int integer){
        if(integer < 2){
            return false;
        }
        for(int i = 2; i*i < integer; i++){
            if(integer % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Nhập vào 1 số nguyên: ");
        int integer = kb.nextInt();
        boolean isPrimeNumber = primeNumber(integer);
        if(isPrimeNumber){
            System.out.println(integer + " là số nguyên tố");
        }
        else{
            System.out.println(integer + " không là số nguyên tố");
        }
    }
}
