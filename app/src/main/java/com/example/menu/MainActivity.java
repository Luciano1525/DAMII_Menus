package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

 private Button AcDes, btnMO, btnMS, btnMC, btnMP;
 private int vis = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Recuperar Tema y Aplicarlo
        SharedPreferences TS = getSharedPreferences("Tema", Context.MODE_PRIVATE);
        String TemaSeleccionado = TS.getString("TemaSeleccionado2", "No Hay Tema Aplicado");
        if (TemaSeleccionado != null) {
            if (TemaSeleccionado.equals("Claro")) {
                setTheme(R.style.Theme_Menu);
            } else if (TemaSeleccionado.equals("Oscuro")) {
                setTheme(R.style.Oscuro);
            } else if (TemaSeleccionado.equals("Personalizado1")) {
                setTheme(R.style.MiTema1);
            } else if (TemaSeleccionado.equals("Personalizado2")) {
                setTheme(R.style.MiTema2);
            } else if (TemaSeleccionado.equals("Personalizado3")) {
                setTheme(R.style.MiTema3);
            } else if (TemaSeleccionado.equals("Personalizado4")) {
                setTheme(R.style.MiTema4);
            }
        }
        setContentView(R.layout.activity_main);

        AcDes = (Button) findViewById(R.id.AcDes);
        AcDes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vis = vis +1;

                if (vis %2 ==0){
                    //Activar Toolbar
                    setSupportActionBar(findViewById(R.id.toolbar));
                    findViewById(R.id.toolbar).setVisibility(View.VISIBLE);
                    AcDes.setText("Desactivar Menu");
                    Toast.makeText(getApplicationContext(), "Menu Activado", Toast.LENGTH_SHORT).show();
                } else{
                    findViewById(R.id.toolbar).setVisibility(View.INVISIBLE);
                    AcDes.setText("Activar Menu");
                    Toast.makeText(getApplicationContext(), "Menu Desactivado", Toast.LENGTH_SHORT).show();
                }

            }
        });


        //Menu Opcional
        btnMO = (Button) findViewById(R.id.btnMO);
        btnMO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Menu de Opciones!", Toast.LENGTH_SHORT).show();
                Log.i("INFO:", "Menu Opciones");
                Intent intent = new Intent(MainActivity.this, MenuOpcional.class);
                startActivity(intent);
            }
        });

        //Menu Contextual
        btnMC = (Button) findViewById(R.id.btnMC);
        btnMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Menu Contextual!", Toast.LENGTH_SHORT).show();
                Log.i("INFO:", "Menu Contextual");
                Intent intent = new Intent(MainActivity.this, MenuContextual.class);
                startActivity(intent);

            }
        });

        //Menu PopUp
        btnMP = (Button) findViewById(R.id.btnMP);
        btnMP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Menu PopUp!", Toast.LENGTH_SHORT).show();
                Log.i("INFO:", "Menu PopUp");
                Intent intent = new Intent(MainActivity.this, MenuPopUp.class);
                startActivity(intent);

            }
        });

        //Finalizar App
        btnMS = (Button) findViewById(R.id.btnMS);
        btnMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Aplicacion Finalizada!", Toast.LENGTH_SHORT).show();
                Log.i("INFO:", "App Finish");
                finishAffinity();

            }
        });

    }


    //Metodo para mostrar y ocultar el menu

    public boolean onCreateOptionsMenu(Menu menu){
            getMenuInflater().inflate(R.menu.menu, menu);
            return true;
    }

    //Metodo de seleccion de opciones
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id==R.id.MIC) {
            SharedPreferences TS = getSharedPreferences("Tema", Context.MODE_PRIVATE);
            String TemaSeleccionado1 = "Claro";
            SharedPreferences.Editor TC = TS.edit();
            TC.putString("TemaSeleccionado2", TemaSeleccionado1.toString());
            TC.commit();
            Toast.makeText(this, "Tema Claro Aplicado", Toast.LENGTH_SHORT).show();

        }else if(id==R.id.MIO) {
            SharedPreferences TS = getSharedPreferences("Tema", Context.MODE_PRIVATE);
            String TemaSeleccionado1 = "Oscuro";
            SharedPreferences.Editor TO = TS.edit();
            TO.putString("TemaSeleccionado2", TemaSeleccionado1.toString());
            TO.commit();
            Toast.makeText(this, "Tema Oscuro Aplicado", Toast.LENGTH_SHORT).show();

        }else if(id==R.id.MIP1){
            SharedPreferences TS = getSharedPreferences("Tema", Context.MODE_PRIVATE);
            String TemaSeleccionado1 = "Personalizado1";
            SharedPreferences.Editor TP1 = TS.edit();
            TP1.putString("TemaSeleccionado2", TemaSeleccionado1.toString());
            TP1.commit();
            Toast.makeText(this, "Tema Personalizado Aplicado", Toast.LENGTH_SHORT).show();

        }else if(id==R.id.MIP2){
            SharedPreferences TS = getSharedPreferences("Tema", Context.MODE_PRIVATE);
            String TemaSeleccionado1 = "Personalizado2";
            SharedPreferences.Editor TP2 = TS.edit();
            TP2.putString("TemaSeleccionado2", TemaSeleccionado1.toString());
            TP2.commit();
            Toast.makeText(this, "Tema Personalizado Aplicado", Toast.LENGTH_SHORT).show();

        }else if(id==R.id.MIP3){
            SharedPreferences TS = getSharedPreferences("Tema", Context.MODE_PRIVATE);
            String TemaSeleccionado1 = "Personalizado3";
            SharedPreferences.Editor TP3 = TS.edit();
            TP3.putString("TemaSeleccionado2", TemaSeleccionado1.toString());
            TP3.commit();
            Toast.makeText(this, "Tema Personalizado Aplicado", Toast.LENGTH_SHORT).show();

        }else if(id==R.id.MIP4){
            SharedPreferences TS = getSharedPreferences("Tema", Context.MODE_PRIVATE);
            String TemaSeleccionado1 = "Personalizado4";
            SharedPreferences.Editor TP4 = TS.edit();
            TP4.putString("TemaSeleccionado2", TemaSeleccionado1.toString());
            TP4.commit();
            Toast.makeText(this, "Tema Personalizado Aplicado", Toast.LENGTH_SHORT).show();

        }

        Intent intent = new Intent(MainActivity.this,MainActivity.class);
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }




}