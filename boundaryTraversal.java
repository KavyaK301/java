package p125;

public class boundaryTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {

	            {1, 2, 3},

	            {4, 5, 6},

	            {7, 8, 9}

	        };

	        int n = arr.length;

	        int m = arr[0].length;



	        if (n == 1) {

	            

	            for (int i = 0; i < m; i++) {

	                System.out.print(arr[0][i] + " ");

	            }

	        } else if (m == 1) {

	            

	            for (int i = 0; i < n; i++) {

	                System.out.print(arr[i][0] + " ");

	            }

	        } else {

	            

	            for (int i = 0; i < m; i++) {

	                System.out.print(arr[0][i] + " ");

	            }

	          

	            for (int i = 1; i < n; i++) {

	                System.out.print(arr[i][m - 1] + " ");

	            }

	            

	            for (int i = m - 2; i >= 0; i--) {

	                System.out.print(arr[n - 1][i] + " ");

	            }

	         

	            for (int i = n - 2; i > 0; i--) {

	                System.out.print(arr[i][0] + " ");

	            }

	        }

	    }



	}
