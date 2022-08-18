// Q. Calculate area of ractangle.

public class AreaOfRect {
    public void areaOfRact(int l,int b)
    {
        int area=l*b;
        System.out.println("Area of Ractangle ="+area);
    }  
    public static void main(String[] args) {
        AreaOfRect ar = new AreaOfRect();
        ar.areaOfRact(10, 5);
    }  
}
