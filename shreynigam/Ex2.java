// infinite loop using while loop.
import java.util.Scanner;
class Ex2{
    public static void main (String args[]){
        int i=1;
        while(true)
        {
            System.out.println(i);
            i++;
            if(i==10000000)
               break;
        }
        
    }
}