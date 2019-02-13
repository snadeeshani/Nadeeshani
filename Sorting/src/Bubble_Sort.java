
public class Bubble_Sort {
	
	public static void main(String[] args) {
		int list[]= {20,12,32,2};
		int i,j,temp=0;
		
		for(i=0; i<list.length-1;i++)
		{
			for(j=0; j<list.length-1-i; j++)
			{
				if(list[j]>list[j+1])
				{
					temp=list[j];
					list[j]=list[j+1];
					list[j+1]=temp;
				}
			}
		}
	}
}
