package demoArrays;

public class selectionshort {

	public static void main(String[] args) {
		 int arr[] = {23,21,10,89,22,20};
		
		 for(int i =0;i<arr.length;i++)
		 {
			 
			 int min =i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<min)
				{
					min=j;
				}
				
			}
			if(arr[i]!=min)
			{
				System.out.println(min);
			}
		 }

	}

}
