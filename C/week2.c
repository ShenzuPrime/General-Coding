#include <stdio.h>
#include <ctype.h>

int main(int argc, char *argv[]){
  /* if (argc != 4){
    printf("num1 num2 num3!\n");
    return 0;
  }
  if (isalpha(*argv[1])){
    printf("invalid input %s\n", argv[1]);
    return 0;
  }
  if (isalpha(*argv[2])){
    printf("invalid input %s\n", argv[2]);
    return 0;
  }
  if (isalpha(*argv[3])){
    printf("invalid input %s\n", argv[3]);
    return 0;
  }
  char highestNumber = *argv[1];
  if (highestNumber < *argv[2]) highestNumber = *argv[2];
  if (highestNumber < *argv[3]) highestNumber = *argv[3];
  printf("The maximum value is %c\n", highestNumber);
  return 0;
} */
char test = *argv[1] + *argv[2];
printf("answer is %c\n", test);

}
