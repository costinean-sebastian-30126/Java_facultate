package isp.lab10.raceapp;

import javax.swing.*;
import java.sql.Time;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        System.out.println("Race!");

        JFrame frame = new JFrame("Car Race");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JFrame frame2 = new JFrame("Semaphore");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CarPanel carPanel = new CarPanel();

        SemaphorePanel semaphorePanel = new SemaphorePanel();

        frame.getContentPane().add(carPanel);
        frame.pack();
        frame.setSize(500,300);
        frame.setVisible(true);

        frame2.getContentPane().add(semaphorePanel);
        frame2.pack();
        frame2.setVisible(true);

        Car car1 = new Car("Red car", carPanel);
        Car car2 = new Car("Blue car", carPanel);
        Car car3 = new Car("Green car", carPanel);
        Car car4 = new Car("Yellow car", carPanel);

        SemaphoreThread semaphoreThread = new SemaphoreThread(semaphorePanel);

        Timer timer = new Timer();

        semaphoreThread.start();

        try{
            semaphoreThread.join();
        }catch(Exception e){System.out.println(e);}

        PlaySound ps = new PlaySound();
        ps.playSound();

        timer.start();

        car1.start();
        car2.start();
        car3.start();
        car4.start();

        try{

            car1.join();
            car2.join();
            car3.join();
            car4.join();
        }catch(Exception e){System.out.println(e);}

        timer.stopCount();

        ps.stopSound();

        String[] positions = new String[]{car1.getName(),car2.getName(),car3.getName(),car4.getName()};
        long[] times = new long[]{car1.getRacetime(),car2.getRacetime(),car3.getRacetime(),car4.getRacetime()};

        int k=0;
        while(k==0){
            k=1;
            for(int i=0;i<3;i++){
                if(times[i]>times[i+1]){
                    long a=0;
                    String b=" ";
                    a=times[i+1];
                    b=positions[i+1];
                    times[i+1]=times[i];
                    positions[i+1]=positions[i];
                    times[i]=a;
                    positions[i]=b;
                    k=0;
                }
            }
        }

        for(int i=0 ;i<4;i++){
            System.out.println("Position "+(i+1)+" : "+positions[i]+" with time "+ (times[i]/1000) + "." + (times[i]%1000));
        }

        System.out.println(timer.getCount());
    }
}
