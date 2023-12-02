package com.work.wallpaper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Carga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carga);

        final int duracion = 4000;
        new Handler().postDelayed(new Runnable(){
            @Override
            public void  run(){
                //codigo que se ejecutara
            Intent intent = new Intent(Carga.this,MainActivity.class);
            startActivity(intent);
            finish();
            }
        },duracion);
    }
}