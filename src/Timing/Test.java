package Timing;

import Logging.FileLogger;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        Timer time=new Timer();
        time.start();
        FileLogger f = new FileLogger();
        for(int i=0;i<100000;i++)
            f.write("plm");
        //f.write(time.pause());
        time.stop();
        System.out.println(time.total);
    }
}
