package Assignment4.Inheritence;

public class Cylinder extends Circle
{


    private double height;


    public Cylinder()
    {
        super();
        this.height = 4.0;
    }

    public Cylinder(double height)
    {
        super();
        this.height = height;
    }

    public Cylinder(double height, double radius)
    {
        super(radius);
        this.height = height;
    }

    public Cylinder(double height, double radius, String color)
    {
        super(radius, color);
        this.height = height;
    }


    public double getHeight()
    {
        return this.height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }


    public double getVolume()
    {
        return getArea()*height;
    }


    public String toString()
    {
        return "This is a Assignment4.Inheritence.Cylinder";
    }
}//end of class
