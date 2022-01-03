package Loops.Homework1;
import java.util.Scanner;
public class LoopsHomework1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("How many number will you enter:");
        int n=input.nextInt();
        int numberValue=0,maxNumber=0,minNumber=0;
        for(int i=1; i<=n; i++){
            System.out.print(i+".number:");
            numberValue=input.nextInt();
            if(numberValue==1){
                maxNumber=numberValue;
                minNumber=numberValue;
            }
            else if(numberValue>maxNumber){
                maxNumber=numberValue;
            }
            else if(numberValue<minNumber){
                minNumber=numberValue;
            }          
        }      
        System.out.println("Maximum number is "+maxNumber);
        System.out.println("Minimum number is "+minNumber);
    }
    
}
