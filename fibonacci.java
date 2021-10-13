import java.util.*;
public class fibonacci {
    public static void main(String args[]){  
        Scanner scan = new Scanner(System.in);
        System.out.println("FIBONACCI");
        System.out.print("Please Enter a Number: ");
        int num=scan.nextInt();
        int a=0,b=1,c;
        System.out.print(a+"\t"+b);//printing 0 and 1 
        
        while(true){
            c=a+b;
            if(c<num){
                System.out.print("\t"+c);
                a=b;
                b=c;
            }else{
                System.exit(0);
            }
                
        }
      
    }
}