package looping;

public class Break_and_continue_inside_loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		outer: 
			for(int i=1;i<=5;i++){
				//inner:
					for(int j=1;j<=5;j++){
						if(i==2){
							break outer; //can use break/continue
						}
						System.out.print(" i="+i+" j="+j);
					}
	System.out.println();
			}

	}

}
