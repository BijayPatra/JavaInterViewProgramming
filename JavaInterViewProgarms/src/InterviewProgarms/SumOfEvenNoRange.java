package InterviewProgarms;

public class SumOfEvenNoRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sNumber=8;
		int eNumber=250;
		int sum=0;
		for(int i=sNumber;i<=eNumber;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("Sum of Even no between 8 to 250 is  "+sum);

	}

}
