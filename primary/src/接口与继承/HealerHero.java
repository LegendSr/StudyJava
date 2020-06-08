package 接口与继承;

import 面向对象.Hero;

/**
 * @description: 奶妈英雄
 * @author: Hg
 * @create: 2020-06-05 15:38
 **/
public class HealerHero extends Hero implements Healer {
    @Override
    public void heal() {
        System.out.println("进行了治疗");
    }
}
