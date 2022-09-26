package utils;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherUtil {


    public static ArrayList<String> findString(String pattern, String content){
        ArrayList<String> Strings=new ArrayList<>();
        Pattern pattern1=Pattern.compile(pattern);
        Matcher matcher = pattern1.matcher(content);

        while (matcher.find()) {
            if (matcher.group(0).length()!=0)
//            System.out.println(matcher.group(0).len);
            Strings.add(matcher.group(0));
        }
        return Strings;
    }

    public static ArrayList<String> findString(String pattern, String content,int group){
        ArrayList<String> Strings=new ArrayList<>();
        Pattern pattern1=Pattern.compile(pattern);
        Matcher matcher = pattern1.matcher(content);
        while (matcher.find()) {
            Strings.add(matcher.group(group));
        }
        return Strings;
    }
    public static ArrayList<String> findString(String pattern, String content,String name){
        ArrayList<String> Strings=new ArrayList<>();
        Pattern pattern1=Pattern.compile(pattern);
        Matcher matcher = pattern1.matcher(content);
        while (matcher.find()) {
            Strings.add(matcher.group(name));
        }
        return Strings;
    }

    public static ArrayList<String> findString(String pattern, String content,int group[]){
        ArrayList<String> Strings=new ArrayList<>();
        Pattern pattern1=Pattern.compile(pattern);
        Matcher matcher = pattern1.matcher(content);
        while (matcher.find()) {
            for (int i = 0; i < group.length; i++) {
                Strings.add(matcher.group(group[i]));
            }
        }
        return Strings;
    }

    public static boolean verification(String pattern,String content){

        Pattern pattern1=Pattern.compile(pattern);
        Matcher matcher = pattern1.matcher(content);
        return matcher.matches();
    }
}
