package isp.lab10.raceapp;

public class Timer extends Thread {
    private long count=0;
    private boolean stop = false;

    public long getCount(){
        return this.count;
    }

    public void stopCount(){
        this.stop = true;
    }

    public void run() {
        while (stop==false){
            count++;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                    throw new RuntimeException(e);
            }
        }
    }
}
