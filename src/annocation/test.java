package annocation;

import java.lang.annotation.Annotation;

@DataSource(database = "数据库",password = 123456)
public class test {
    public static void main(String[] args) {
        Class clazz=test.class;
        Annotation annotation = clazz.getAnnotation(DataSource.class);
        System.out.println(annotation.toString());
        DataSource dataSource=(DataSource) annotation;
        System.out.println(dataSource.database());
        System.out.println(dataSource.password());

    }
}
