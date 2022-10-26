import java.io.*;
import java.util.*;
public class FileOperation
{
    public static void main(String args[])throws Exception
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your file name");
        String name=s.nextLine();
        File f=new File(name);
        if(f.exists())
        {
            System.out.println("Your file is exists");
        }
        else
        {
            System.out.println("Your file is not exists please enter correct filename");
        }
        if(f.canRead())
        {
            System.out.println("Your file is only readable file");
        }
        else if(f.canWrite())
        {
            System.out.println("Your file is only writable file");
        }
        else
        {
            System.out.println("Your file can do both write and read");
        }
        System.out.println("Your file length:\t"+f.length());
        System.out.println("Your file extension is:\t");
        String name1=name;
        char c2[]=name1.toCharArray();
        for(int i=0;i<c2.length;i++)
        {
            if(c2[i]=='.')
            {
                for(int j=i+1;j<c2.length;j++)
                {
                    System.out.print(c2[j]);
                }
            }
        }
        
    }
}
