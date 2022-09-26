package designMode.prototype;

import java.io.*;

public class DeepClone implements Serializable {
    public String name;
    public DeepClone deepClone() throws IOException, ClassNotFoundException {
        byte[] bytes=null;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois=new ObjectInputStream(bis);
        DeepClone o = (DeepClone)ois.readObject();
        oos.close();
        ois.close();
return o;

    }

    public static void main(String[] args) {
        DeepClone deepClone1=new DeepClone();
        deepClone1.name="小王";
        try {
            DeepClone deepClone2 = deepClone1.deepClone();
            System.out.println(deepClone2.name);
//            System.out.println(deepClone1.hashCode());
//            System.out.println(deepClone2.hashCode());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
