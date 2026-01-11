import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhập danh sách số thực: ");
        String input = kb.nextLine();
        String[] numbers = input.split(" ");

        double max = Double.NEGATIVE_INFINITY;
        double sum = 0;

        for(String s: numbers){
            try{
                double num = Double.parseDouble(s);
                sum += num;
                if(num > max) max = num;
            }
            catch(NumberFormatException e){
                System.out.println("Bỏ qua " + s + " vì không đúng định dạng");
            }
        }
        System.out.println("Số lớn nhất: " + max);
        System.out.println("Tổng các số bằng: " + sum);
    }
}
