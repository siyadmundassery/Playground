#include <stdio.h>
int main() {
	int ch;
  scanf("%c",&ch);
  if(ch<97)
    ch+=32;
  else
    ch-=32;
  printf("%c",ch);
}