package isp.lab10.exercise1;

import javax.swing.event.DocumentEvent.EventType;



public class FlightEvent {
    private String aircraftId;
    private EventType eventType;
    private long timestamp;

    public FlightEvent(String aircraftId, EventType eventType) {
        this.aircraftId = aircraftId;
        this.eventType = eventType;
        this.timestamp = System.currentTimeMillis();
    }

    public String getAircraftId() {
        return aircraftId;
    }

    public EventType getEventType() {
        return eventType;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
