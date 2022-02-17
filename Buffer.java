package sub_string;

public class Buffer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s="Hello";
		StringBuffer b=new StringBuffer(s);
		// insert
		b.insert(2, "hi");
		System.out.println("After insert "+b);
		//append
		b.append("Banglore");
		System.out.println("After append "+b);		
		//replace
		b.replace(3,5,"How");
		System.out.println("After replace "+b);
		//reverse
		b.reverse();
		System.out.println("After reverse "+b);
		//delete
		b.delete(2,5);
		System.out.println("After delete "+b);
	}

}
