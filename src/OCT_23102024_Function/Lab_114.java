package OCT_23102024_Function;

public class Lab_114 {
    public static void main(String[] args) {
        // User Defined Functions.

        //  1.Without Parameters and Without Return Type
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4. With Parameters and With Return Type
        System.out.println("Type-1...................");
        // Type1 -->calling
        greet1();

        System.out.println("Type-2...................");
        // Type2 -->calling
        String returned_value = greet2();
        System.out.println(returned_value);

        int x=gree2(18);
        System.out.println("print the Type-2 integer " + x);

        System.out.println("Type-3...................");
        // Type3 -->calling
        greer3("Ashish");
        greer4("ashish","patel");

        System.out.println("Type-4...................");
        // Type4 -->calling
        int A1=greet5(4,6);
        System.out.println(A1);



    }
    //  1.Without Parameters and Without Return Type
    static void greet1() {
        System.out.println("Hi, How are you this is Type1?");
    }

    // 2.Without Parameters but With Return Type

    static String greet2() {
        // Write the code
        System.out.println("Hi, I am Type 2");
        return "Hi,You are awesome";



    }

    static int gree2(int a)
    {
        System.out.println("Type2 integer" );
        return a;
    }

    // 3.With Parameters and Without Return Type

    static void greer3(String str)
    {
        System.out.println("Type-3 Enter name is :" + str);
    }

    static void greer4(String str1,String str2)
    {
        System.out.println("Type-3 Enter name is :" +str1 + str2);
    }

    // 4. With Parameters and With Return Type
    static int greet5(int a, int b)
    {
        System.out.println("Function Type 4: ");
        return a+b;


    }
}
