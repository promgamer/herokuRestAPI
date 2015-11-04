package rest;

import java.util.Collection;
import java.util.List;

import models.Trip;
import models.TripSegment;
import models.User;
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
