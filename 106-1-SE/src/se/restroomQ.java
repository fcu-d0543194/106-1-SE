package se;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class restroomQ {

    private final Timer timer = new Timer();
    private final int minutes;
    public restroomQ(int minutes) {
        this.minutes = minutes;
    }

    public void start() {
        Date now = new Date();
        timer.schedule(new RemindTask() , now, minutes * 2 * 1000);

    }

    class RemindTask extends TimerTask {
        int runtimer= 10;

        public void run(){
            if (runtimer> 0){
                System.out.println(runtimer+":Beep!  "+ new java.util.Date());
                runtimer--;
            } else{
                System.out.println(runtimer+" Time''s up!!  "+ new java.util.Date());
                timer.cancel(); //call System.exit is the same to stop PGM
                //System.exit(0);   //Stops the AWT thread (and everything else)
            }
        }
    }

}
/*
  public void restroomA() {
    System.out.print("去撞牆");

    System.out.print("開始計時");
  }
*/



