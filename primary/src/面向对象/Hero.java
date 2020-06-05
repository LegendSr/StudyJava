package 面向对象;

/**
 * @description: 设计英雄对象
 * @author: Hg
 * @create: 2020-06-04 19:11
 **/
public class Hero {
    String name;
    Float hp;
    Float armor;
    int moveSpeed;
    void legendary(){
        System.out.println("超神了！");
    }
    float getHp(){
        return hp;
    }
    void recovery(float blood){
        hp+=blood;
    }
    void keng(){
        System.out.println("坑队友！");
    }
    float getArmor(){
        return armor;
    }
    void addMoveSpeed(int moveSpeed){
        this.moveSpeed+=moveSpeed;
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
