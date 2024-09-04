package InterviewProgarms;

public class printingPrimeNogivenRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sNumber = 10;
		int eNumber = 60;
		while (sNumber <= eNumber) {
			int number = sNumber;
			boolean isPrime = true;
			if (number > 1) {
				if (number == 2) {
					isPrime = true;
				} else {
					int i = 2;
					while (i < number) {
						if (number % i == 0) {
							isPrime = false;
							break;
						}
						i++;
					}
				}
			} else {
				isPrime = false;
				if (isPrime)
					System.out.println(number);
				sNumber++;
			}
		}
	}

}
