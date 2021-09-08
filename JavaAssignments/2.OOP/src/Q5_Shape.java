abstract class shape {
    abstract void draw();
}
class line extends shape{
    @Override
    void draw() {
        System.out.println("Line");
    }
}
class rectangle extends shape{
    @Override
    void draw() {
        System.out.println("Rectangle");
    }
}

class circle extends shape{
    @Override
    void draw() {
        System.out.println("Circle");
    }
}


public class Q5_Shape {
    public static void main(String[] args) {


        shape obj1 = new line();
        shape obj2 = new rectangle();
        shape obj3 = new circle();
        obj1.draw();
        obj2.draw();
        ;
        obj3.draw();
    }
}
