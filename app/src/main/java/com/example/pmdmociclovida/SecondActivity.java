package com.example.pmdmociclovida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "SecondActivityCicloVida";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(TAG, "METODO ONCREATE");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "METODO ONSTART");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "METODO ONRESUME");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "METODO ONPAUSE");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "METODO ONSTOP");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "METODO ONRESTART");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "METODO ONDESTROY");
    }
}
