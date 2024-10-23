package OCT_18102024_Switch;

public class Ex_89DefineArrow {
    public static void main(String[] args) {
        int item=006;

        switch (item){
            case 001 -> System.out.println("print 001");
            case 002 -> System.out.println("print 002");
            case 003 -> System.out.println("Print 003");
            default -> System.out.println("wrong number");
        }
    }
}
