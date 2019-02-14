import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author Lee
 * @create 2019/2/13 10:23
 */
public class Single03 {
    public static final Single03 SINGLE;
    public String test;
    //构造函数是在当类 被实例化的时候才会执行,所以用构造函数,这时候这个属性没有被初始化.程序就会报错.而static块是类被加载的时候执行,且只执行这一次,所以在 static块中可以被初始化
    static {
        Properties properties = new Properties();
        InputStream resourceAsStream = Single03.class.getResourceAsStream("set.properties");
        try {
            properties.load(resourceAsStream);
            SINGLE = new Single03(properties.getProperty("name"));
        } catch (IOException e) {
            //当有static和final同时修饰时必须初始化常量，只有这样写才不需要初始化
           throw new RuntimeException(e);
        }

    }

    private Single03(String str){
        this.test = str;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
