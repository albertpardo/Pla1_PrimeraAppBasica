package com.cifoandroid2019.primeraappbasica;

import android.util.Log;

import java.util.List;

public class MainModel {

    private List<Frase> mCitesCelebres;
    private List<Frase> mFrasesFetes;

    protected MainModel() {
        FraseDao fraseDao = new FraseDao();
        this.mCitesCelebres = fraseDao.getConsells();
        this.mFrasesFetes = fraseDao.getFrases();
    }

    public Frase selectFraseModel(int sourceType){

        Frase frase = null;


        switch (sourceType){
            case Constants.CITES_CELEBRES:
                frase = randomFrase(mCitesCelebres);
                break;
            case Constants.FRASES_FETES:
                frase = randomFrase(mFrasesFetes);
                break;
        }

        return frase;
    }

    private Frase randomFrase(List<Frase> listFrases){
        return listFrases.get((int)(Math.random() * listFrases.size()));
    }
}
