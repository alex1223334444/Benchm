package Logging;

public class ConsoleLogger implements ILogger{

    @Override
    public void write(long nr) {
        System.out.println(nr);
    }

    @Override
    public void write(String s) {
            System.out.println(s);
    }

    @Override
    public void write(Object... values) {
        for (Object i: values)
            System.out.print(i + " ");
        System.out.println();
    }

    @Override
    public void close() {

    }
}
