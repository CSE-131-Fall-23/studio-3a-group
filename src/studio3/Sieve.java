package studio3;
import java.util.*;

public class Sieve {

	public static void main(String[] args) {
		// 

	  Scanner in=new Scanner(System.in);
	  
	  System.out.print("Please input the number,up to which you will sieve primes:");
	  int upLimit=in.nextInt();
	  
	  int[] numSeries=new int[upLimit+1];
	  
	  for(int i=1;i<=upLimit;++i) {
		  
		  numSeries[i-1]=i;
	  }
	  
	  for( int i=1;i<=upLimit;++i ) {
		  
		  for(int j=2;j<=Math.sqrt(upLimit);++j) {
			  
			  if(numSeries[i]%j==0&&numSeries[i]/j>1) numSeries[i]=0; 
			  
		  }
	  }
	  System.out.println("\nAll non-zero numbers left in the array numSeries are prime numbers, as follows: ");
	  
	  for(int value:numSeries)
		  System.out.print(value+" ");
	       
	  
	}

}
