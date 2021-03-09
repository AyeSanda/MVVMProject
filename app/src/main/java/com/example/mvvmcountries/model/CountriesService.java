package com.example.mvvmcountries.model;

import com.example.mvvmcountries.di.DaggerApiComponent;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Single;

public class CountriesService {


    @Inject
    public CountriesApi api;

    public CountriesService(){
        DaggerApiComponent.create().inject(this);
    }

    public Single<List<CountryModel>> getCountries(){
        return api.getCountries();
    }
}
