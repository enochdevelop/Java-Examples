
package sort;

/**
 *
 * @author enoch
 */
public class StopWatch {
     private long startTime;
 private long endTime;

 public StopWatch() {
     this.startTime = System.currentTimeMillis();
     this.endTime = System.currentTimeMillis();
 
 }

public void start(){
    startTime = System.currentTimeMillis();
    
}
public void stop(){
    endTime = System.currentTimeMillis();
    
}

 public long getstartTime() { 
     return startTime;
 }

         
 public long getendTime() {
  return endTime; 
    
}
public long getElapsedTime(){
    return endTime - startTime;
    
}
}

