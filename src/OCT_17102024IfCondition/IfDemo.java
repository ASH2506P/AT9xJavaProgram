package OCT_17102024IfCondition;

import java.util.Scanner;

public class IfDemo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int A=sc.nextInt();

        if(A>18)
        {
            System.out.println("Allow to voting");
        }
        else
        {
            System.out.println("Not allow to voting");
        }

    }
}
