import java.util.*;
import java.lang.*;
import java.io.*;
class guvi
{
	public static void main(String[] args)
	{
 int no=867,a=0;
if(no<0)
{
no=no * -1;
}
else if(no==0)
{
no=1;
}
while(no>0)
{
no=no/10;
a++;
}
System.out.println("Number of Digits in given number is: "+a);
}
}