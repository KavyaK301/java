package p125;

public class print2d {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[][] matrix= {
    		   {1,2,3},
    		   {4,5,6},
    		   {7,8,9}
       };
       int n=matrix.length;
       for(int i=0;i<n;i++)
       {
    	   for(int j=0;j<n;j++) {
    		   System.out.print( matrix[i][j]+" ");
    	   }
       
       System.out.println(" "); 
       }
	}
}
