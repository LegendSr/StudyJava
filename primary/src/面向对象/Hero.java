package 面向对象;

import 接口与继承.LifePotion;
import 接口与继承.MagicPotion;
import 接口与继承.Mortal;
import 类和对象.Item;

import javax.swing.*;

/**
 * @description: 设计英雄对象
 * @author: Hg
 * @create: 2020-06-04 19:11
 **/
public class Hero {
    public String name;
    public Float hp;
    public Float armor;
    public int moveSpeed;


    public Hero() {
        System.out.println("构造方法");
    }

    void legendary() {
        System.out.println("超神了！");
    }

    float getHp() {
        return hp;
    }

    void recovery(float blood) {
        hp += blood;
    }

    void keng() {
        System.out.println("坑队友！");
    }

    float getArmor() {
        return armor;
    }

    void addMoveSpeed(int moveSpeed) {
        this.moveSpeed += moveSpeed;
    }


    public Hero(String name) {
        this.name = name;
    }

    public Hero(String name, float herHp, float heroArmor, int heroMoveSpeed) {
        this.name = name;
        this.hp = herHp;
        this.armor = heroArmor;
        this.moveSpeed = heroMoveSpeed;
    }

    public static void battleWin() {
        System.out.println("英雄胜利！");
    }

    public void kill(Mortal m) {
        m.die();
    }

    public static void userItem(Item item) {
        item.effect();
    }

    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "盖伦";
        MagicPotion magicPotion = new MagicPotion();
        LifePotion lifePotion = new LifePotion();
        garen.userItem(magicPotion);
        garen.userItem(lifePotion);
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", armor=" + armor +
                ", moveSpeed=" + moveSpeed +
                '}';
    }
}
