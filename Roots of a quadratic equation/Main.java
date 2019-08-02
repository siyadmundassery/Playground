#include<stdio.h>
#include<math.h>
int main()
{
  float root1,root2,a,b,c,real,img,det;
  scanf("%f%f%f",&a,&b,&c);
  det=b*b-4*a*c;
  if(det>0)
  {
    root1=(-b+sqrt(b*b-4*a*c))/2*a;
 root2=(-b-sqrt(b*b-4*a*c))/2*a;
  printf("root1 = %.2f  root2 = %.2f",root1,root2);
  
  }
  else if(det==0)
  {
    root1=-b/2*a;
    printf("root1 = %.2f  root2 = %.2f",root1,root1);
  }
  else
  {
    real=-b/(2*a);
    img=sqrt(-det)/(2*a);
    printf("root1 = %0.2f + %0.2fi  root2 = %0.2f - %0.2fi",real,img,real,img);
  }
}