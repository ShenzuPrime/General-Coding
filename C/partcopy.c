#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <unistd.h>

int main(int argc, char *argv[]){
  /* Statements check to see if we have num1 num2 filesource and filetarget. */
  if (argc != 5){
    printf("Wrong amount of inputs in Command Line Arguement\n");
    return 0;
  }
  int num1 = atoi(argv[1]);
  int num2 = atoi(argv[2]);

  //Opens file and also checks to see if it exists.
  int filesource = 0;
  if((filesource = open(argv[3], O_RDONLY)) < 0){
      perror("Error: ");
      return 0;
    }
  //checking filesize agaisnt num1 and num2 and printout out error message if needed
  struct stat fileinfo;
  stat(argv[3], &fileinfo);

  if( fileinfo.st_size < (num1 + num2) )
  printf("Filesize smaller than what you want to read, will read to end of file only\n");

  //opnening / creating the new file
  int filetarget = open(argv[4], O_CREAT | O_RDWR, S_IRUSR | S_IWUSR | S_IXUSR);

  //creating a buffer to read only a specfic amount of bytes
  char buffer[num2];
  //setting the pointer to the specified bit
  lseek(filesource, num1, SEEK_SET);

  //read the file into the buffer
  read(filesource, buffer, num2);

  //print information in buffer to show user
  printf("%s\n", buffer);

  //write buffer to new file
  write(filetarget, buffer, num2);
}
