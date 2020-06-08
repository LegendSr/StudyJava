package 接口与继承;

/**
 * @description: 动物的抽象父类
 * @author: Hg
 * @create: 2020-06-05 17:52
 **/
public abstract class Animal {
    protected int legs;
    public Animal(int legs){
        this.legs=legs;
    }
    public abstract void eat();
    public void walk(){
        System.out.println("这个动物用"+legs+"腿走路");
    }
}
