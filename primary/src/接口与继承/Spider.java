package 接口与继承;

/**
 * @description:
 * @author: Hg
 * @create: 2020-06-05 17:56
 **/
public class Spider extends Animal {

    Spider(){
        super(8);
        this.legs=8;
    }

    @Override
    public void eat() {
        System.out.println("吃蚊子");
    }
}
