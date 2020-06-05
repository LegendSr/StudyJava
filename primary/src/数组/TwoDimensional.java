package 数组;

/**
 * @description: 二维数组找最大值
 * @author: Hg
 * @create: 2020-06-05 10:56
 **/
public class TwoDimensional {
    public static void main(String[] args) {
        int[][] list = new int[3][3];
        int max=0;
        int x=0;
        int y=0;
        for (int i = 0; i < list.length; i++) {
            System.out.print("第"+(i+1)+"列:");
            for (int j = 0; j < list[i].length; j++) {
                list[i][j]=(int)(Math.random()*100);
                if(list[i][j]>max){
                    max=list[i][j];
                    x=i;
                    y=j;
                }
                System.out.print(" "+list[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("最大值:"+max+"坐标第"+(x+1)+"列,第"+(y+1)+"位");

    }
}
