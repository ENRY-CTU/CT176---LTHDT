import java.util.Scanner;

public class Main {
    public static String tachTen(String hoTen){
        hoTen = hoTen.trim();
        int lastSpace = hoTen.lastIndexOf(' ');
        return lastSpace == -1 ? hoTen : hoTen.substring(lastSpace + 1);
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Nhập tên:  ");
        String hoTen = kb.nextLine();

        System.out.println("Tên: " + tachTen(hoTen));

    }
}
