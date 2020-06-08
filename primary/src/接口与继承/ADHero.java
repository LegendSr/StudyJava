package 接口与继承;

import 类和对象.Armor;
import 类和对象.Item;
import 面向对象.Hero;

/**
 * @description: AD英雄
 * @author: Hg
 * @create: 2020-06-05 15:32
 **/
public class ADHero extends Hero implements AD,Mortal{

    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }

    public static void main(String[] args) {
        ADHero ad=new ADHero();
        ad.name="盖伦";
        AD adi=ad;
        adi.physicAttack();
        ADHero ad2= (ADHero) adi;
        System.out.println(ad2.name);
//        APHero ap= (APHero) adi;

        //转型是无损的,因为引用的是地址
        Armor armor=new Armor();
        armor.name="布甲";
        armor.ac=10;
        armor.price=300;
        System.out.println(armor);
        Item item=armor;
        System.out.println(item);
        Armor armor1= (Armor) item;
        System.out.println(armor1.ac);
    }

    @Override
    public void die() {
        System.out.println("AD"+name+"阵亡");
    }
}
