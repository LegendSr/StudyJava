package 接口与继承;

import 面向对象.Hero;

/**
 * @description: AP英雄
 * @author: Hg
 * @create: 2020-06-05 15:34
 **/
public class APHero extends Hero implements AP,Mortal{

    int moveSpeed=400;
    @Override
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }

    @Override
    public void die() {
        System.out.println("法师"+name+"阵亡");
    }

    public APHero() {
        System.out.println("APHero构造方法");
    }
    public APHero(String name){
        super(name);
        System.out.println("APHero的构造方法");
    }

    public int getMoveSpeed(){
        return this.moveSpeed;
    }
    public int getMoveSpeed2(){
        return super.moveSpeed;
    }
    public void useItem(){
        System.out.println("APHero user item");
    }
    public void finalize(){
        System.out.println("这个英雄在被回收");
    }
    public static void main(String[] args) {
        APHero apHero= new APHero("维克托");
        System.out.println(apHero.getMoveSpeed());
        System.out.println(apHero.getMoveSpeed2());
        apHero=new APHero();
        APHero h;

        for (int i = 0; i < 100000; i++) {
            //不断生成新的对象
            //每创建一个对象，前一个对象，就没有引用指向了
            //那些对象，就满足垃圾回收的条件
            //当，垃圾堆积的比较多的时候，就会触发垃圾回收
            //一旦这个对象被回收，它的finalize()方法就会被调用
            h = new APHero();
        }
    }
}
