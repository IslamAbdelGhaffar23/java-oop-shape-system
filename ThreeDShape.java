package main;

public abstract class ThreeDShape extends Shape {
    public ThreeDShape(){}
    public ThreeDShape(String c)
    {
        super(c);
    }
    public abstract double getVolume();
}
