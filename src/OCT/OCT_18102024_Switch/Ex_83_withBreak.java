package OCT.OCT_18102024_Switch;

import java.util.Scanner;

public class Ex_83_withBreak
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Day Value Between 1 to 7 :");
        int day=sc.nextInt();

        switch (day)
    {
        case 1:
            System.out.println("The day you enter is Monday");
            break;
        case 2:
            System.out.println("The day you enter is Tuesday");
            break;
        case 4:
            System.out.println("The day you enter is Thursday");
            break;
        case 5:
            System.out.println("The day you enter is Friday");
            break;
        case 6:
            System.out.println("The day you enter is Saturday");
            break;
        case 7:
            System.out.println("The day you enter is Sunday");
            break;
        default:
            System.out.println("Wrong Number Enter");

    }


    }
}
