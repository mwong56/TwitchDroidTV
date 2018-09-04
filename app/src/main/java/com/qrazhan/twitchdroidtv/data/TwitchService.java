package com.qrazhan.twitchdroidtv.data;

import com.google.gson.JsonObject;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface TwitchService {

    @GET("games/top?client_id=jba9qgxbmnlwb4eb7gvmwtrxgmvozt&limit=50")
    Single<JsonObject> getTopStreams();

    @GET("streams/featured?client_id=jba9qgxbmnlwb4eb7gvmwtrxgmvozt&limit=50")
    Single<JsonObject> getFeaturedStreams();
}
