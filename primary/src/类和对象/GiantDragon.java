package 类和对象;

/**
 * @description: 大龙类
 * @author: Hg
 * @create: 2020-06-05 13:35
 **/
public class GiantDragon {
    private GiantDragon() {

    }

    private static GiantDragon instance;

    public static GiantDragon getInstance() {
        if (null == instance) {
            instance = new GiantDragon();
        }
        return instance;
    }
}
