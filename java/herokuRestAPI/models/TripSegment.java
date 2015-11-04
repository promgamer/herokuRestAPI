package herokuRestAPI.models;

import java.util.Date;

/**
 * Created by Miguel on 01/11/2015.
 */
public class TripSegment {

    public Station initialStation;
    public Station finalStation;
    public ShortTrip trip;
    public int passengerCount;
    public Date time;
    public int id;
}
