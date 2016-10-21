import java.io.*;
public class process_check_1
{
public static void main(String args[]) throws java.io.IOException 
{
    String cmd="netstat";
        java.util.Scanner s = new java.util.Scanner(Runtime.getRuntime().exec(cmd ).getInputStream()).useDelimiter("\\A");
       System.out.println(s.hasNext() ? s.next() : "");
    }
}