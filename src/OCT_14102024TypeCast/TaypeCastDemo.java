package OCT_14102024TypeCast;

public class TaypeCastDemo
{
 public static void main(String[] args)
 {
     int num = 100;          // int type
     long longNum = num;    // implicit casting from int to long
     double doubleNum = longNum; // implicit casting from long to double

     System.out.println("Integer: " + num);      // Output: 100
     System.out.println("Long: " + longNum);      // Output: 100
     System.out.println("Double: " + doubleNum);  // Output: 100.0
 }
}
