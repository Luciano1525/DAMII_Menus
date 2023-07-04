package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MenuOpcional extends AppCompatActivity {

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
        setContentView(R.layout.activity_menu_opcional);
        //Activar Toolbar
        setSupportActionBar(findViewById(R.id.toolbar));
    }


    //Metodo para mostrar y ocultar el menu

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menuoverflow, menu);
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
            Intent intent = new Intent(MenuOpcional.this,MenuOpcional.class);
            startActivity(intent);

        }else if(id==R.id.MIO) {
            SharedPreferences TS = getSharedPreferences("Tema", Context.MODE_PRIVATE);
            String TemaSeleccionado1 = "Oscuro";
            SharedPreferences.Editor TO = TS.edit();
            TO.putString("TemaSeleccionado2", TemaSeleccionado1.toString());
            TO.commit();
            Toast.makeText(this, "Tema Oscuro Aplicado", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MenuOpcional.this,MenuOpcional.class);
            startActivity(intent);

        }else if(id==R.id.MIP1){
            SharedPreferences TS = getSharedPreferences("Tema", Context.MODE_PRIVATE);
            String TemaSeleccionado1 = "Personalizado1";
            SharedPreferences.Editor TP1 = TS.edit();
            TP1.putString("TemaSeleccionado2", TemaSeleccionado1.toString());
            TP1.commit();
            Toast.makeText(this, "Tema Personalizado Aplicado", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MenuOpcional.this,MenuOpcional.class);
            startActivity(intent);

        }else if(id==R.id.MIP2){
            SharedPreferences TS = getSharedPreferences("Tema", Context.MODE_PRIVATE);
            String TemaSeleccionado1 = "Personalizado2";
            SharedPreferences.Editor TP2 = TS.edit();
            TP2.putString("TemaSeleccionado2", TemaSeleccionado1.toString());
            TP2.commit();
            Toast.makeText(this, "Tema Personalizado Aplicado", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MenuOpcional.this,MenuOpcional.class);
            startActivity(intent);

        }else if(id==R.id.MIP3){
            SharedPreferences TS = getSharedPreferences("Tema", Context.MODE_PRIVATE);
            String TemaSeleccionado1 = "Personalizado3";
            SharedPreferences.Editor TP3 = TS.edit();
            TP3.putString("TemaSeleccionado2", TemaSeleccionado1.toString());
            TP3.commit();
            Toast.makeText(this, "Tema Personalizado Aplicado", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MenuOpcional.this,MenuOpcional.class);
            startActivity(intent);

        }else if(id==R.id.MIP4){
            SharedPreferences TS = getSharedPreferences("Tema", Context.MODE_PRIVATE);
            String TemaSeleccionado1 = "Personalizado4";
            SharedPreferences.Editor TP4 = TS.edit();
            TP4.putString("TemaSeleccionado2", TemaSeleccionado1.toString());
            TP4.commit();
            Toast.makeText(this, "Tema Personalizado Aplicado", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MenuOpcional.this,MenuOpcional.class);
            startActivity(intent);

        } else if (id==R.id.MOC){
            Toast.makeText(this, "Menu Contextual", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MenuOpcional.this,MenuContextual.class);
            startActivity(intent);

        } else if (id==R.id.MOP){
            Toast.makeText(this, "Menu PopUp", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MenuOpcional.this,MenuPopUp.class);
            startActivity(intent);

        } else if (id==R.id.MOVP){
            Toast.makeText(this, "Menu Principal", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MenuOpcional.this,MainActivity.class);
            startActivity(intent);

        } else if (id==R.id.MOS){
            Toast.makeText(this, "Aplicacion Finalizada", Toast.LENGTH_SHORT).show();
            finishAffinity();
        }

        return super.onOptionsItemSelected(item);
    }


}