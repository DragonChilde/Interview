/**
 * @author Lee
 * @create 2019/2/14 11:05
 */
public class Single06 {
    private static Single06 INSTANCE;
    private Single06(){}

    private static class InterClass{
       private static final Single06 INSTANCE = new Single06();
    }

    public static Single06 getINSTANCE(){
        return InterClass.INSTANCE;
    }
}
