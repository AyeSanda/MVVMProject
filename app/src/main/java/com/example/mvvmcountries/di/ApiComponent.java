package com.example.mvvmcountries.di;

import com.example.mvvmcountries.model.CountriesService;

import dagger.Component;

@Component(modules = {ApiModule.class})  //need to define which moudle we need to manage
public interface ApiComponent {
    void inject(CountriesService service);
}
