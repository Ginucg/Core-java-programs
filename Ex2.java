package java_array;

public class Ex2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[]={20,34,5,67,6,67};
		System.out.println("Array elements are");
		
		for(int i=0;i<a.length;i++){
           System.out.println(a[i]);
	}
		System.out.println("Reverse array elements are");
		for(int i=a.length-1;i>=0;i--){
			System.out.println(a[i]);
		}
	}
}
