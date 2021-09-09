import java.util.*;

class contact{
    long phnumber;
    String name;
    String email;
    enum gender{
        male,female;
    }
    gender g1;

    public contact(long phnumber, String name, gender g1) {
        this.phnumber = phnumber;
        this.name = name;
        this.g1 = g1;
    }

    public long getPhnumber() {
        return phnumber;
    }

    public String toString(){
        return "Contact: " + this.name +" phone no: "+this.getPhnumber();
    }
}

public class Q1_TreeMap_PhoneNumbers {
    public static void main(String[] args) {
        long mnumber = 987660;
        TreeMap<Long,contact> TreeMap1 = new TreeMap<>(Collections.reverseOrder());
        contact[] contacts=new contact[10];
        long j = 80;

        TreeMap1.put(500L,new contact(91232144,"BLAH", contact.gender.male));
        TreeMap1.put(60L,new contact(97462233,"ABCD", contact.gender.female));

        System.out.println(TreeMap1.keySet());
        System.out.println(TreeMap1.values());
        System.out.println(TreeMap1);

        Iterator it = new Iterator() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        };


    }
}
