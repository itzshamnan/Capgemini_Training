class pair<K,V>{
    K key;
    V value;


    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
public class Q4_HashMap {
    public static void main(String[] args) {
        pair<String,String > obj1=new pair<>();
        pair<String,java.util.Date > obj2=new pair<>();

        obj1.setKey("hello");
        obj1.setValue("yes?");

        obj2.setKey("Date");
        obj2.setValue(new java.util.Date());


        System.out.println("obj1 key: "+obj1.getKey()+" value: "+obj1.getValue());
        System.out.println("obj2 key: "+obj2.getKey()+" value: "+obj2.getValue());
    }
}
