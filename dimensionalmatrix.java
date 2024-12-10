package p125;

public class creat2darraymatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int matrix[][]= {
		  {1,2,3},
		  {4,5,6},
		  {7,8,9}
  };
  int n= matrix.length;
  for(int i=0;i<n;i++) {
	  System.out.print(matrix[i][i]+" ");
  }
  System.out.println(" ");
	  for(int i=0;i<n;i++) {
		  System.out.print(matrix[i][n-1-i]+" ");
	  }
  }      
	}


