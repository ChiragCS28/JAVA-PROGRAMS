//1.Develop a Java program to create an abstract class named Shape that contains two integers and an empty method named printArea( ). 
//Provide three classes named Rectangle, Triangle and Circle such that each one of the classes extends the class Shape. 
//Each one of the classes contain the method printArea( ) that prints the area of the given shape.

import java.util.*;
abstract class Shape{
    double len,wid;
    double area;
    abstract void printArea();
}

class Rectangle extends Shape{
    
    Rectangle(double l, double w){
        len=l;
        wid=w;
    }
    void printArea(){
        area= len*wid;
        System.out.println("Area:"+area);
    }
}

class Square extends Shape{
    
    Square(double l){
        len = wid= l;
    }
    void printArea(){
        area = len*len;
        System.out.println("Area:"+area);
    }
}

class Circle extends Shape{
    Circle(double r){
        len = wid = r;
    }
    void printArea(){
        area= 3.14*len*len;
        System.out.println("area:"+area);
    }
}

class Run{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length and width of rectangle:");
        double length= sc.nextDouble();
        double width = sc.nextDouble();
        Shape rec = new Rectangle(length,width);
        rec.printArea();
        
        System.out.println("Enter the lenght of the square:");
        double length_square = sc.nextDouble();
        Shape sq = new Square(length_square);
        sq.printArea();
        
        System.out.println("Enter the radius of the circle:");
        double radius = sc.nextDouble();
        Shape cir = new Circle(radius);
        cir.printArea();
    }
}