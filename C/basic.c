#include <stdio.h>

int addnums(int a, int b,){
  return a+b;
}
int main(){
  int c = 4;
  int d = 6;
  int sum = addnums(c,d);
  printf("%d\n",sum);
}
