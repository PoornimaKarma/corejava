package demoArrays;

public class Secondlargest {
	
		public static void main(String[] args) {
			int arr[]={5,65,20,60,41,65};
			int s_max=Integer.MIN_VALUE;
			int max=Integer.MIN_VALUE;
			
			for(int i=0;i<arr.length;i++)
			{
			    if(arr[i]>max)
			    {
			        s_max=max;
			        max=arr[i];
			    }
			    else if(s_max<arr[i]&&max!=arr[i])
			    {
			        s_max=arr[i];
			    }
			}
			System.out.println(s_max);
		}
	}


