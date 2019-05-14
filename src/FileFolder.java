/* 8. Write a program to find all files of a folder and select only given extention fileName and
read content of this file using byte array */

import java.io.FileReader;
        import java.io.File;
        import java.util.Scanner;
        import java.io.*;
public class FileFolder
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        File f=new File("/home/maria/IdeaProjects/PE2/src");
        String file[]=f.list();
        for(String names:file)
        {
            System.out.println(names);
        }
        String fname;
        Scanner scan = new Scanner(System.in);

        /* enter filename with extension to open and read its content */

        System.out.print("Enter File Name to Open (with extension like file.txt) : ");
        fname = scan.nextLine();

        /* this will reference only one line at a time */

        try {
            File fl = new File(fname);
            FileReader f1 = new FileReader(fl);
            int j = 1;
            while ((j = f1.read()) != -1)
            {
                System.out.print((char)j);

            }
        }
        catch(Exception e) {
            System.out.println("Error reading file named '" + fname + "'");
        }
    }
}