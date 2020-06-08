package 接口与继承;

/**
 * @description:
 * @author: Hg
 * @create: 2020-06-05 18:07
 **/
public class Fish extends Animal implements Pet{
    public void walk(){
        System.out.println("不能行走");
    }
    public Fish(int legs) {
        super(0);
    }

    @Override
    public void eat() {
        System.out.println("吃浮游生物");
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void play() {

    }
}
