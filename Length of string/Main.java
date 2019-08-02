#include<stdio.h>
int main()
{
  char a[100],i;
 gets(a);
  for(i=0;a[i]!='\0';i++){}
  printf("%d",i);
  return 0;
}