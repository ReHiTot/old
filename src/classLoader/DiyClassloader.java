package classLoader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class DiyClassloader extends ClassLoader {
    private String source;
    public DiyClassloader(String source){
        this.source=source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return source;
    }
    private void fileCheck(String name){
        File file = new File(name);
        File[] files = file.listFiles();
        for (File classfile : files) {
            if (classfile.isFile()) {
                if (classfile.toString().endsWith("class")) {
                    try (FileInputStream fileInputStream = new FileInputStream(classfile)) {
                        byte[] bytes = new byte[(int) classfile.length()];
                        fileInputStream.read(bytes);
                        Class clazz=defineClass(bytes, 0, bytes.length);
//                        System.out.println(classfile.getAbsoluteFile());
                        System.out.println(classfile.getName());
//                        return clazz;

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            if (classfile.isDirectory()) {

fileCheck(classfile.getAbsolutePath().toString());

            }
        }
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {

        fileCheck(name);
         return null;
    }


}
