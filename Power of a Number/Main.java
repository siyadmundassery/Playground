#include <stdio.h>
int main()
{
  	int b,e,i,p=1;
  scanf("%d%d",&b,&e);
  if(e>=0)
  {
    for(i=1;i<=e;i++)
      p=p*b;
  printf("%d",p);
  }
  else
    printf("Wrong input");
    return 0;
}