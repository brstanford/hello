package shape;

public class Shape {
    private boolean isFilled;
    private String color;

    public Shape()
    {
        isFilled = true;
        color = "Green";
    }

    public Shape(boolean isFilled, String color)
    {
        this.isFilled = isFilled;
        this.color = color;
    }

    public void setFilled(boolean isFilled)
    {
        this.isFilled = isFilled;
    }
    public void setColor(String color)
    {
        this.color = color;
    }

    public boolean getFilled()
    {
        return this.isFilled;
    }
    public String getColor()
    {
        return this.color;
    }

    @Override
    public String toString()
    {
        return "Filled: " + this.isFilled +
                "\nColor: " + this.color;
    }
}
