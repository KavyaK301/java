package p125;

public class spiralmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};

		int n=arr.length;

		int m=arr[0].length;

			for(int i=0;i<n;i++) {

			System.out.print(arr[0][i]+" ");

		}

			

			for(int i=1;i<m;i++) {

				System.out.print(arr[i][m-1]+" ");

			}

			

			for(int i=m-2;i>=0;i--) {

				System.out.print(arr[m-1][i]+" ");

			}

			

			for(int i=n-2;i>0;i--) {

				System.out.print(arr[i][0]+" ");

			}

			

			for(int i=1;i<m-1;i++) {

				System.out.print(arr[n-3][i]+" ");

			}

			

			for(int i=m-2;i>0;i--) {

				System.out.print(arr[n-2][i]+" ");

			}

			

	}




	}

