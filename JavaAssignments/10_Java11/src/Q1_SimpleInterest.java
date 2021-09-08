import java.util.function.Consumer;
class si {
    int princple;
    double rate;
    int time;

    public si(int princple, double rate, int time) {
        this.princple = princple;
        this.rate = rate;
        this.time = time;
    }
}

public class Q1_SimpleInterest {
    public void A10_q1() {
    }

    public static void main(String[] args) {
        si obj1 = new si(280600, 23.5D, 5);
        Consumer<si> calculate = (p) -> {
            double tamt = (double)(p.time * p.princple) * p.rate;
            tamt /= 100.0D;
            System.out.println(tamt);
        };
        calculate.accept(obj1);
    }
}
