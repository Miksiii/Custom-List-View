package customlistadapter.metropolitan.fit.rs.customlistadapter;

/**
 * Created by Milan on 8/13/2016.
 */
public class Event {

    private String title;
    private String date;
    private String time;
    private int lon, lat;
    private int requiredPeople;

    public Event(String title, String date, String time, int lat, int lon, int requiredPeople) {
        this.title = title;
        this.time = time;
        this.date = date;
        this.lat = lat;
        this.lon = lon;
        this.requiredPeople = requiredPeople;
    }

    public int getLat() {
        return lat;
    }

    public int getRequiredPeople() {
        return requiredPeople;
    }

    public int getLon() {
        return lon;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setLat(int lat) {
        this.lat = lat;
    }

    public void setRequiredPeople(int requiredPeople) {
        this.requiredPeople = requiredPeople;
    }

    public void setLon(int lon) {
        this.lon = lon;
    }
}
