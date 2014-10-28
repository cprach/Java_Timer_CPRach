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
public class MyRunnable implements Runnable{
    
    long currentTime = 0;
    long stopTime = 0;
    boolean running = false;
    
    @Override
    public void run() {
        
//        while(running == true) {
//            System.out.println(currentTime);
//        }
        
        
        currentTime = System.nanoTime();
        stopTime = currentTime + 10000;
        
        if (currentTime >= stopTime) {
            System.out.println(currentTime);
            try {
                Thread.sleep(10000);
                stopTime = System.nanoTime() + 10000;
            } catch (InterruptedException interruptedException) {
            }
            
        }
        
//        if (currentTime >= stopTime) {
//            System.out.println(currentTime);
//            try {
//                Thread.sleep(10000);
//                stopTime = currentTime + 10000;
//            } catch (InterruptedException interruptedException) {
//            }
//            
//        }
        
        
        
    }
    
    public void setRunning(Boolean b) {
        this.running = b;
    }
    
}
