package com.cifoandroid2019.primeraappbasica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button mConsellsButton;
    private Button mFrasesButton;
    private TextView mTextFrases;

    private FraseDao fraseDao;

    private List<Frase> mCitesCelebres;
    private List<Frase> mFrasesFetes;

    private static final String FRASE_KEY = "frase";
    private Frase mFrase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mConsellsButton = findViewById(R.id.but_consells);
        mFrasesButton = findViewById(R.id.but_frases_fetes);
        mTextFrases= findViewById(R.id.textFrases);

        fraseDao = new FraseDao();
        mCitesCelebres = fraseDao.getConsells();
        mFrasesFetes = fraseDao.getFrases();

        if (savedInstanceState != null) {
            mFrase = fraseDao.getFraseById(savedInstanceState.getInt(FRASE_KEY, 1));
            setFraseText(mFrase.getText());
        }

        mConsellsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Has premut el botó dels consells", Toast.LENGTH_SHORT).show();
                visualizeStringFromListFrases(mCitesCelebres);
            }
        });

        mFrasesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Has premut el botó de les frases fetes", Toast.LENGTH_SHORT).show();
                visualizeStringFromListFrases(mFrasesFetes);
            }
        });
    }

    private void setFraseText(String frase) {
        mTextFrases.setText(frase);
    }

    private void visualizeStringFromListFrases( List<Frase> listFrases) {
        mFrase = listFrases.get((int)(Math.random() * listFrases.size()));
        setFraseText(mFrase.getText());
    }

    @Override
    public void onSaveInstanceState(Bundle saveInstanceState) {
        super.onSaveInstanceState(saveInstanceState);
        saveInstanceState.putInt(FRASE_KEY, mFrase.getId());
    }
}