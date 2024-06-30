/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author swastik
 */
public class Timer {
    private ClockHand seconds;
    private ClockHand miliseconds; // 1/100 of a second
    
    public Timer() {
        this.seconds = new ClockHand(60);
        this.miliseconds = new ClockHand(100);
    }
    
    public void advance() {
        this.miliseconds.advance();
        
        if (this.miliseconds.value() == 0) {
            this.seconds.advance();
        }
        
    }
    
    public String toString() {
        return this.seconds + ":" + this.miliseconds;
    }
}
