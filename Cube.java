package main;
import java.awt.*;
public class Cube extends ThreeDShape {
    private double side;
    public Cube()
    {
        
    }
    public Cube(double s)
    {
        side = s;
    }
    public Cube(String c , double s)
    {
        super(c);
        side = s;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double s) {
        this.side = s;
    }
    @Override
    public double getPerimeter()
    {
        return 12*side;
    }
    @Override
    public double getArea()
    {
        return 6*side*side;
    }
    @Override
    public double getVolume()
    {
        return Math.pow(side, 3);
    }

    @Override
    public String howToDraw()
    {
        return "Draw a cube with side = " + side;
    }
    @Override
    public void drawShape(Graphics g , int x , int y)
    {
         g.setColor(Color.red);
        int s = (int)Math.round(side);
        int x_pos = x , y_pos = y;
        int offset = s/4;
        g.fillRect(x_pos, y_pos, s, s);
        int x_back = x_pos+offset , y_back=y_pos-offset;
        g.fillRect(x_back, y_back , s ,s);
        int[]xSideRight = {x_pos+s,x_pos+s,x_pos+s+offset,x_pos+s+offset};
        int[]ySideRight = {y_pos,y_pos+s,y_pos+s-offset,y_back};
        g.fillPolygon(xSideRight, ySideRight, 4);
        int[]xSideLeft = {x_pos,x_pos,x_back,x_back};
        int[]ySideLeft = {y_pos,y_pos+s,y_pos+s-offset,y_back};
        g.fillPolygon(xSideLeft, ySideLeft, 4);
        g.setColor(Color.black);
        g.drawRect(x, y, s, s);
        g.drawRect(x_back, y_back , s ,s);
        g.drawLine(x_pos, y_pos, x_back, y_back);
        g.drawLine(x_pos+s, y_pos, x_back+s, y_back);
        g.drawLine(x_pos, y_pos+s, x_back, y_back+s);
        g.drawLine(x_pos+s, y_pos+s, x_back+s, y_back+s);
    }
    @Override
    public int getHeight()
    {
        return (int)(side + side/4);
    }
    @Override
    public int getWidth()
    {
        return (int)(side + side/4);
    }
    @Override
    public String toString() {
        return "Cube["+super.toString() + " , side = " + side + "]";
    }
    
}
