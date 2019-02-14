/**
 * @author Lee
 * @create 2019/2/14 10:48
 */
public class Single04 {
    private static Single04 INSTANCE;

    private Single04(){}

    public static Single04 getINSTANCE(){
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        if(INSTANCE==null)
        {
            INSTANCE = new Single04();
        }
        return INSTANCE;
    }
}
