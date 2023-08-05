public class Rectangle  extends Shape{
    private double length,width;

    public void setLength(double le)
    {
        length=le;
    }
    public double  getLength() {
        return length;
    }
    public void setWidth(double wi)
    {
        width=wi;
    }
    public double  getWidth() {
        return width;
    }
   public double calculateArea()
    {
        double area=length*width;
        return area;
    }
   public double calculatePerimeter( )
    {
        double peri=2*length+2*width;
        return peri;

    }

 public void display(String co)
    {
        System.out.println("the color of the Rectangle is : "+ co);

    }

}
