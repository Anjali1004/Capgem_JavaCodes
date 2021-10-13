import java.util.*;
class MoneyManagement{
	static void MoneyManage(int acc){
		int acc1, acc2, acc3, acc4, acc5, acc6;
		acc1= acc * 55/100;
		acc2=acc * 10/100;
		acc3=acc * 10/100;
		acc4=acc * 10/100;
		acc5=acc * 10/100;
		acc6=acc * 5/100;
		
		System.out.println("NEC: " +acc1);
		System.out.println("FFA: " +acc2);
		System.out.println("EDU: " +acc3);
		System.out.println("LTSS: " +acc4);
		System.out.println("PLAY: " +acc5);
		System.out.println("GIVE: " +acc6);
	}	

	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your income this month: ");
		int acc0= sc.nextInt();
		MoneyManage(acc0);
	}
}