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
public class MyThread extends Thread {
    
    MyTimeBasedRunnable myr;
    
    public MyThread(MyTimeBasedRunnable myr) {
        super(myr);
        //this.myr = myr;
        
    }
    
}
