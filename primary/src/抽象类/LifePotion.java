package 抽象类;

/**
 * @description:血瓶类
 * @author: Hg
 * @create: 2020-06-05 17:24
 **/
public class LifePotion extends Item{
    @Override
    public boolean disposable() {
        return true;
    }
}
