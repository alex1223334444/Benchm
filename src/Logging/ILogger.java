package Logging;

import java.io.IOException;

public interface ILogger {
    void write(long nr) throws IOException;

    void write(String s) throws IOException;

    void write(Object... values) throws IOException;

    void close() throws IOException;
}
