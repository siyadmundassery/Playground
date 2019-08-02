#include<stdio.h>
int main()
{
	char a[100];
  int i,c=1;
    gets(a);
  for(i=0;a[i]!='\0';i++)
  {
    if(a[i]==a[i+1])
      c++;
  else 
  {
    if(c>20)
      printf("Invalid Input");
    else
    	printf("%c%d",a[i],c);
    	c=1;
  }
  }
    
    
}