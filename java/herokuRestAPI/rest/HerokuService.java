package herokuRestAPI.rest;

import java.util.List;

import herokuRestAPI.models.*;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by Miguel on 31/10/2015.
 */
public interface HerokuService {

    @GET("/user")
    Call<User> getUser(@Query("id") String userID);

    @GET("/tripsegment")
    Call<List<TripSegment>> getTodayTripSegments();


}
