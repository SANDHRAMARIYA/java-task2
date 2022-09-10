import java.util.*;
class MathFunction
{
float z;
void multiply(int x,int y)
{
z=x*y;
System.out.println("z="+z);
}
void multiply(float x,float y)
{
z=x*y;
System.out.println("z="+z);
}
void multiply(int x,float y)
{
z=x*y;
System.out.println("z="+z);
}
}
class MathFunctionD
{
public static void main(String args[])
{
MathFunction f=new MathFunction();
f.multiply(6,8);
f.multiply((float)6.1,(float)8.2);
f.multiply(5,(float)8.2);
}
}