public abstract class Shape {
  
  public Color color;
  
  public Color getColor(){
    //code for return color
  }

  /*the method area() has abstract keyword 
  no implementation and end with semicolon*/
  abstract double area();   

}



public class circle extends Shape{
  
  double area(){
   //implementation
  }  
  
}

public class TestMainClass {
  
  Shape shape = new Shape() ;
  
  Shape shape = new cricle() ;
}





