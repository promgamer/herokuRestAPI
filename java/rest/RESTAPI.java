package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import models.Trip;
import models.TripSegment;
import models.User;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * Created by Miguel on 31/10/2015.
 */
public class RESTAPI {

    private static final String BASE_URL = "https://qrails.herokuapp.com";
    private Retrofit retrofit;

    private HerokuService restAPI;

    public RESTAPI() {

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create()))
                .build();
        restAPI = retrofit.create(HerokuService.class);
    }


    public User getUser(String userID){

        Response<User> user = null;
        try {
             user = restAPI.getUser(userID).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return user.body();

    }

    public List<TripSegment> getTodayTripSegment(){
        Response<List<TripSegment>> user = null;
        try {
            user = restAPI.getTodayTripSegments().execute();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return user.body();
    }
}
