package com.example.android.carrosmaterial;

import android.content.Intent;
import android.content.res.Resources;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleCarro extends AppCompatActivity {

    private CollapsingToolbarLayout collapsingToolbarLayout;
    private Carro c;
    private String cedula, nombre, apellido, id;
    private int fot, sexo;
    private Bundle bundle;
    private Intent i;
    private ImageView foto;
    private Resources res;
    private TextView ced,nomb,app,sex;
    private String [] opc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_carro);
    }
}
