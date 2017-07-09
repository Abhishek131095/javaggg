import java.util.*;
import java.lang.*;
import java.io.*;
class guvi
{
	public static void main(String[] args) {
		
        int x=5, i = 1 ;
        int sum = 0;
        System.out.println("Enter Number of items :");
        while(i <= x)
        {
            sum = sum +i;
            i++;
        }
        System.out.println("Sum of "+x+" numbers is :"+sum);
    } 
}