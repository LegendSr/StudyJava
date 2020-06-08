package 类和对象;

/**
 * @description: 武器类
 * @author: Hg
 * @create: 2020-06-05 12:44
 **/
public class Weapon extends Item{
    int damage;

    public static void main(String[] args) {

        Weapon weapon=new Weapon();
        weapon.damage=15;
        weapon.name="布甲";
        weapon.price=300;

        Weapon weapon1=new Weapon();
        weapon1.name="锁子甲";
        weapon1.damage=40;
        weapon1.price=500;
    }
}
