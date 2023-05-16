package isp.lab10.exercise1;

public class Aircraft extends Thread {
    private String aircraftId;
    private String aircraftState;
    private int cruisingAltitude;
    private int cruisingTime;

    public Aircraft(String aircraftId) {
        this.aircraftId = aircraftId;
        this.aircraftState = "On Stand";
    }

    public String getAircraftId() {
        return aircraftId;
    }

    public String getAircraftState() {
        return aircraftState;
    }

    public int getCruisingAltitude() {
        return cruisingAltitude;
    }

    public void setCruisingAltitude(int cruisingAltitude) {
        this.cruisingAltitude = cruisingAltitude;
    }

    public int getCruisingTime() {
        return cruisingTime;
    }

    public void setCruisingTime(int cruisingTime) {
        this.cruisingTime = cruisingTime;
    }

    @Override
    public void run() {
        try {
            if (aircraftState.equals("Taxing")) {
                Thread.sleep(10000); // Simulating taxing for 10 seconds
                aircraftState = "Taking off";
                System.out.println("Aircraft " + aircraftId + " is taking off...");
                Thread.sleep(5000); // Simulating taking off for 5 seconds
                aircraftState = "Ascending";
                System.out.println("Aircraft " + aircraftId + " is ascending...");
                int targetAltitude = cruisingAltitude * 1000;
                int timeIncrement = 10000; // 10 seconds per 1000 meters increment
                while (cruisingAltitude > 0) {
                    Thread.sleep(timeIncrement);
                    cruisingAltitude--;
                    targetAltitude -= 1000;
                    System.out.println("Aircraft " + aircraftId + " is at " + cruisingAltitude +
                            "000 meters. Time spent in cruising: " + (cruisingTime++ * 10) + " seconds");
                }
                aircraftState = "Cruising";
                System.out.println("Aircraft " + aircraftId + " is now cruising at " + cruisingAltitude +
                        "000 meters.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void land() {
        if (aircraftState.equals("Cruising") && cruisingAltitude == 0) {
            aircraftState = "Descending";
            System.out.println("Aircraft " + aircraftId + " is descending...");
            while (cruisingAltitude < 3) { // Assuming landing at 3000 meters
                try {
                    Thread.sleep(10000); // Simulating descending for 10 seconds per 1000 meters increment
                    cruisingAltitude++;
                    System.out.println("Aircraft " + aircraftId + " is at " + cruisingAltitude +
                            "000 meters. Time spent in cruising: " + (cruisingTime++ * 10) + " seconds");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            aircraftState = "Landed";
            System.out.println("Aircraft " + aircraftId + " has landed. Total cruising time: " +
                    (cruisingTime * 10) + " seconds");
        } else {
            System.out.println("Aircraft " + aircraftId + " cannot land at the current state or altitude.");
        }
    }
}
