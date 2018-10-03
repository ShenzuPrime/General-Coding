#include <stdio.h>

int main()
{
  int a;
  int b;
  int c;
  int *pa;
  int *pb;
  int *pc;
  a = 12;
  b = 9;
  pa = &a;
  pb = pa;
  pc = pa;
  printf("value at pa = %d\n", *pa);
  printf("value at pb = %d\n", *pb);
  printf("value at pc = %d\n", *pc);
  pa = &b;
  printf("value at pa = %d\n", *pa);
  printf("value at pb = %d\n", *pb);
  printf("value at pc = %d\n", *pc);

  printf("address at pa = %p\n", pa);
  printf("address at pb = %p\n", pb);
  printf("address at pc = %p\n", pc);

  printf("value of varibale a = %d\n", a);
  printf("address of variable a = %p\n", pa);
  printf("size of variable a = %zu\n", sizeof(a));
  return 0;
}
