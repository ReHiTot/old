package utils;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ReaderUtil {
    public static String readFile(String needFilePath) {
        String info = "";
        try (FileReader fileReader = new FileReader(needFilePath)) {
            char[] content = new char[1024];
            int read;
            while ((read = fileReader.read(content)) != -1) {
                info = info + new String(content, 0, read);
            }
            return info;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getFiled(String filed,String content) {
        String pattern = "" + filed + "=" + "([^;\\s,.。]*)";
        ArrayList<String> string = MatcherUtil.findString(pattern, content, 1);
        return string.get(0);
    }

    public static Map<String, String> loadFile(String filePath) {
        File file=new File(filePath);
        String content = readFile(file.getAbsolutePath());
        Map map = new HashMap<String, String>();
        //匹配时如果需要在每个字符串戒指需要使用[^字符]*不能直接使用*
        String pattern = "" + "([^=,]*)" + "=" + "([^;\\s,.。]*)";
        int[] group = {1, 2};
        ArrayList<String> string = MatcherUtil.findString(pattern, content, group);
        for (int i = 0; i < string.size(); i += 2) {
            map.put(string.get(i).trim(), string.get(i + 1).trim());
        }
        return map;
    }

    public static void updateFile(String filePath, String updateContent) {
        File file=new File(filePath);
        String content = readFile(file.getAbsolutePath());
        try (FileWriter fileWriter = new FileWriter(file)) {
            if (updateContent.startsWith("{") && updateContent.endsWith("}")) {
                updateContent = updateContent.substring(1, updateContent.length() - 1);
            }
            fileWriter.write(updateContent);
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Map<String, String> stringStringMap = loadFile("D:\\XUNIJI\\1.txt");
//        System.out.println(stringStringMap.keySet());
//        System.out.println(stringStringMap.values());
        stringStringMap.remove("studentId", "2020443995");
        updateFile("src\\properties.txt", stringStringMap.toString());
    }

}
