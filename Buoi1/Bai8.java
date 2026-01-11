import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = kb.nextInt();

        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Nhập phần tử thứ " + (i + 1) + " ");
            array[i] = kb.nextInt();
        }
        System.out.print("Nhập số nguyên x: ");
        int x = kb.nextInt();

        int count = 0;
        for(int num: array) if(num == x) count++;

        System.out.println(x +" xuất hiện " + count + " lần");

        for(int i = 0; i < n - 1; i++){
            for(int j = n - 1; j > i; j--){
                if(array[j] < array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(array));
    }
}
