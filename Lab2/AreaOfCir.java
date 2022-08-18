// Q. Calculate area and circumference of circle using multiple classes.

public class AreaOfCir {
    public void areaOfCir(double r)
    {   
        double pi=3.14;
        double area=pi*r*r;
        System.out.println("Area of circle ="+area);
    }
    public static void main(String[] args) {
        AreaOfCir ac = new AreaOfCir();
        ac.areaOfCir(5);
        Circumference c = new Circumference();
        c.circumference(5);
    }
}
class Circumference
{
    public void circumference(double r)
    {
        double pi=3.14;
        double circum=pi*pi*r;
        System.out.println("Area of circumfernece ="+circum);
    }
}