package p125;

public class recursionfirstoccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};

		int target=4;

		int fo=firstocc(arr,0,target);

		System.out.println(fo);

	}

	public static int firstocc(int[] arr,int i,int target) {

		if(i==arr.length) {

			return -1;

		}

		

		if(arr[i]==target)

		{

			return i;

		}

		 return firstocc(arr,i+1,target);

	}

	}
