// Q. Add teo numbers.

public class Add {
    public void add(int a,int b)
    {
        int c=a+b;
        System.out.println("Addition of "+a+" and "+b+" = "+c);
    }
    public static void main(String[] args) {
        Add a = new Add();
        a.add(5, 5);
    }
}
