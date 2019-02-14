

/**
 * @author Lee
 * @create 2019/2/14 10:26
 */
public class Single05 {
    private static Single05 INSTANCE;

    private Single05(){}

    public static Single05 getINSTANCE(){
        synchronized (Single05.class) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (INSTANCE == null) {
                INSTANCE = new Single05();
            }
            return INSTANCE;
        }
    }
}
