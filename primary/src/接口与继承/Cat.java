package 接口与继承;

/**
 * @description: 猫类
 * @author: Hg
 * @create: 2020-06-05 18:01
 **/
public class Cat extends Animal implements Pet{

    private String name;
    @Override
    public String getName() {
        return name;
    }

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat(){
        this(null);
    }
    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void play() {

    }

    @Override
    public void eat() {
        System.out.println("吃鱼");
    }
}
