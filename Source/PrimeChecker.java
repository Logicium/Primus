package Source;
import java.util.ArrayList;
import java.util.List;

public class PrimeChecker implements PrimeNumberGenerator {

	public List<Integer> generate(int startingValue, int endingValue){
		
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		int largestNumber = 0; int smallestNumber = 0;
        if(startingValue>endingValue) {
        	largestNumber = startingValue; smallestNumber = endingValue;
        }
        else if(endingValue > startingValue) {
        	largestNumber = endingValue; smallestNumber = startingValue;
        }
        else {
        	System.out.println("Invalid values");
        }
		
        for(int i = smallestNumber; i <= largestNumber; ++i) {
            if(this.isPrime(i)) {
            	primes.add(i);
                System.out.println(i);
            }
        }
		
		return primes;
	}
	
	public boolean isPrime(int value) {
		for(int check = 2; check < value; ++check) {
            if(value % check == 0) {
                return false;
            }
        }
        return true;
	}

}
