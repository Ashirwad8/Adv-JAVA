import java.util.Scanner;
public class BmiCal {
	
	public static void main(String ...args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter principal : ");
		double pamt=input.nextDouble();
		
		System.out.println("Enter rate: ");
		double rate=input.nextDouble();
		
		System.out.println("Enter time period: ");
		double time=input.nextDouble();
		
		
		double emi = (pamt*rate*Math.pow(1+rate, time))/(Math.pow(1+rate,time)-1);
		
		System.out.println("Your EMI is : "+emi);;
		
	}

}
