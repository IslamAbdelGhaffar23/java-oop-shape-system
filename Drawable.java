package main;
import java.awt.*;
public interface Drawable {
    public String howToDraw();
    void drawShape(Graphics g , int x , int y);
    int getWidth();
    int getHeight();
}
