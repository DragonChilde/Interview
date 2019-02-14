/**
 * @author Lee
 * @create 2019/2/14 11:22
 */
/*WW
* 1 private static int j = method();
* 2   static {
        System.out.println("1");
    }
* */
public class Father {
    private int i = test();
    private static int j = method();

    static {
        System.out.println("1");
    }
    Father(){
        System.out.println("2");
    }
    {
        System.out.println("3");
    }
    public int test(){
        System.out.println("4");
        return 1;
    }

    public static int method(){
        System.out.println("5");
        return 1;
    }
}
