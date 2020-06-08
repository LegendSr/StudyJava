package 抽象类;

/**
 * @description: 护甲
 * @author: Hg
 * @create: 2020-06-05 17:26
 **/
public class Armor extends Item{

    @Override
    public boolean disposable() {
        return false;
    }
}
