package p125;

public class Movezerotoend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,4,0,9,0,10,11};
		int n=arr.length;
		int [] newarr = new int[n];
		int ind=0;
		for(int i:arr) {
			if(i!=0) {
				newarr[ind]=i;
				ind++;
			}
		}
		for( int i:newarr)
			System.out.println(i); 
		
		
		
	}

}
