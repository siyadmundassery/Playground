#include<stdio.h>
int main()
{
  int a[100],i,n;
  scanf("%d",&n);
  i=0;
  while(n>0)
  {
    a[i]=n%2;
    n=n/2;
    i++;
  }
  i--;
for(;i>=0;i--)
    printf("%d",a[i]);
}