// Q. Java program to find ASCII value of a character.

public class Ascii {
    public void ascii(char a)
    {
        char asc=a;
        int number=asc;
        System.out.println(number);
    }
    public static void main(String[] args) {
        Ascii a = new Ascii();
        a.ascii('A');
        a.ascii('a');
    }
}
