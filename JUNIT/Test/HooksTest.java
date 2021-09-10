import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class HooksTest {
    Hooks h1;
    @BeforeEach
    void setUp() {
        System.out.println("Printing before Each");
        h1 = new Hooks();
    }
    @AfterEach
    void aVoid(){
        System.out.println("printing after each");
    }
    @BeforeAll
    public static  void setH1(){
        System.out.println("printing before all..!");
    }

    @AfterAll
    public static void eg(){
        System.out.println("Printing after all");
    }
    @Test
    public void testingprint1() {
        Hooks h1 = new Hooks();
        int i = h1.printmessage(20);
        Assert.assertEquals("This is working",1,i);
    }

    @Test
    public void testingprint2() {
        Hooks h1 = new Hooks();
        int i = h1.printmessage(8);
        Assert.assertEquals("This is working",0,i);
    }

}