package com.example.mvvmcountries.di;

import com.example.mvvmcountries.model.CountriesService;
import com.example.mvvmcountries.viewmodel.ListViewModel;

import dagger.Component;

@Component(modules = {ServiceModule.class})
public interface ModuleComponent {
    void inject(ListViewModel listViewModel);
}
