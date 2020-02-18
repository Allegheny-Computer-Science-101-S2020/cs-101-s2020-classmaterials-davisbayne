public class MathStub{
	public static void main(String[] args){
		MathDriver obj = new MathDriver();
		int first = 20;
		int second = 10;
		double input1 = 20.0;
		double input2 = 2.0;
		double input3 = 5.0;
		System.out.println("Inputs:" + first + "," + second);
		System.out.println("Add:" + obj.add(first, second));
		System.out.println("Sub:" + obj.sub(first, second));
		System.out.println("Mul:" + obj.mul(first, second));
		System.out.println("Div:" + obj.div(first, second));
		/*
		System.out.println("Inputs:" + input1 + "," + input2 + "," + input3);
		System.out.println("Add:" + obj.addD(input1, input2, input3));
		System.out.println("Sub:" + obj.subD(input1, input2, input3));
		System.out.println("Mul:" + obj.mulD(input1, input2, input3));
		System.out.println("Div:" + obj.divD(input1, input2, input3));
		*/
	}
}