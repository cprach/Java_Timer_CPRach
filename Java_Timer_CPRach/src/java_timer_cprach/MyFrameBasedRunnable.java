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
public class MyFrameBasedRunnable implements Runnable {
    
    long currentFrame = 0;
    long stopFrame = 0;
    boolean running = false;
    int frameCount = 0;

    @Override
    public void run() {
        
        while (running == true) {
            frameCount ++;
            if (frameCount >= stopFrame) {
                System.out.println("FrameCount: " + frameCount);
                stopFrame = frameCount + 1000;
            }
        }
        
    }
    public void setRunning(Boolean b) {
        this.running = b;
    }
    
}
