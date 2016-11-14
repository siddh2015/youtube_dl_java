import java.io.*;
public class auto_update
{
public static void main(String args[]) throws IOException 
{
   
     System.out.println(" testing youtube");

String s1;
 String cmd="youtube-dl --version";
        java.util.Scanner s = new java.util.Scanner(Runtime.getRuntime().exec(cmd ).getInputStream()).useDelimiter("\\A");
          s1=s.hasNext() ? s.next() : "";
      if(s1.equals("2016.11.14.1"))
      {
           System.out.println("you have the latest youtube-dl");
        }
     else
     {
         
       System.out.println(s1+" updating it ");
        cmd="youtube-dl -U";

          s1=s.hasNext() ? s.next() : "";
    }
    }
}
