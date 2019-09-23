package com.cifoandroid2019.primeraappbasica;

public class Frase {

    private int mId;
    private String mText;
    private String mAutor;
    private int mTipus;

    public Frase(int mId, String mAutor, String mText,  int mTipus) {
        this.mId = mId;
        this.mText = mText;
        this.mAutor = mAutor;
        this.mTipus = mTipus;
    }

    public int getId() {
        return mId;
    }

    public void setId(int mId) {
        this.mId = mId;
    }

    public String getText() {
        return mText;
    }

    public void setText(String mText) {
        this.mText = mText;
    }

    public String getAutor() {
        return mAutor;
    }

    public void setAutor(String mAutor) {
        this.mAutor = mAutor;
    }

    public int getTipus() {
        return mTipus;
    }

    public void setTipus(int mTipus) {
        this.mTipus = mTipus;
    }

    @Override
    public String toString() {
        return "Frase{" +
                "mId=" + mId +
                ", mTipus=" + mTipus +
                '}';
    }


}
