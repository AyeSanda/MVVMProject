package com.example.mvvmcountries.model;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface CountriesApi {

    //Single is a type of observable that Rx java generate for us. this is observable only one value and finish
    @GET("DevTides/countries/master/countriesV2.json")
    Single<List<CountryModel>> getCountries();
}
