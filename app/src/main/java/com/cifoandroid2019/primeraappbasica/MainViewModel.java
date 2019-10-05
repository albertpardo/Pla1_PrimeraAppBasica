package com.cifoandroid2019.primeraappbasica;

import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private Frase mFrase ;
    private MainModel mMainModel;

    public MainViewModel() {
        mMainModel = new MainModel();
    }

    public Frase getFrase() {
        return mFrase;
    }

    public void setFrase(Frase frase) {
        mFrase = frase;
    }

    public void selectFrase(int fraseType){
        mFrase = mMainModel.selectFraseModel(fraseType);
    }
}
