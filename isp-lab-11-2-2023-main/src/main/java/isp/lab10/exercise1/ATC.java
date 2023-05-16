package isp.lab10.exercise1;
import java.util.ArrayList;
import java.util.List;

public class ATC {
     private List<Aircraft> aircraftList;

    public ATC() {
        aircraftList = new ArrayList<>();
    }
    public void addAircraft(String id){
         Aircraft aircraft = new Aircraft(id);
        aircraftList.add(aircraft);
        System.out.println("Aircraft with id " + id + " added");
    }

    public void sendCommand(String id, AtcCommand command){
        System.out.println("Aircraft with id " + id + " received command " + command);
    }

    public void showAircrafts(){
        System.out.println("Aircraft List:");
        for (Aircraft aircraft : aircraftList) 
        System.out.println("Display aircrfats.");
    }
     
}

class AtcCommand {
    String command;

    public AtcCommand(String command) {
        this.command = command;
    }

    @Override
    public String toString() {
        return "AtcCommand{" +
                "command='" + command + '\'' +
                '}';
    }
}
