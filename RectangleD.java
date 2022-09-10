class Rectangle
{
int length,breadth;
Rectangle(int a)
{
length=a;
breadth=a;
}
Rectangle(int b,int c)
{
length=b;
breadth=c;
}
void getArea()
{
double area =length*breadth;
System.out.println("Area of rectangle =" +area);
}
void getPerimeter()
{
double perimeter = 2*(length+breadth);
System.out.println("Perimeter of Rectangle =" +perimeter);
}
}
class RectangleD
{
public static void main(String[] args)
{
Rectangle r1 = new Rectangle(5);
Rectangle r2 = new Rectangle(5,10);
r1.getArea();
r1.getPerimeter();
r2.getArea();
r2.getPerimeter();
}
}