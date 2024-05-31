/*
 THREADS


SOFTWARE
   OS
HARDWARE

Same program ahs multiple threads running at the same time
The class should extend Thread class
 */

class T1 extends Thread{
    public void run(){
        for(int i=0; i<100; i++)
        {
            System.out.println("Hello T1");     //every thread should have a run method
        }
        
    }
}

class T2 extends Thread{
    public void run(){
        for(int i=0; i<100; i++)
        {
            System.out.println("Hello T2");     //every thread should have a run method
        }
    }
}

public class ThreadsCode {
    public static void main(String[] args) {
        
        T1 obj1 = new T1();
        T2 obj2 = new T2();

        obj1.start();
        obj2.start();

        //in output we can see that there is a random order of output of Hello T1 and Hello T2
        //hence we can see that the two processes are running parallely

        //Scheduler in OS decides how much time of CPU attention to allocate for a particular task
    }
}
