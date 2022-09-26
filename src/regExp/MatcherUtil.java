package regExp;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherUtil {
    private static ArrayList<String> Strings=new ArrayList();

    public static ArrayList<String> findString(String pattern, String content){
        Pattern pattern1=Pattern.compile(pattern);
        Matcher matcher = pattern1.matcher(content);
        while (matcher.find()) {
            Strings.add(matcher.group(0));
        }
        return Strings;
    }

    public static ArrayList<String> findString(String pattern, String content,int group){
        Pattern pattern1=Pattern.compile(pattern);
        Matcher matcher = pattern1.matcher(content);
        while (matcher.find()) {
            Strings.add(matcher.group(group));
        }
        return Strings;
    }
    public static ArrayList<String> findString(String pattern, String content,String name){
        Pattern pattern1=Pattern.compile(pattern);
        Matcher matcher = pattern1.matcher(content);
        while (matcher.find()) {
            Strings.add(matcher.group(name));
        }
        return Strings;
    }
    public static boolean verification(String pattern,String content){

        Pattern pattern1=Pattern.compile(pattern);
        Matcher matcher = pattern1.matcher(content);
        return matcher.matches();
    }

}
