/**
 * @author Lee
 * @create 2019/2/13 10:18
 */
public class Single01 {
    public static final Single01 SINGLE = new Single01();
    private Single01(){

    }

    public static Single01 getSINGLE() {
        return SINGLE;
    }
}
