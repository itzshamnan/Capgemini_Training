import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE_USE) //on class level
@interface info{
    int AuthorID();
    String Author() default "NIL";
    String Supervisor() default "NIL";
    String Date();
    String Time();
    int Version();
    String Description() default "NIL";

}

@info(AuthorID = 1,Date = "2222",Time = "232434",Version = 1213)
public class Q2_InfoAnnotation {
    @info(AuthorID = 1,Date = "2222",Time = "232434",Version = 1213)
    public int test(){
        return 1;

    }
    public static void main(String[] args) {


    }
}
