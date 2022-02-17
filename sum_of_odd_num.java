package looping;

public class sum_of_odd_num {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i,sum=0;
		i=1;
		while(i<=10){
			sum=sum+i;
			i=i+2;
		}
		System.out.println("sum ="+sum);

	}

}
