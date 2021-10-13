import java.util.*;
class factorial {

    static void factorial(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact=fact*i;
        }
        System.out.print("The Factorial of "+n+" is "+fact);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("FACTORIAL");
        System.out.print("Please Enter a Number: ");
        int num=scan.nextInt();
        factorial(num);
    }

}
