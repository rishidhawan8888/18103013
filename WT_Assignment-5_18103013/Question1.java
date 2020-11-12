
package solution;

public class Q1{
public static void main(String... args){
        Thread thread=new Thread(){
            public void run(){
                int count=0;
                while(count<101){
                    count++;
                    System.out.print(count+" ");
                    if((count%10)==0)
                    {   System.out.println();
                        System.out.println("10 second message");
                        System.out.println();
                    }
                    try{
                        Thread.sleep(1000);
                    } catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        };
        thread.start();
    }}