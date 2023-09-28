package com.ux.mooble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConfiguracionGeneral extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion_general);

        Button info = findViewById(R.id.button1);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), ConfiguracionCuenta.class);
                startActivityForResult(intent, 0);
            }
        });

        Button info2 = findViewById(R.id.button4);
        info2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Listado.class);
                startActivityForResult(intent, 0);
            }
        });

        Button info3 = findViewById(R.id.button17);
        info3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Listado.class);
                startActivityForResult(intent, 0);
            }
        });
    }
}