package decrementandincrement;

public class Preincrementpostincrement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i,k;
		i=6;
		k=i++;
		System.out.println("k="+k);
		System.out.println("i="+i);

		
		
		k=++i;
		System.out.println("k="+k);
		System.out.println("i="+i);

	}

}
