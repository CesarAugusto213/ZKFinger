package com.example.zkfinger10demo;

import com.example.zkfinger10demo.models.ConsumoRequest;
import com.example.zkfinger10demo.models.ConsumoResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface EcoService {

    @POST("/mobile/zkteco.php")
    Call<List<ConsumoResponse>> sendConsume(@Body ConsumoRequest request);

}
