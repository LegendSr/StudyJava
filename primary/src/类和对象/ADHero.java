package 类和对象;

import 面向对象.Hero;

/**
 * @description: AD英雄
 * @author: Hg
 * @create: 2020-06-05 12:49
 **/
public class ADHero extends Hero {
    public void attack(){
        System.out.println(this.name+"进行了攻击");
    }
    public void attack(Hero h1){
        System.out.println(this.name+"对"+h1.name+"进行了攻击");
    }
    public void attack(Hero h1,Hero h2){
        System.out.println(this.name+"对"+h1.name+"和"+h2.name+"进行了攻击");
    }
    public void attack(Hero... heroes){
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(name+"攻击了"+heroes[i].name);
        }
    }

    public static void main(String[] args) {
        ADHero adHero = new ADHero();
        adHero.name="女警";
        adHero.attack();
        ADHero adHero1=new ADHero();
        adHero1.name="盖伦";
        ADHero adHero2=new ADHero();
        adHero2.name="提莫";
        adHero.attack(adHero1);
        adHero.attack(adHero1,adHero2,adHero1,adHero2);
    }
}
