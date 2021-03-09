package com.example.mvvmcountries.di;

import com.example.mvvmcountries.model.CountriesApi;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

//component of a dagger library to create object
@Module
public class ApiModule {

    //SingleTon is only allow single intance of the class
    private static final String BASE_URL = "https://raw.githubusercontent.com/";

    @Provides
    public CountriesApi provideCountiresApi(){
             return new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
            .create(CountriesApi.class);
    }
}
