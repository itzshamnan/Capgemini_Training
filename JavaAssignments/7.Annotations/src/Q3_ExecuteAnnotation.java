import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD) //on class level
@interface Execute{
    int sequence() default 0;
}

public class Q3_ExecuteAnnotation {
    @Execute(sequence = 2)
    public static void mymethod1() {
        System.out.println("method 1");
    }

    @Execute(sequence = 3)
    public static void mymethod2() {
        System.out.println("Method 2");
    }

    @Execute(sequence = 1)
    public static void mymethod3() {
        System.out.println("Method 3");
    }

    public static void main(String[] args) throws Exception {

        Q3_ExecuteAnnotation obj = new Q3_ExecuteAnnotation();

        Method methodObject1 = obj.getClass().getMethod("mymethod1");
        Method methodObject2 = obj.getClass().getMethod("mymethod2");
        Method methodObject3 = obj.getClass().getMethod("mymethod3");
        Execute annotationObject1 = methodObject1.getAnnotation(Execute.class);
        Execute annotationObject2 = methodObject2.getAnnotation(Execute.class);
        Execute annotationObject3 = methodObject3.getAnnotation(Execute.class);
        System.out.println("First method Sequence : "+annotationObject1.sequence());
        System.out.println("Second method Sequence : "+annotationObject2.sequence());
        System.out.println("Third method Sequence : "+annotationObject3.sequence());
        System.out.println("Executing in the sequence order ");
        obj.mymethod3();
        obj.mymethod1();
        obj.mymethod2();



    }
}
 /*for (int i = 1;i<=3;i++)
         {
         if (i==m1.getAnnotation(Execute.class).sequence())          //getting sequence of method1
        m.method1();
        if (i==m2.getAnnotation(Execute.class).sequence())          //getting sequence of method2
        m.method2();
        if (i==m3.getAnnotation(Execute.class).sequence())          //getting sequence of method3
        m.method3();

        }*/
