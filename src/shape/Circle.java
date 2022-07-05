package shape;

public class Circle extends Shape {
    private double radius;

    public Circle()
    {
        this.radius = 1;
    }

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(double radius, boolean isFilled, String color)
    {
        super(isFilled, color);
        this.radius = radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return this.radius;
    }

    public double getArea()
    {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String toString()
    {
        return "Radius: " + this.radius +
                "\nArea: " + getArea() +
                "\n" + super.toString();
    }
}
