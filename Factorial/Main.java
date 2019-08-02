#include<stdio.h>
int main()
{
	long int n,fact=1,i;
  scanf("%ld",&n);
  for(i=1;i<=n;i++)
    fact*=i;
  printf("%ld",fact);
}