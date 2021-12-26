package week1.day2;

public class Calculator {
	
	public int add(int a,int b) {
		return a+b;
	}
	
	public double sub(double a,double b) {
		return a-b;
	}
	
	public double mul(double a,double b) {
		return a*b;
	}
	
	public int div(int a,int b) {
		return a/b;
	}
	

	public static void main(String[] args) {
		Calculator calc=new Calculator();
		int add=calc.add(10, 20);
		double sub=calc.sub(20.0, 10.0);
		double mul=calc.mul(10.0, 20.0);
		int div=calc.div(20, 2);
		
		System.out.println("The addition of 10 and 20:  "+add);
		System.out.println("The subtraction of 20 and 10:  "+sub);
		System.out.println("The multiplication of 10 and 20: "+mul);
		System.out.println("The division of 20 by 2: "+div);
		
	}

}
