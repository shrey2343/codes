//To Find Season Using Switch Case.Menu driven program.
import java.util.Scanner;
public class Season{
public static void main(String args[]){
Scanner scan = new Scanner (System.in);
System.out.print("Enter a Month:-");
int month = scan.nextInt();
switch (month){
    case 11:
    case 12:
    case 1:
    case 2:System.out.println("winter season");break;
    case 3:
    case 4:System.out.println("atumn season");break;
    case 5:
    case 6:
    case 7:System.out.println("summer season");break;
    case 8:
    case 9:
    case 10:System.out.println("rainy season");break;
    default: System.out.println("invalid input"); 
    


}
}
}










