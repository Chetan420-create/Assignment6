package arrayassignment;

public class task9 {

	public static void main(String[] args) {
		// reverse an array
		
		int []arr = {1,2,3,4,5};

		int rev[] = new int[arr.length];
		
		
		for(int i=0;i<arr.length;i++) {
			rev[i] = arr[arr.length-1-i];
			
			}
		
		for(int j=0;j<rev.length;j++) {
			System.out.println(rev[j]);
		}
		}
		
		
		

	}


