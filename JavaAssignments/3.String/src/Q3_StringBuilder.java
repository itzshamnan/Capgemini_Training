public class Q3_StringBuilder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder();
        str.append("StringBuilder");
        str.append(" is a peer class of String");
        str.append(" that provides much of");
        str.append(" the functionality of Strings.");
        System.out.println(str);
        StringBuilder str1=new StringBuilder("It is used to at the specified index");
        System.out.println(str1);
        str1.insert(13," insert text");
        System.out.println(str1);
        StringBuilder str2=new StringBuilder("This method returns the reversed object on which it was called.");
        System.out.println(str2);
        str2.reverse();
        System.out.println(str2);




    }
}
