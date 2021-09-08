interface PrintOrder{
    void check(Q2_Orders var1);
}


public class Q2_Orders {
    int orderID;
    int price;
    String status;

    public Q2_Orders(int orderID,int price, String status) {
        this.orderID=orderID;
        this.price = price;
        this.status = status;
    }
    public void display() {
        System.out.println("Orderid:" + this.orderID + "  Price: " + this.price + "  Status: " + this.status);
    }

    public static void main(String[] args) {
        Q2_Orders ord1=new Q2_Orders(1001,2000,"FAILED");
        Q2_Orders ord2=new Q2_Orders(1003,1500,"ACCEPTED");

        PrintOrder c1 = (obj) -> {
            if (obj.price > 1000 && (obj.status.equalsIgnoreCase("accepted") || obj.status.equalsIgnoreCase("completed"))) {
                obj.display();
            }

        };
        c1.check(ord1);
        c1.check(ord2);
    };
}
