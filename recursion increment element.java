package p125;

public class recursioninc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		
		

		 reverse(n);

		

	 }

	 public static void reverse(int n) {

		 if(n==0) {

			 return;

		 }
		 reverse(n-1);

		 System.out.print(n+" ");

		
	}

}
