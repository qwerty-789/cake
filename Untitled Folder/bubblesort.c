#include<stdio.h>

int main()
{
	int a[]={2,7,4,1,5,3};
	int n=6;
	sort(a,n);
	printf("print array");
	printarray(a,n);

}

void sort(int a[],int n)
{
	int i,j;
	for(i=0; i<n-1; i++)
	{
		for(j=0; j<n-i-1; j++)
		{
			if(a[j] > a[j+1])
			{
				swap(&a[j],&a[j+1]);
			}
		}
	}
}

void swap(int *a,int *aa)
{	
	int temp=*a;
	*a=*aa;
	*aa=temp;
}	
	
void printarray(int a[],int n)
{
	for(int i=0; i<n; i++)
	{
		printf("%d\t",a[i]);
	}
}
		
