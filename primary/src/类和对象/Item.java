package 类和对象;

import 接口与继承.LifePotion;
import 接口与继承.MagicPotion;

/**
 * @description: 装备类
 * @author: Hg
 * @create: 2020-06-05 12:43
 **/
public class Item {
    public String name;
    public int price;
    public void buy(){
        System.out.println("购买");
    }
    public void effect(){
        System.out.println("物品使用后，可以有效果");
    }

    public static void main(String[] args) {
        Item item1=new LifePotion();
        Item item2=new MagicPotion();
        item1.effect();
        item2.effect();
    }
}
