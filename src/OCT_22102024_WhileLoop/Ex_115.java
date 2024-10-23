package OCT_22102024_WhileLoop;

public class Ex_115 {
    public static void main(String[] args) {
        String age1=args[0];
        int age= Integer.parseInt(age1);
        while (age>0){
            System.out.println(age + "allow to print");
            age--;
        }
        System.out.println(age + "Not allowed");
    }
}
