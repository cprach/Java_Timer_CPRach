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
public class Java_Timer_CPRach {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //runTimeBased();
        runFrameBased();
    }
    
    public static void runFrameBased() {
        MyFrameBasedRunnable mfbr = new MyFrameBasedRunnable();
        mfbr.setRunning(true);
        MyThread myt = new MyThread(mfbr);
        myt.start();
    }
    
    public static void runTimeBased() {
        MyTimeBasedRunnable myr = new MyTimeBasedRunnable();
        myr.setRunning(true);
        MyThread myt = new MyThread(myr);
        myt.start();
    }
    
}
