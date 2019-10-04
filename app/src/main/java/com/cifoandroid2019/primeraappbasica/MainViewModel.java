package com.cifoandroid2019.primeraappbasica;

import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private Frase mFrase ;

    public Frase getFrase() {
        return mFrase;
    }

    public void setFrase(Frase frase) {
        mFrase = frase;
    }
}
