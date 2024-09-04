package InterviewProgarms;

public class FactorsOfno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=50;
		System.out.println("Factors of the given No is:");
		for(int i=1;i<=fact;i++)
		{
			if(fact%i==0) {
				System.out.println(i);
			}
		}
		
	}

}
