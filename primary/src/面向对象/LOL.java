package 面向对象;

/**
 * @description:游戏
 * @author: Hg
 * @create: 2020-06-04 19:26
 **/
public class LOL {
    public static void main(String[] args) {
        Hero hero =new Hero();
        hero.name="盖伦";
        hero.moveSpeed=350;
        hero.addMoveSpeed(100);
        System.out.println(hero.toString());
    }
}
