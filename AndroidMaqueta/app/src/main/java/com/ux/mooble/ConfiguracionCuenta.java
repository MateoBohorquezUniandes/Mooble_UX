package com.ux.mooble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConfiguracionCuenta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion_cuenta);

        Button info = findViewById(R.id.button2);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), ConfiguracionGeneral.class);
                startActivityForResult(intent, 0);
            }
        });

        Button info2 = findViewById(R.id.button3);
        info2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), ConfiguracionGeneral.class);
                startActivityForResult(intent, 0);
            }
        });
    }
}