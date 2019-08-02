#include<stdio.h>
int main()
{
  int d;
  double r,a;
  scanf("%d",&d);
  r=(float)d/2;
  a=3.14*r*r;
  printf("%.2f",a);
  return 0;
}