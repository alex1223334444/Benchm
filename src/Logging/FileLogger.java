package Logging;

import java.awt.*;
import java.io.*;
import java.util.Scanner;
import java.util.Timer;

public class FileLogger implements ILogger {
    public FileLogger() throws IOException {
        FileOutputStream fos = new FileOutputStream("JavaFile.java",true);

    }

    @Override
    public void write(long nr) throws IOException {

        try {
            // Creates a Writer using FileWriter
            FileOutputStream fos = new FileOutputStream("JavaFile.java",true);
            DataOutputStream dos = new DataOutputStream(fos);

            // Writes the program to file
            dos.writeBytes(String.valueOf(nr));

            // Closes the writer
            dos.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }

    public void write(double nr) throws IOException {

        try {
            // Creates a Writer using FileWriter
            FileOutputStream fos = new FileOutputStream("JavaFile.java",true);
            DataOutputStream dos = new DataOutputStream(fos);

            // Writes the program to file
            dos.writeBytes(String.valueOf(nr));

            // Closes the writer
            dos.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }






    @Override
    public void write(String s) throws IOException {
        try {
            // Creates a Writer using FileWriter
            FileOutputStream fos = new FileOutputStream("JavaFile.java",true);
            DataOutputStream dos = new DataOutputStream(fos);

            // Writes the program to file
            dos.writeBytes(s);

            // Closes the writer
            dos.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }

    @Override
    public void write(Object... values) throws IOException {

        try {
            // Creates a Writer using FileWriter
            FileOutputStream fos = new FileOutputStream("JavaFile.java",true);
            DataOutputStream dos = new DataOutputStream(fos);

            // Writes the program to file
            for (Object i : values)
                dos.writeBytes(String.valueOf(i));
            //System.out.println("Data is written to the file.");

            // Closes the writer
            dos.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }


    @Override
    public void close() throws IOException {
        FileOutputStream fos = new FileOutputStream("JavaFile.java",true);
        fos.close();
    }

    public void printfile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("JavaFile.java"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }





    public static void main(String[] args) throws IOException {
        FileLogger f = new FileLogger();
        Timer t=new Timer();

        //f.write(-12345);
       // f.write(-1.4);
        //f.write("plm");
        f.write(1.4,2,3,"da");
        f.printfile();
        f.close();
        
    }
}
