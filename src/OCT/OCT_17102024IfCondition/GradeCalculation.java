package OCT.OCT_17102024IfCondition;

import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Your Marks:");
        int mark = sc.nextInt();

        if(mark>=0 && mark<=100)
          {
             if (mark >= 90 && mark <= 100)
             {
                 System.out.println("Your Grade is A");
             }
            else if (mark >= 80 && mark < 90)
             {
                System.out.println("Your Grade is B");
             }
           else if (mark >= 70 && mark < 80)
             {
                System.out.println("Your Grade is C");
             }
           else if (mark >= 60 && mark < 70)
             {
                System.out.println("Your Grade is D");
             }

           else if (mark<=59)
            {
             System.out.println("Your Grade is F");
            }
          }
        else
        {
            System.out.println("Number Not valid out of range 0 to 100");
        }
    }
}