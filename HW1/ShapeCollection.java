import java.util.*;

abstract class Shape implements Comparable<Shape>{

    protected String color;
    protected int area;

    public Shape(String color, int area){
        this.color=color;
        this.area=area;
    }

    public abstract void display();

    @Override
    public int compareTo(Shape s){
        if(this.area==s.area)
            return 0;
        else if(this.area>s.area)
            return 1;
        else
            return -1;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return(this.color);
    }

    public void setArea(int area){
        this.area = area;
    }

    public int getArea(){
        return(this.area);
    }
}

class Triangle extends Shape {
    public Triangle(String color, int area) {
        super(color, area);
    }

    @Override
    public void display(){
        System.out.println("I am a " + this.color + " triangle with area " + this.area);
    }
}

class Circle extends Shape {
    public Circle(String color, int area) {
        super(color, area);
    }

    @Override
    public void display(){
        System.out.println("I am a " + this.color + " circle with area " + this.area);
    }
}

class Square extends Shape {
    public Square(String color, int area) {
        super(color, area);
    }

    @Override
    public void display(){
        System.out.println("I am a " + this.color + " square with area " +   this.area);
    }
}

public class ShapeCollection{

     public static void main(String []args){

        ArrayList<Shape> shapes = new ArrayList<Shape>();
        
        System.out.println("Creating a blue triangle with area 4");
        shapes.add(new Triangle("blue", 4));
        System.out.println("Creating a green square with area 3");
        shapes.add(new Square("green", 3));
        System.out.println("Creating a red circle with area 5");
        shapes.add(new Circle("red", 5));

        System.out.println("Sorting shapes...");
        Collections.sort(shapes);

        shapes.forEach(shape -> shape.display());
}
