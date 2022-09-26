package regExp;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
    public static void main(String[] args) {
        String content="我。。。我要。。。学学学学。。。java技术";
        Pattern pattern=Pattern.compile("\\。");
        Matcher matcher = pattern.matcher(content);
        content=matcher.replaceAll("");

        pattern=Pattern.compile("(.)\\1+");
        matcher = pattern.matcher(content);
        System.out.println(matcher.replaceAll("$1"));

    }
}
