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
        System.out.println(annotationObject1.sequence());
        System.out.println(annotationObject2.sequence());
        System.out.println(annotationObject3.sequence());
    }
}
