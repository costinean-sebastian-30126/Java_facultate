package isp.lab10.exercise1;
import java.util.ArrayList;
import java.util.List;

public class FlightEventRepository {
    private List<FlightEvent> flightEvents;

    public FlightEventRepository() {
        flightEvents = new ArrayList<>();
    }

    public void addEvent(FlightEvent event) {
        flightEvents.add(event);
    }

    public List<FlightEvent> getAllEvents() {
        return flightEvents;
    }

   
}
