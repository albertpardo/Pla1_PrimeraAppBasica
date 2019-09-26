package com.cifoandroid2019.primeraappbasica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class FraseDetailActivity extends AppCompatActivity {

    private TextView mTextId, mTextFrase, mTextAutor;
    private int fraseId;
    private Frase frase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frase_detail);

        mTextId = findViewById(R.id.textId);
        mTextFrase = findViewById(R.id.textFrase);
        mTextAutor = findViewById(R.id.textAutor);

        fraseId = getIntent().getIntExtra(Constants.EXTRA_INTENT_FRASE_DETAIL,1);
        FraseDao fraseDao = new FraseDao();
        frase = fraseDao.getFraseById(fraseId);

        mTextId.setText(String.valueOf(frase.getId()));
        mTextFrase.setText(frase.getText());
        mTextAutor.setText(frase.getAutor());
        

    }
}
