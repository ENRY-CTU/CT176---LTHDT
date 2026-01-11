import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void PTB1(int a, int b){
        if(a == 0){
            if(b == 0){
                System.out.println("Phuong trinh vo so nghiem");
            }
            else{
                System.out.println("Phuong trinh vo nghiem");
            }
        }
        else{
            System.out.println("x = " + (float)(-b)/a);
        }
    }
    public static void PTB2(int a, int b, int c){
        float delta = b*b - 4*a*c;
        if(a == 0){
            PTB1(b, c);
        }
        else{
            if(delta > 0){
                System.out.println("Phuong trinh co 2 nghiem");
                System.out.println("x1 = " + ((-b + Math.sqrt(delta)) / (2*a)));
                System.out.println("x2 = " + ((-b - Math.sqrt(delta)) / (2*a)));
            }
            else if(delta == 0){
                System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + (float)(-b)/ (2*a));
            }
            else{
                System.out.println("Phuong trinh vo nghiem");
            }
        }
    }
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int a = 0, b = 0, c = 0;
        boolean valid = false;
        while(!valid){
            try{
                System.out.print("Nhap a: ");
                a = Integer.parseInt(kb.nextLine());
                valid = true;
            }
            catch(NumberFormatException e){
                System.out.println("Nhap sai! Vui long nhap lai!");
            }
        }
        valid = false;
        while(!valid){
            try{
                System.out.print("Nhap b: ");
                b = Integer.parseInt(kb.nextLine());
                valid = true;
            }
            catch(NumberFormatException e){
                System.out.println("Nhap sai! Vui long nhap lai!");
            }
        }
        valid = false;
        while(!valid){
            try{
                System.out.print("Nhap c: ");
                c = Integer.parseInt(kb.nextLine());
                valid = true;
            }
            catch(NumberFormatException e){
                System.out.println("Nhap sai! Vui long nhap lai!");
            }
        }
        PTB2(a, b, c);
    }
}
