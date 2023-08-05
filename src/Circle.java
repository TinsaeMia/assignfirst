public class Circle extends Shape{
    private double radius;



    protected   final static double  PI=3.14;

    public void SetRadius(double ra)
    {
        radius=ra;
    }

    public  double getRadius() {
        return radius;
    }

    public  double calculateArea()
    {

        double area=PI*radius*radius;
        return area;
    }
    public double calculatePerimeter()
    {
        double Peri=2*PI*radius;
        return Peri;
    }
    public void display(String co)
    {
        System.out.println("the color of the circle is : "+ co);

    }
}
