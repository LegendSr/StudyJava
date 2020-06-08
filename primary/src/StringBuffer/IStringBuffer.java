package StringBuffer;

/**
 * @description:自己的StringBuffer
 * @author: Hg
 * @create: 2020-06-08 10:02
 **/
public interface IStringBuffer {
    public void append(String str);
    public void apend(char c);
    public void insert(int pos,char b);
    public void insert(int post,String b);
    public void delete(int start);
    public void delete(int start,int end);
    public void reverse();
    public int length();
}
