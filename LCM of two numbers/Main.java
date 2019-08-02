#include <stdio.h>
int main()
{
  int a,b,k;
  scanf("%d%d",&a,&b);
  k=a*b;
  while(a!=b)
  {
    if(a>b)
    	a=a-b;
    else
      b=b-a;
  }
  printf("%d",k/a);
}