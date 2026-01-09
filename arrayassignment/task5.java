package arrayassignment;

public class task5 {

	public static void main(String[] args) {
		// element at even and odd index
		
		int arr[] = {1,2,3,4,5};
		
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				System.out.println("even index element : "+arr[i]);
			}
			
//			if(i%2!=0) {
//				System.out.println("odd index element : "+arr[i]);
//			}
		}

	}

}
