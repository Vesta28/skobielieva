package lesson1;

public class Task5 {
    public static void main(String[] args) {

        String s="Hello world!!!";

        StringBuffer b = new StringBuffer(s);

        b = b.reverse();

        System.out.println(b.toString());
    }

}