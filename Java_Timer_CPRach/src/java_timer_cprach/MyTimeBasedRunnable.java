/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

package java_timer_cprach;

/**
 *
 * @author rcolley
 */
public class MyTimeBasedRunnable implements Runnable{
    
    long currentTime = 0;
    long stopTime = 0;
    boolean running = false;
    
    @Override
    public void run() {
        while(running == true) {
            currentTime = System.currentTimeMillis();
            if (currentTime >= stopTime) {
                System.out.println(currentTime);
                stopTime = System.currentTimeMillis() + 1000;
            }
        }
    }
    public void setRunning(Boolean b) {
        this.running = b;
    }
  
}
