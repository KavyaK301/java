package p125;

public class staircasepath {
  public static void findpaths(int n,String path) {
	   if(n==0) {
		System.out.println(path);
	   }
	     if(n<=0) {
	    	 return;
	     }
	     findpaths(n-1,path+"1");
	     findpaths(n-2,path+"2");
	   }
  public static void main(String [] args) {
	  int n=4;       
	  findpaths(n," ");
	  
  }
  }


