package main;
import java.awt.*;

public class Circle extends Shape{
    private double raduis;

    public Circle(double r)
    {
        raduis = r;
    }
    public Circle(String c , double r)
    {
        super(c);
        raduis = r;
    }
    public double getRaduis() {
        return raduis;
    }

    public void setRaduis(double r) {
        this.raduis = r;
    }

    @Override
    public double getPerimeter()
    {
        return 2 *Math.PI * raduis;
    }
    @Override
    public double getArea()
    {
        return Math.PI * raduis * raduis;
    }

    @Override
    public String howToDraw()
    {
        return "Draw a Circle with raduis = " + raduis;
    }
    @Override
    public void drawShape(Graphics g , int x , int y)
    {
        g.setColor(Color.blue);
        int diameter = (int)Math.round(raduis*2);
        int x_pos = x;
        int y_pos = y;
        g.fillOval(x_pos, y_pos, diameter, diameter);
        g.setColor(Color.BLACK);
        g.drawOval(x_pos, y_pos, diameter, diameter);
    }
    @Override
    public int getWidth()
    {
        return (int)raduis*2;
    }
    @Override
    public int getHeight()
    {
        return (int)raduis*2;
    }
    @Override
    public String toString() {
        return "Circle["+super.toString() + ",raduis = " + raduis +"]";
    }
    
    
    
}
