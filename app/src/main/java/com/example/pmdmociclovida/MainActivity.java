package com.example.pmdmociclovida;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainCicloVida";
    protected Integer score = 0;
    protected String mensaje;
    protected TextView tv;
    protected EditText et;
    private Button bt, btSiguiente;


    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "METODO ONCREATE");
        tv = findViewById(R.id.texto);
        bt = findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumauno(v);
            }
        });
    }*/

    /* ALTERNATIVA 2  COMENTAR EL ONRESTOREINSTANCESTATE*/

    @Override
    protected void onCreate(Bundle estado) {
        super.onCreate(estado);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "METODO ONCREATE");
        tv = findViewById(R.id.texto);
        bt = findViewById(R.id.button);
        et = findViewById(R.id.mensaje);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumauno(v);
            }
        });
        if(estado != null){
            mensaje = estado.getString("contenido");
            score = estado.getInt("numero");
            tv.setText(String.valueOf(score));
        }

        btSiguiente = findViewById(R.id.btSiguiente);
        btSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(i);
            }
        });
    }



    @Override
    protected void onSaveInstanceState(Bundle guardaEstado) {
        super.onSaveInstanceState(guardaEstado);
        guardaEstado.putInt("numero", score);
        guardaEstado.putString("contenido", mensaje);
    }

    /*@Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        score = savedInstanceState.getInt("numero");
        tv.setText(String.valueOf(score));
    }*/

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

    public void sumauno(View view){
        score++;
        tv.setText(String.valueOf(score));
    }


}
