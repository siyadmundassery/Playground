#include<stdio.h>
int main()
{
  //type your code here
  int n,arr[100],i=0;
  scanf("%d",&n);
  while(n>0)
  {
    arr[i]=n%8;
    n=n/8;
    i++;
  }
  i--;
  for(;i>=0;i--)
    printf("%d",arr[i]);
  return 0;
}