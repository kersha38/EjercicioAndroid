package com.example.usrgam.tienda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnIngresar= (Button) findViewById(R.id.buttonLogin);
    Button btnInvitado=(Button) findViewById(R.id.buttonInvited);
    EditText Nombre=(EditText) findViewById(R.id.editTextName);
    //EditText Pass=(EditText)findViewById(R.id.editTextPassword);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // voy a otra pantalla
        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String datosLogin=Nombre.getText().toString();
                cambiaPantalla(v,datosLogin);
            }
        });

        btnInvitado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiaPantalla(v,"");
            }
        });

    }
    public void cambiaPantalla(View v,String datosLog){
        Intent intent= new Intent(getApplicationContext(),Main2Activity.class);

        intent.putExtra("datosLogin",datosLog);
        startActivity(intent);
    }

}
