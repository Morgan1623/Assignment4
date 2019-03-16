package Assignment4.Inheritence;

public class Circle
{

    private double radius;
    private String color;


    public Circle()
    {
        this.radius = 4.0;
        this.color = "blue";
    }
    public Circle(double radius)
    {
        this.radius = radius;
        this.color = "blue";
    }
    public Circle(double radius, String color)
    {
        this.radius = radius;
        this.color = color;
    }

    // Getters and Setters
    public double getRadius()
    {
        return this.radius;
    }

    public String getColor()
    {
        return this.color;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public void setColor(String color)
    {
        this.color = color;
    }


    public String toString()
    {
        return "Assignment4.Inheritence.Circle[radius=" + radius + ",color=" + color + "]";
    }


    public double getArea()
    {
        return radius * radius * Math.PI;
    }

}// end of class
