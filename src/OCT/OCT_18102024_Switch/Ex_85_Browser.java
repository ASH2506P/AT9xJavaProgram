package OCT.OCT_18102024_Switch;

import java.util.Scanner;

public class Ex_85_Browser {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Browser u want :");
        String brow= sc.next();
        brow=brow.toLowerCase();

        switch (brow)
        {
            default:
                System.out.println("Enter your browser not allowed");
                break;
            case "chrome":
                System.out.println("Enter your browser is chrome");
                    break;
            case "Firefox":
                System.out.println("Enter your browser is Firefox");
                break;
            case "Intenet":
                System.out.println("Enter your browser is Intenet");
                break;
            case "ucbrowser":
                break;


        }


    }
}
