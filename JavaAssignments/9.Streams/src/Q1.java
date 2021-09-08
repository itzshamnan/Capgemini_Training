import java.util.Arrays;
import java.util.List;

class fruit{
    String name;int calories;
    int price;
    String color;

    public fruit(String name, int calories, int price, String color) {
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.color = color;
    }
}

class News {
    String postedByUser;
    int newsId;
    String comment;
    String commentByUser;

    public News(String postedByUser, int newsId, String comment, String commentByUser) {
        this.postedByUser = postedByUser;
        this.newsId = newsId;
        this.comment = comment;
        this.commentByUser = commentByUser;
    }
}

class Trader{
    String name;
    String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }
}

class Transaction{
    Trader trader;
    int year;
    int value;

    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }
}

public class Q1 {
    public static void main(String[] args) {

        List<fruit> fruits = Arrays.asList(
                new fruit("Mango",78,150,"Green"),
                new fruit("Banana",139,90,"Yellow"),
                new fruit("Apple",40,110,"Red"),
                new fruit("Grape",680,80,"Purple")

        );
        System.out.println("Fruit with Calorie<100 in the descending order..");
        fruits.stream()
                .filter(p->p.calories<100)
                .sorted((o1, o2) -> (o1.calories> o2.calories)?-1: (o1.calories< o2.calories)?1:0)
                .forEach(p->System.out.println(p.name));


        System.out.println("Color Wise list of Fruits");
        fruits.stream()
                .sorted((o1, o2) -> (o1.color.equals(o2.color))?1:-1)
                .forEach(p->System.out.println(p.name+" "+p.color));

    }


}
