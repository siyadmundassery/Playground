#include<stdio.h>

int main()
{
  //Type your code here
  char a[100];
    int c=0,i;
    gets(a);
  for(i=0;a[i]!='\0';i++)
    if(a[i]==' ')
      c++;
  printf("%d",c+1);
}