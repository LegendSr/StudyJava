package 内部类;

/**
 * @description: 英雄类
 * @author: Hg
 * @create: 2020-06-05 17:29
 **/
public class Hero {
    private String name;
    float hp;
    float armor;
    int moveSpeed;
    class BattleScore{
        int kill;
        int die;
        int assit;
        public void legendary(){
            if(kill>8)
                System.out.println(name+"超神");
            else
                System.out.println(name+"尚未超神！");
        }
    }
    public static void main(String[] args){
        Hero garen=new Hero();
        garen.name="盖伦";
        BattleScore score=garen.new BattleScore();
        score.kill=9;
        score.legendary();
    }
}
