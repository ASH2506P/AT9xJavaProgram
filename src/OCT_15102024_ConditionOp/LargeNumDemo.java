package OCT_15102024_ConditionOp;

public class LargeNumDemo {
    public static void main(String[] args)
    {
        int a=100;
        int b=25;
        int c=24;
        int result = (a>b)?a:(b>c)?b:c;

        System.out.println(result);//100


    }
}
