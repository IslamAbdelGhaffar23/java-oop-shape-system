package main;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.print("Please enter a size of array : ");
        try{
        int size = s.nextInt();
        if (size >0)
        {
            Drawable [] cube = new Drawable[size];
            System.out.println("please enter sides : ");
            for (int i = 0 ; i<cube.length ; i++)
            {
                double side = s.nextDouble();
                if(side<=0)
                {
                    System.out.println("not valid Dimension\n"
                            + "the side must be a positive number");
                    break;
                }
                cube[i] = new Cube(side);
            
            }
        
            double sum = 0;
            for(Drawable c : cube)
            {
                Cube cu = (Cube)c;
                sum+=cu.getVolume();
            }
            System.out.println("sum = " + sum);
        }
        else if(size<=0)
        {
            System.out.println("not valid Size");
        }
        }catch(InputMismatchException ex)
        {
            System.out.println("size must be an integer");
        }
    }
}
    

