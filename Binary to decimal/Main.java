#include<stdio.h>
int main()
{
 int n,dec=0,d;
 scanf("%d",&n);
  int base=1;
  while(n>0)
  {
    d=n%10;
    dec=dec+d*base;
    base=base*2;
    n=n/10;
  }
  printf("%d",dec);
}