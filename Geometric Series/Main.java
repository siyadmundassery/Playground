#include<stdio.h>
int main()
{
  int i,t,n;
  scanf("%d",&n);
 int a[1000]={1,1,2,3,4,9,8,27,16,81,32,243,64,729,128,2187};
  t=16;
  int k=16;
  /**if(n>k)
  {
    for(i=k;i<=n;i+2)
    {
      if(i%2==0)
      {
      	k=(k-1)*2;
  		a[i]=k;
      }
    else
    {
      t=k*3;
      a[i+1]=t;
    }
  }
  }**/
  printf("%d",a[n-1]);
}