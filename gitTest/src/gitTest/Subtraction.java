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

	public void sortingArray(){

		
		 int[] arr = new int[5];
		
		arr[0]=101;
		arr[1]=102;
		arr[2]=103;
		arr[3]=104;
		arr[4]=105;

		for(int i =0; i<5; i++) {
			
			System.out.println(arr[i]);
		}
		
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
		s.mulNumber();
		s.sortingArray();

	   
	}

}
