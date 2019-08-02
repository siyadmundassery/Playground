#include<stdio.h>
int main()
{
  	int n,big,i;
      scanf("%d",&n);
  int a[100];
  for(i=0;i<n;i++)
    scanf("%d",&a[i]);
  big=a[0];
  for(i=0;i<n;i++)
    if(a[i]>big)
      big=a[i];
  printf("%d",big);
  
  
}