#include<stdio.h>

int main()
{
 int arr[13]={2,3,3,4,4,4,6,6,6,6,7,7,7};
 int i;
 removeDuplicate(arr);
 return 0;
}
removeDuplicate(int arr)
{
	int i,k,num_dup=0;
	int dup=0;
	for(i=0;arr[i]!=-999;i++)
	{
		if(arr[i]==arr[i+1])
		{
			k=i+1;
			while(arr[k]!=-999)&&(arr[k]==arr[k+1])
			   k++;
			   
		num_dup=k-i;
		}
		dup=dup+1;
		
		for(k=i+1;arr[k]!=-999;k++)
		{
			arr[k]=arr[k+num_dup];
		}
	}
	
	
}
