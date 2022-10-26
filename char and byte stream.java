import java.io.*;
import java.util.*;
public class CharByteStream
{
    public static void main(String[] args)throws Exception
    {
        DataInputStream dis=new DataInputStream(System.in);
        FileInputStream FI=new FileInputStream("abc.txt");
        FileWriter FW=new FileWriter("Char.txt");
        FileReader FR=new FileReader("xyz.txt");
        String str;
        int read;
        System.out.println("It is FileWriter class");
        System.out.println("Enter your information to write in files");
        str=dis.readLine();
        FW.write(str);
        FW.flush();
        System.out.println("\n\n-----------------------------------------\n\n");
        System.out.println("It is FileInputStream class");
        while((read=FI.read())!=-1)
        {
            System.out.print((char)read);
        }
        System.out.println("\n------------------------------------------------");
        System.out.println("It is chararrayreader class");
        String s="files concept introduction";
        char c[]=s.toCharArray();
        char c1[]={'P','R','O','G','R','A','M','M','I','N','G'};
        CharArrayReader ca=new CharArrayReader(c);
        while((read=ca.read())!=-1)
        {
            System.out.print((char)read);
        }
        System.out.println("\n\n\n-------------------------------------------");
        System.out.println("It is filereader class");
        while((read=FR.read())!=-1)
        {
            System.out.println((char)read);
        }
        dis.close();
        FI.close();
        FW.close();
        FR.close();
        
    }
    
}
