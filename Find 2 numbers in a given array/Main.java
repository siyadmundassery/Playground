#include<stdio.h>
int main()
{
  	int n,i,j,k,n1=-1,n2=-1;
    scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
    scanf("%d",&a[i]);
  scanf("%d%d",&j,&k);
  
  for(i=0;i<n;i++)
  {
    if(a[i]==j)
      n1=i;
 	else if(a[i]==k)
     n2=i;
  }
    printf("Element 1 index = %d\nElement 2 index = %d",n1,n2);
}