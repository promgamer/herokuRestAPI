package herokuRestAPI.models;

import java.util.Date;

/**
 * Created by Miguel on 01/11/2015.
 */
public class Trip {

    public Station startStation;
    public Station endStation;
    public Date startTime;
    public Date endTime;
    public int trainMaxSize;
    public int id;
}
