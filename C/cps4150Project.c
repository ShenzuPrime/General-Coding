#include <stdio.h>
#include <string.h>

//defining the struct
struct info {
  int id;
  char last_name[10];
  char first_name[10];
  char birth_month[2];
  char birth_day[2];
  char birth_year[4];
};
//the function
int function(struct info a){

  //basepointer after print
  void *printptr;
  asm("movl %%ebp, %0;":"=r"(printptr));
  printf("The value of basepointer print: ");
  printf("%p\n",printptr);

  //basepointer of function
  void *baseptr;
  asm("movl (%%ebp), %0;":"=r"(baseptr));
  printf("The value at basepointer function: ");
  printf("%p\n",baseptr);

  //printing Address of struct contents
  printf("Address of id: %p\n", &a.id);
  printf("Address of fname: %p\n", &a.first_name);
  printf("Address of lname: %p\n", &a.last_name);
  printf("Address of bday: %p\n", &a.birth_day);
  printf("Address of bmonth: %p\n", &a.birth_month);
  printf("Address of byear: %p\n", &a.birth_year);

  //printing value of memory address for birthday/month
  char *charp = &a.birth_month;
  int *intp = charp;
  printf("Address of my birthday and month is at address: %p\n", charp);
  printf("Integer value of my birthday and month is: %u\n", *intp);

  return 0;
}
int main(){
  //prints basepointer at the start
  void *baseptr;
  asm("movl %%ebp, %0;":"=r"(baseptr));
  printf("The value of basepointer main: ");
  printf("%p\n",baseptr);

  //making the struct, hard coding idea thanks to carlos
  struct info ian;
  ian.id = 943266;
  strcpy( ian.first_name, "Ian");
  strcpy( ian.last_name, "Brugal");
  ian.birth_month[0] = '0';
  ian.birth_month[1] = '9';
  ian.birth_day[0] = '2';
  ian.birth_day[1] = '4';
  ian.birth_year[0] = '1';
  ian.birth_year[1] = '9';
  ian.birth_year[2] = '9';
  ian.birth_year[3] = '6';

  //boring print stuff
  printf("ID: %d\n", ian.id);
  printf("First Name: %s\n", ian.first_name);
  printf("Last Name: %s\n", ian.last_name);
  printf("Birth Day: %.*s%s\n",2, ian.birth_day);
  printf("Birth Month: %.*s%s\n",2, ian.birth_month);
  printf("Birth Year: %.*s%s\n",4, ian.birth_year);

  function(ian);

  return 0;
}
