package com.example.fydel.cryptocompare.Remote;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import com.example.fydel.cryptocompare.Model.Coin;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by FYDEL on 10/20/2017.
 */

public interface CoinService {

    @GET("data/price")
    Call<Coin> calculateValue (@Query("fsym") String from, @Query("tsyms") String to);
}

