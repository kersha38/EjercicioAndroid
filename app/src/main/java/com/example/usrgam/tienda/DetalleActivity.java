package com.example.usrgam.tienda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import modelos.Producto;

public class DetalleActivity extends AppCompatActivity {

    TextView textView=(TextView)findViewById(R.id.textView);
    Button btnComprar=(Button)findViewById(R.id.buttonComprar);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        Producto product =(Producto) getIntent().getExtras().getSerializable("producto");


        textView.setText("Detalle de producto"+product.toString());
        btnComprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String datosLogin=(String)getIntent().getExtras().getString("datosLogin");
                if(datosLogin==""){
                    Toast.makeText(getApplicationContext(),"Necesita Logearse",Toast.LENGTH_LONG).show();
                }else
                    Toast.makeText(getApplicationContext(),"Comprado",Toast.LENGTH_LONG).show();
            }
        });

    }


}
