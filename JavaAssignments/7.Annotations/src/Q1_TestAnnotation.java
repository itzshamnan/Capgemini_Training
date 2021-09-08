@interface Test{
    int value();
    String name() default "Shamnan";
}

public class Q1_TestAnnotation {
    @Test (value=10)
    public int testmethod()
    {
        return  1;
    }
}
