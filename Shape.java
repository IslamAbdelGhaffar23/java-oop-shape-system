package main;
import java.util.Date;
public abstract class Shape implements Drawable {
    private Date dateCreated;
    private String color;
    public Shape()
    {
        dateCreated = new Date();
        color = "Black";
    }
    public Shape(String color)
    {
        dateCreated = new Date();
        this.color = color;
    }
    public Date getDateCreated()
    {
        return dateCreated;
    }
    public abstract double getPerimeter();
    public abstract double getArea();
    
}
