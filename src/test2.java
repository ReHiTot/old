import classLoader.DiyClassloader;
import org.junit.Test;
import utils.MatcherUtil;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
//

//        String str="[ip来源文件](101.42.227.248/ipdb/ip2region.db)";
//        ArrayList<String> string = MatcherUtil.findString("[^\\[\\]\\(\\),]*",str);
//        System.out.println(string);
//        String str2="<a href=\""+string.get(1)+"\">"+string.get(0)+"</a>";
//        System.out.println(str2);
//        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
//            String s = bufferedReader.readLine();
//            System.out.println(s);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        testPrint();
        System.out.println("测试");
    }


    @Test
    public  void testPrint() {
        System.out.println("开始");
        String s = new Scanner(System.in).nextLine();
        System.out.println(s);

    }



}
