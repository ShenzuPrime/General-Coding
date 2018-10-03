#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int addnums(int a, int b){
  return a+b;
}
int main(int argc, char *argv[]){
  int e = atoi(argv[1]);
  int i = atoi(argv[2]);
  int sum = addnums(e,i);

  printf("%d\n",sum);
}
