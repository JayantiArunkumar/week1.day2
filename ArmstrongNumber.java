package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int input=153;
		int original,calculated=0,remainder;
		original=input;
		while(input>0) {
			remainder=input%10; //remainder=3
			input=input/10; //input=15
			calculated+=(remainder*remainder*remainder);
			
			
		}
		if(calculated==original)
			System.out.println("The number "+original+" is an ArmstrongNumber");
		
	}

}
