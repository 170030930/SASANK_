import java.io.*;
import java.lang.Math;
import java.util.Scanner;
class Prime{
public static void main(String[]args)
{
int a=0;
Scanner scan=new Scanner(System.in);
int z=scan.nextInt();
for(int y=2;y<=Math.ceil(Math.sqrt(z));y++)
{
if(z%y==0)
{
a=1;
break;
}
}
if(z<=1)
{
System.out.print(z+" is neither prime nor composite");
}
else if(a==0 || z==2)
{
System.out.print(z+" is a prime");
}
else
{
System.out.print(z+" is not a prime");
}
}
}
