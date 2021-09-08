public class Q1_StringClass {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Length of 'Hello World' is :"+str.length());

        String str1="Hello";
        String str2=" How are you";
        String str3=str1.concat(str2);
        System.out.println("Using + operator :"+str1+str2);
        System.out.println("Using concat method :"+str3);

        String strr="Java String pool refers to collection of Strings which are stored in heap memory";
        System.out.println(strr.toLowerCase());
        System.out.println(strr.toUpperCase());
        System.out.println(strr.replace('a','$'));
        System.out.println(strr.contains("collection"));
        String strrr="java string pool refers to collection of strings which are stored in heap memory";
        if(strr==strrr)
            System.out.println("Equal using ==");
        else
            System.out.println("Not equal using ==");
        if(strr.equals(strrr))
            System.out.println("Equal using equals()");
        else
            System.out.println("Not equal using equals()");
        if(strr.equalsIgnoreCase(strrr))
            System.out.println("Equal using equalsIgnoreCase()");
        else
            System.out.println("Not equal using equalsIgnoreCase()");

    }
}
