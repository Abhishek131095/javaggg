import java.util.*;
import java.lang.*;
import java.io.*;
class guvi
{
 public static void main(String[ ] arg)
    {
        char ch='c';
        System.out.print("Enter a Character : ");
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
        {
            System.out.print(ch + " is an Alphabet");
        }
        else
        {
            System.out.print(ch + " is not an Alphabet");
        }
    }
}
