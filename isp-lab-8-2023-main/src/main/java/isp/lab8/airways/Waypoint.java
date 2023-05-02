package isp.lab8.airways;

import java.io.Serializable;
import java.util.Objects;

/**
 * Example waypoint class which can be extended to be used in implementation of the exercise. Add constructor, getters, setters, etc.
 */
public class Waypoint implements Serializable,Comparable<Waypoint> {
    private int index;
    private String name;
    private double latitude;
    private double longitude;
    private int altitude;

    public Waypoint(int index, String name, double latitude, double longitude, int altitude) {
        this.index = index;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public int getAltitude() {
        return altitude;
    }

    @Override
    public String toString() {
        return "Waypoint{" + "index=" + index + ", name=" + name + ", latitude=" + latitude + ", longitude=" + longitude + ", altitude=" + altitude + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Waypoint other = (Waypoint) obj;
        return Objects.equals(this.name, other.name);
    }
    
}