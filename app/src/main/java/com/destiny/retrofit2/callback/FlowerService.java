package com.destiny.retrofit2.callback;

import com.destiny.retrofit2.model.Flower;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.Call;

/**
 * Created by eboni on 19/02/2016.
 */
public interface FlowerService {

    @GET("/feeds/flowers.json")
    Call<List<Flower>> getAllFlowers();
}
