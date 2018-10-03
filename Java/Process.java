/**********************************
MADE BY IAN B. AND ADONIS P.
SINGLE SERVER QUEUE SIMULATION


**********************************/
import java.util.*;
public class Process{
  int requiredTimeToComplete;
  int timeLeft;
  int timeInReadyQue;
  int timeEnter;
  int timeFinish;
  int turnAround;
  String name;

  Process(){};
  Process(String name, int requiredTimeToComplete){
    this.name = name;
    this.requiredTimeToComplete = requiredTimeToComplete;
    timeLeft = requiredTimeToComplete;
    timeInReadyQue = 0;
    timeEnter = 0;
    timeFinish = 0;
  }
  void decrementTimeLeft(){
    this.timeLeft--;
  }
  void incrementTimeInReadyQue(){
    this.timeInReadyQue++;
  }
  public static void main(String[] args){

    // Int values to to control when something enters queues and time required for completion
    int a = 2;
    int b = 3;
    int c = 1;
    int d = 15;

    double averageTimeInQue = 0;
    double turnaroundTime = 0;
    double cpuCounter = 0;
    int workCycle = 1;
    double readyQueAvgSize = 0;
    int readyQueMaxSize = 0;


    Process processA = new Process("A", c + (int)(Math.random()*(d-c)));
    Process processB = new Process("B",c + (int)(Math.random()*(d-c)));
    Process processC = new Process("C",c + (int)(Math.random()*(d-c)));
    Process processD = new Process("D",c + (int)(Math.random()*(d-c)));
    Process processE = new Process("E",c + (int)(Math.random()*(d-c)));
    Process processF = new Process("F",c + (int)(Math.random()*(d-c)));
    Process processG = new Process("G",c + (int)(Math.random()*(d-c)));

    //Queues to hold process when moving them around and stuff
    ArrayList<Process> workQue = new ArrayList<Process>();
    ArrayList<Process> readyQue = new ArrayList<Process>();
    ArrayList<Process> finishQue = new ArrayList<Process>();
    ArrayList<Process> startQue = new ArrayList<Process>();

    //adds process to start queue
    startQue.add(processA);
    startQue.add(processB);
    startQue.add(processC);
    startQue.add(processD);
    startQue.add(processE);
    startQue.add(processF);
    startQue.add(processG);

    while( workQue.size() > 0 || startQue.size() > 0 || readyQue.size() > 0 ){
      //If the work cycle is divisable by A or B something from the start queue will be added to the ready queue
      if (startQue.size() != 0 && workCycle % a == 0){
        startQue.get(0).timeEnter = workCycle;
        readyQue.add(startQue.get(0));
        startQue.remove(0);
        //ADD CODE TO SET TIME IT ENTERED READY QUE
      }
      if (startQue.size() != 0 && workCycle % b == 0){
        startQue.get(0).timeEnter = workCycle;
        readyQue.add(startQue.get(0));
        startQue.remove(0);
      }
      //If the work queue is empty grab something from the ready queue and add it to the work queue
      if (workQue.isEmpty() && !readyQue.isEmpty()){
        workQue.add(readyQue.get(0));
        readyQue.remove(0);
        //ADD CODE TO ADD TIME IT LEFT THE READY QUE
      }
      //Decrement the required time to complete. if time left is = 0, get it out of the work queue into the finish queue
      if (!workQue.isEmpty()){
        workQue.get(0).decrementTimeLeft();
      }
      if (!workQue.isEmpty() && workQue.get(0).timeLeft == 0){
        workQue.get(0).timeFinish = workCycle;
        finishQue.add(workQue.get(0));
        workQue.remove(0);
      }
      if (!workQue.isEmpty()) cpuCounter++;
      for (int x = 0; x < readyQue.size(); x++) readyQue.get(x).incrementTimeInReadyQue();

      readyQueAvgSize += readyQue.size();
      if (readyQue.size() > readyQueMaxSize) readyQueMaxSize = readyQue.size();

      //Text output for What has happened in the CPU Cycle
      System.out.println("****************************************************************");
      if (!workQue.isEmpty())
      System.out.println("Process being worked on: " + workQue.get(0).name);
      if (!readyQue.isEmpty()){
      System.out.print("Process waiting to be worked on: ");
      for (int x = 0; x < readyQue.size(); x++) System.out.print(" "+readyQue.get(x).name+", ");
      }
      System.out.println("");
      System.out.println("We are on the "+workCycle+" CPU cycle");
      if (!workQue.isEmpty())
      System.out.println("The Process being worked on needs "+ workQue.get(0).timeLeft +" CPU cycles");
      System.out.println("****************************************************************");
      workCycle++;
    }
    //figuring out turn around time
    for (int x = 0; x < finishQue.size(); x++){
      turnaroundTime = turnaroundTime + (finishQue.get(x).timeFinish - finishQue.get(x).timeEnter);
    }
    turnaroundTime = turnaroundTime / finishQue.size();

    for (int x = 0; x <finishQue.size(); x++)
    averageTimeInQue += finishQue.get(x).timeInReadyQue;
    averageTimeInQue = averageTimeInQue / finishQue.size();
    readyQueAvgSize = readyQueAvgSize / workCycle;

    //Showing statistics that you would like to see.
    System.out.println("######################################################");
    System.out.println("");
    System.out.println("A = "+a+"; B = "+b+"; C = "+c+"; D = "+d);
    System.out.println("");
    System.out.println("CPU Utilization is: "+ ((cpuCounter/workCycle)*100)+"%"); // make it add a 1 to a counter if work que is full, devide by work cycles and times 100
    System.out.println("Average time waiting in queue: "+ averageTimeInQue);
    System.out.println("Average length of ready queue: "+ readyQueAvgSize); // just tally up .size then divide by work cycle
    System.out.println("Maximum size of ready queue: "+ readyQueMaxSize); // if statement to see if size is bigger than old size, then keep it.
    System.out.println("Average turnaround time: "+ turnaroundTime);
    System.out.println("");
    System.out.println("");
    System.out.println("######################################################");
  }
}
