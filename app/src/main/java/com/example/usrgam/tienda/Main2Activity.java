package com.example.usrgam.tienda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import modelos.Producto;

public class Main2Activity extends AppCompatActivity {

    ListView lista=(ListView) findViewById(R.id.ListView);
    ArrayAdapter<Producto>adaptador;
    Producto []datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        lista=findViewById(R.id.ListView);
        cargarLista();

        //pongo adaptador con datos
        adaptador= new ArrayAdapter<Producto>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,datos);
        //paso adpater a la lista
        lista.setAdapter(adaptador);

        //evento de item de lista
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent= new Intent(getApplicationContext(),DetalleActivity.class);
                Producto product=datos[position];
                intent.putExtra("producto",product);
                intent.putExtra("datosLogin",getIntent().getExtras().getString("datosLogin"));
                startActivity(intent);
            }
        });
    }

    public void cargarLista(){
        datos= new Producto[]{new Producto("mouse",10.0,"mouse gamer",true,"azul,verde"),
                new Producto("agua",1.0,"guitig",true,"ninguno"),
                new Producto("monitor",110.0,"24 pulgadas",false,"rojo,verde"),
                new Producto("teclado",15.0,"contiene teclado numerico",true,"azul,verde"),
                new Producto("mouse",10.0,"mouse gamer",true,"azul,verde"),
                new Producto("mouse",10.0,"mouse gamer",true,"azul,verde"),
                new Producto("mouse",10.0,"mouse gamer",true,"azul,verde"),
                new Producto("mouse",10.0,"mouse gamer",true,"azul,verde"),
                new Producto("mouse",10.0,"mouse gamer",true,"azul,verde"),
                new Producto("mouse",10.0,"mouse gamer",true,"azul,verde"),
                new Producto("mouse",10.0,"mouse gamer",true,"azul,verde"),
                new Producto("mouse",10.0,"mouse gamer",true,"azul,verde"),
                new Producto("mouse",10.0,"mouse gamer",true,"azul,verde"),
                new Producto("mouse",10.0,"mouse gamer",true,"azul,verde"),
                new Producto("mouse",10.0,"mouse gamer",true,"azul,verde"),
                new Producto("mouse",10.0,"mouse gamer",true,"azul,verde"),
                new Producto("mouse",10.0,"mouse gamer",true,"azul,verde"),
                new Producto("mouse",10.0,"mouse gamer",true,"azul,verde"),
                new Producto("mouse",10.0,"mouse gamer",true,"azul,verde"),
                new Producto("mouse",10.0,"mouse gamer",true,"azul,verde"),
                new Producto("mouse",10.0,"mouse gamer",true,"azul,verde"),
                new Producto("mouse",10.0,"mouse gamer",true,"azul,verde"),
                new Producto("mouse",10.0,"mouse gamer",true,"azul,verde"),
                new Producto("mouse",10.0,"mouse gamer",true,"azul,verde"),
                new Producto("mouse",10.0,"mouse gamer",true,"azul,verde"),
                new Producto("mouse",10.0,"mouse gamer",true,"azul,verde"),
                new Producto("mouse",10.0,"mouse gamer",true,"azul,verde"),
                new Producto("mouse",10.0,"mouse gamer",true,"azul,verde"),
                new Producto("mouse",10.0,"mouse gamer",true,"azul,verde"),
                new Producto("mouse",10.0,"mouse gamer",true,"azul,verde"),
                new Producto("mouse",10.0,"mouse gamer",true,"azul,verde"),
                new Producto("mouse",10.0,"mouse gamer",true,"azul,verde"),
                new Producto("mouse",10.0,"mouse gamer",true,"azul,verde"),};
    }
}
