package io;

import java.io.*;

public class InputStreamTest {
    public static void readFile(String filePath) {
        File file = new File(filePath);
        byte[] buf = new byte[(int) file.length()];
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            while (fileInputStream.read() != -1) {
                fileInputStream.read(buf);
            }

            for (byte b : buf) {
                System.out.print((char) b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean fromToCopy(String from, String to) {

        File file1 = new File(from);
        File file2 = new File(to);
        if (file2.exists()) {
            try {
                file2.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (FileInputStream fileInputStream = new FileInputStream(file1);
             FileOutputStream fileOutputStream = new FileOutputStream(file2);) {
            byte[] bytes = new byte[(int) file1.length()];
            fileInputStream.read(bytes);
            fileOutputStream.write(bytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }


    public static void main(String[] args) {
        try {
            BufferedInputStream bufferedInputStream=new BufferedInputStream(new FileInputStream("D:\\XUNIJI\\jvm3-36.png"));
            BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(new FileOutputStream("D:\\XUNIJI\\jjxx77.png"));

            try {
                int read;
                byte[]bytes=new byte[1024*100];
                while( (read = bufferedInputStream.read(bytes))!=-1){
                    bufferedOutputStream.write(bytes,0,read);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                bufferedInputStream.close();
                bufferedOutputStream.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
