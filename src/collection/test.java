package collection;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;


public class test {
    public static void main(String[] args) throws IOException {
        PrintStream printStream=new PrintStream(new FileOutputStream("D:\\XUNIJI\\33.txt"));
        printStream.write("你好".getBytes());
        printStream.close();
    }
}
