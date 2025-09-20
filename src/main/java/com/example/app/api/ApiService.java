package com.example.app.api;

import com.example.app.models.UserRequest;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {
    @POST("/api/register")  // 백엔드 엔드포인트 주소
    Call<Void> registerUser(@Body UserRequest userRequest);
}
