package 类和对象.charactor;

import 面向对象.Hero;

/**
 * @description: 辅助英雄
 * @author: Hg
 * @create: 2020-06-05 12:57
 **/
public class Support extends Hero {
    public void heal(){
        System.out.println(this.name+"治疗了自己");
    }
    public void heal(Hero hero){
        System.out.println(this.name+"治疗了"+hero.name);
    }
    public void heal(Hero hero,int hp){
        System.out.println(this.name+"治疗了"+hero.name+hp+"点血");
    }

    public static void main(String[] args) {
        Support support=new Support();
        support.name="琴女";
        support.heal();
        Hero hero=new Hero("女警");
        support.heal(hero);
        support.heal(hero,200);
    }
}
