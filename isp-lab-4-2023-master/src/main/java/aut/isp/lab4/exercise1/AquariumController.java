package aut.isp.lab4.exercise1;

public class AquariumController {

    private String manufacures;
    private String model;
    private float currentTime;

    public AquariumController(String manufacures, String model, float currentTime) {
        this.manufacures = manufacures;
        this.model = model;
        this.currentTime = currentTime;
    }

    public float getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(float currentTime) {
        this.currentTime = currentTime;
    }

    @Override
    public String toString() {
        return "AquariumController{" + "manufacures=" + manufacures + ", model=" + model + ", currentTime=" + currentTime + '}';
    }
    
    }
