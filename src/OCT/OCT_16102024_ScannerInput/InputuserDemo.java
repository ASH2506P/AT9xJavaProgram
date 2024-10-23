package OCT.OCT_16102024_ScannerInput;

import java.util.Scanner;

public class InputuserDemo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Age:");
        int age=sc.nextInt();
        System.out.println(age>25?"Allow to Drink":"Not allow to Drink");


    }
}
