package com.example.mvvmcountries.di;

import com.example.mvvmcountries.model.CountriesService;

import dagger.Module;
import dagger.Provides;

@Module
public class ServiceModule {
    private static CountriesService instance;

    @Provides
    public CountriesService provideCountryService(){
        if(instance == null){
            instance = new CountriesService();
        }
        return instance;
    }
}
