import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        boolean check = false;
        int a = 0, b = 0, tong = 0;
        while(!check){
            try{
                System.out.print("Nhập số nguyên a: ");
                a = Integer.parseInt(kb.nextLine());
                check = true;
            }
            catch(NumberFormatException e){
                System.out.println("Sai định dạng, vui lòng nhập lại");
            }
        }
        check = false;
        while(!check) {
            try {
                System.out.print("Nhập số nguyên b: ");
                b = Integer.parseInt(kb.nextLine());
                check = true;
            } catch (NumberFormatException e) {
                System.out.println("Sai định dạng, vui lòng nhập lại");
            }
        }
        System.out.println("Tổng a và b là: " + (tong = a + b));
    }
}
