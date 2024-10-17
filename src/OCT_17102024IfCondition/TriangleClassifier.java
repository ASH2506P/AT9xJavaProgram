package OCT_17102024IfCondition;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Your Side1:");
        int side1 = sc.nextInt();
        System.out.println("Enter the Your Side1:");
        int side2 = sc.nextInt();
        System.out.println("Enter the Your Side1:");
        int side3 = sc.nextInt();

        if( side1 >0 && side2 > 0 && side3 > 0)
        {
            if (side1==side2 && side2==side3)
            {
                System.out.println("triangle_type = Equilateral");
            }
            else if (side1==side2 || side2==side3||side1==side3 )
            {
                System.out.println("triangle_type = isosceles");
            }
            else if ((side1 != side2) && (side2 !=side3) && (side1 != side3 ))
             {
               System.out.println("triangle_type = scalene");
            }
        }
        else{
            System.out.println("not allow Zero or less then Zero side value");
        }
    }
}
