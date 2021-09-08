public class Q2_StringBuffer {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer();
        str.append("StringBuffer");
        str.append(" is a peer class of String");
        str.append(" that provides much of ");
        str.append(" the functionality of Strings.");
        System.out.println(str);
        StringBuffer str1=new StringBuffer("It is used to at the specified index");
        System.out.println(str1);
        str1.insert(13," insert text");
        System.out.println(str1);
        StringBuffer str2=new StringBuffer("This method returns the reversed object on which it was called.");
        System.out.println(str2);
        str2.reverse();
        System.out.println(str2);




    }
}
