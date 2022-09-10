import java.io.*;
import java.util.*;
class Employee
{
static  int empno;
static double salary,total_salary;
Employee(double salary)
{
empno++;this.salary=salary;
total_salary=salary+total_salary;
}
void show()
{
System.out.println("\n Employee Number:" +empno);
System.out.println("\n Total Salary:" +total_salary);
}
}
class employeee
{
public static void main(String args[])
{
float s1,s2,s3,s4,s5;
System.out.println("\n\n Enter first person salary");
Scanner sc=new Scanner(System.in);
s1=sc.nextFloat();
Employee e1=new Employee(s1);
e1.show();
System.out.println("\n\n Enter Second person salary");
s2=sc.nextFloat();
Employee e2=new Employee(s2);
e2.show();
System.out.println("\n\n Enter Third person salary");
s3=sc.nextFloat();
Employee e3=new Employee(s3);
e3.show();
System.out.println("\n\n Enter Fourth person salary");
s4=sc.nextFloat();
Employee e4=new Employee(s4);
e4.show();
System.out.println("\n\n Enter Fifth person salary");
s5=sc.nextFloat();
Employee e5=new Employee(s5);
e5.show();
}
}

