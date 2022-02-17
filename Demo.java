package sub_string;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s="Ginu_C_G";
		
		//substring
		
		System.out.println(s.substring(3));
		System.out.println(s.substring(2,4)); //includes starting index and excludes end index
	    
		
		//indexOf
		System.out.println(s.indexOf('G'));
		
		//lastIndexOf
		System.out.println(s.lastIndexOf('G'));
	}

}
