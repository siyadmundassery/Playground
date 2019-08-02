#include<stdio.h>
int main()
{
  int yr;
  scanf("%d",&yr);
  if(yr%100!=0 && yr%4==0||yr%400==0)
    printf("LEAP YEAR");
  else
    printf("NOT LEAP YEAR");
  return 0;
}