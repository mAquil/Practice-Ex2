/* 4. Write a program to read the content of a text file, convert the content in upper case and
print the same in console along with the length of the file.*/

import java.io.*;
import java.io.File;

public class TextFile
{
    public static void main(String args[])throws Exception
    {

        File fl=new File("/home/maria/IdeaProjects/PE2/src/myfile.txt");
        FileReader file=new FileReader(fl);
//        int i=1;
//        while ((i=file.read())!=-1)
//        {
//            System.out.print((char)i);
//
//        }
        System.out.print("the contents of file in uppercase:");
        System.out.println();

        int j=1;
        while ((j=file.read())!=-1)
        {
            System.out.print(Character.toUpperCase((char)j));

        }
        System.out.println();
        System.out.println("Length of the file"+" "+fl.length());
    }
}