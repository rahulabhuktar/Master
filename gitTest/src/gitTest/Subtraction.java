package gitTest;

public class Subtraction {
	public static int subNumber(int a,int b)
	{
		return a-b;
	}

	public void addNumber()
	{
		int i= 50;
		float y=30.5f;
		System.out.println(i+y);
	}
	public void mulNumber()
	{
		int i= 50;
		int y=3;
		System.out.println(i*y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sub=  subNumber(80,10);
		
		System.out.println(sub);

		Subtraction s= new Subtraction();
		s.addNumber();
		
	
	}

}
