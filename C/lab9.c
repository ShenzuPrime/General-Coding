#include <unistd.h>
#include <sys/types.h>
#include <errno.h>
#include <stdio.h>
#include <sys/wait.h>
#include <stdlib.h>

int var_global = 0; /* A global variable*/

int main(void)
{
    pid_t forkRet;
    int var_local = 0;

    forkRet = fork();

    if(forkRet >= 0) // fork was successful
    {
        if(forkRet == 0) // child process
        {
            var_local++;
            var_global++;
            printf("\n Child Process :: var_local = %d, var_global = %d my PID = %d\n", var_local, var_global, getpid());
        }
        else //Parent process
        {
            var_local = 10;
            var_global = 20;
            printf("\n Parent process :: var_local = %d, var_global = %d\n my PID = %d", var_local, var_global, getpid());
        }
    }
    else // fork failed
    {
        printf("\n Fork failed, quitting!!!!!!\n");
        return 1;
    }

    return 0;
}
