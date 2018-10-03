/*
Program will check the to see if the echo is on, if on it will turn it off.
If off it will turn it on and tell the user.
*/
#include <stdio.h>
#include <termios.h>
#include <stdlib.h>
int main()
{
        struct termios info;
        int rv;
        rv = tcgetattr( 0, &info );     /* read values from driver      */
        if ( rv == -1 ){
                perror( "tcgetattr");
                exit(1);
        }
        //checks the echo bit
        //if on it will tell the user it is on
        if ( info.c_lflag & ECHO ){
                printf("echo is on , since its bit is 1\n");
                system("stty -echo");
                printf("Echo has been turned off! \n");

        }
        //if off it will tell the user it is off
        else{
                printf("echo if OFF, since its bit is 0\n");
                system("stty echo");
                printf("Echo has been turned on! \n");
        }
}
