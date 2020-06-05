package 数组;

/**
 * @description:
 * @author: Hg
 * @create: 2020-06-05 10:42
 **/
public class List {
    public static void main(String[] args) {
        int[] list=new int[5];
        list[0]= (int) (Math.random()*100);
        list[1]= (int) (Math.random()*100);
        list[2]= (int) (Math.random()*100);
        list[3]= (int) (Math.random()*100);
        list[4]= (int) (Math.random()*100);
        int min=list[0];
        for (int i = 0; i < list.length; i++) {
            if(list[i]<min){
                min=list[i];
            }
            System.out.println(list[i]);
        }
        System.out.println("最小值:"+min);
        System.out.println("数组反转前：");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        System.out.println("数组反转后:");
        int[] list2=new int[list.length];

        for (int i = 0; i < list2.length; i++) {
            list2[list2.length-1-i]=list[i];
        }
        for (int i = 0; i < list2.length; i++) {
            System.out.println(list2[i]);
        }
    }
}
