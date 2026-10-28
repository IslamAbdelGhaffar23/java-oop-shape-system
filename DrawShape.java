package main;
import javax.swing.*;
import java.awt.*;
public class DrawShape extends JPanel{
    private final Drawable [] sh ;
    private int padding = 30;
    public DrawShape(Drawable [] shapes)
    {
        sh = shapes;
        setPreferredSize(new Dimension(1000  , 500));
    }
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int x = padding;
        int y = padding;
        int maxHightInRow = 0 ;
        for(Drawable shape : sh)
        {
           if(x+shape.getWidth()>getWidth())
           {
               x=padding;
               y+=maxHightInRow+padding;
           }
           shape.drawShape(g, x, y);
           x+=shape.getWidth()+padding;
           maxHightInRow=Math.max(maxHightInRow,shape.getHeight());
        }
    }
    
}
