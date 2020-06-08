package 接口与继承;

import 类和对象.Item;

/**
 * @description: 血瓶
 * @author: Hg
 * @create: 2020-06-05 16:18
 **/
public class LifePotion extends Item {
    public void effect(){
        System.out.println("使用后回血");
    }

    public static void main(String[] args) {
        LifePotion lifePotion=new LifePotion();
        lifePotion.effect();
        Item item=new Item();
        item.effect();

    }
}
