package com.mstztrk.j10_1lifecycle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView txtMesaj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Buralar hep bizim
        setContentView(R.layout.activity_main);
        txtMesaj = (TextView) findViewById(R.id.txtMesaj);
        txtMesaj.setText(R.string.karsilama_html);
        txtMesaj.setTextSize(40);
        Toast.makeText(this, "Merhaba GitHub :)", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "System Ready on Start", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "On Resume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "On Pause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Ben Terminatör T100 - Destroyed", Toast.LENGTH_SHORT).show();
    }
}