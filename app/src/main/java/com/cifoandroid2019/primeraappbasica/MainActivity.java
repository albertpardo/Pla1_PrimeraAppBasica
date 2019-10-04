package com.cifoandroid2019.primeraappbasica;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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

    MainViewModel mMainViewModel;

    private static final String FRASE_KEY = "frase";

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

        mMainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);

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

        mTextFrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FraseDetailActivity.class);
                intent.putExtra(Constants.EXTRA_INTENT_FRASE_DETAIL, mMainViewModel.getFrase().getId());
                startActivity(intent);
            }
        });

        //Evita un error al arrancar l'app per que mMainViewModel.getFrase() es null
        if (mMainViewModel.getFrase() != null) {
            setFraseText(mMainViewModel.getFrase().getText());
        }
    }

    private void setFraseText(String frase) {
        mTextFrases.setText(frase);
    }

    private void visualizeStringFromListFrases( List<Frase> listFrases) {
        mMainViewModel.setFrase(listFrases.get((int)(Math.random() * listFrases.size())));
        setFraseText(mMainViewModel.getFrase().getText());
    }
}