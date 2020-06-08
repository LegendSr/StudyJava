package 接口与继承;

import 面向对象.Hero;

/**
 * @description: 物理和魔法都行的英雄
 * @author: Hg
 * @create: 2020-06-05 15:35
 **/
public class APADHero extends Hero implements AP, AD, Mortal {

    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }

    @Override
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }

    @Override
    public void die() {
        System.out.println("ADAP" + name + "死掉了");
    }

    public static void battleWin() {
        System.out.println("APAD胜利！");
    }

    public static void main(String[] args) {
        System.out.println();
        Hero garan = new Hero();
        garan.name = "盖伦";
        ADHero adHero = new ADHero();
        adHero.name = "凯特琳";
        APHero apHero = new APHero();
        apHero.name = "维克托";
        APADHero apadHero = new APADHero();
        apadHero.name = "卡莎";
        garan.kill(adHero);
        garan.kill(apadHero);
        garan.kill(apHero);
        apadHero.battleWin();
        Hero sr = new APADHero();
        sr.battleWin();
    }
}
