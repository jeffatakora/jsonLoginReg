package com.example.jeff.jsonloginreg;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by jeff on 7/10/19.
 */

public interface APIService {

    @FormUrlEncoded
    @POST("api/login")
    Call<MSG> userLogIn(@Field("username") String email,
                        @Field("school_password") String password);

}
