import java.io.*;
import java.util.*;
public class PrintStairPath
{
    public static void main(String []args)throws Exception{
        Scanner s=new Scanner(System.in);
        int n =s.nextInt();
        printstair(n," ");
    }
    public static void printstair(int n,String path){
        if(n<0){
            return;
        }
        if(n==0){
            System.out.println(path);
            return;
        }
        printstair(n-1,path+"1");
        printstair(n-2,path+"2");
        printstair(n-3,path+"3");
    }
}
