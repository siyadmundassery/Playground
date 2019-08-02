#include<stdio.h>
int main()
{
  int n,key,i,f=0;
  scanf("%d",&n);
  int arr[n];
  for(i=0;i<n;i++)
    scanf("%d",&arr[i]);
  scanf("%d",&key);
  for(i=0;i<n;i++)
    if(arr[i]==key)
    {
     printf("%d",i+1);
      f=1;
    }
  if(f!=1)
    printf("%d isn't present in the array.",key);
     
}