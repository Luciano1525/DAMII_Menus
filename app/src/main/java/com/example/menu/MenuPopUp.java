package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MenuPopUp extends AppCompatActivity {

    private ImageView ibtnMePop;

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
        setContentView(R.layout.activity_menu_pop_up);
        //Activar Toolbar
        setSupportActionBar(findViewById(R.id.toolbar));



    }

    public void MenuPop(View v){
        ibtnMePop = (ImageView) findViewById(R.id.ibtnMePop);
        PopupMenu mp = new PopupMenu(this, ibtnMePop);
        mp.getMenuInflater().inflate(R.menu.menu_pop_up, mp.getMenu());
        mp.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getItemId()==R.id.MO1) {
                    Intent intent = new Intent(MenuPopUp.this,MenuOpcional.class);
                    startActivity(intent);

                } else if (item.getItemId()==R.id.MOC1) {
                    Intent intent = new Intent(MenuPopUp.this,MenuContextual.class);
                    startActivity(intent);

                } else if (item.getItemId()==R.id.MOVP1) {
                    Intent intent = new Intent(MenuPopUp.this,MainActivity.class);
                    startActivity(intent);

                } else if (item.getItemId()==R.id.MOS1) {
                    finishAffinity();

                }

                return false;

            }
        });

        mp.show();

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
            Intent intent = new Intent(MenuPopUp.this,MenuPopUp.class);
            startActivity(intent);

        }else if(id==R.id.MIO) {
            SharedPreferences TS = getSharedPreferences("Tema", Context.MODE_PRIVATE);
            String TemaSeleccionado1 = "Oscuro";
            SharedPreferences.Editor TO = TS.edit();
            TO.putString("TemaSeleccionado2", TemaSeleccionado1.toString());
            TO.commit();
            Toast.makeText(this, "Tema Oscuro Aplicado", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MenuPopUp.this,MenuPopUp.class);
            startActivity(intent);

        }else if(id==R.id.MIP1){
            SharedPreferences TS = getSharedPreferences("Tema", Context.MODE_PRIVATE);
            String TemaSeleccionado1 = "Personalizado1";
            SharedPreferences.Editor TP1 = TS.edit();
            TP1.putString("TemaSeleccionado2", TemaSeleccionado1.toString());
            TP1.commit();
            Toast.makeText(this, "Tema Personalizado Aplicado", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MenuPopUp.this,MenuPopUp.class);
            startActivity(intent);

        }else if(id==R.id.MIP2){
            SharedPreferences TS = getSharedPreferences("Tema", Context.MODE_PRIVATE);
            String TemaSeleccionado1 = "Personalizado2";
            SharedPreferences.Editor TP2 = TS.edit();
            TP2.putString("TemaSeleccionado2", TemaSeleccionado1.toString());
            TP2.commit();
            Toast.makeText(this, "Tema Personalizado Aplicado", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MenuPopUp.this,MenuPopUp.class);
            startActivity(intent);

        }else if(id==R.id.MIP3){
            SharedPreferences TS = getSharedPreferences("Tema", Context.MODE_PRIVATE);
            String TemaSeleccionado1 = "Personalizado3";
            SharedPreferences.Editor TP3 = TS.edit();
            TP3.putString("TemaSeleccionado2", TemaSeleccionado1.toString());
            TP3.commit();
            Toast.makeText(this, "Tema Personalizado Aplicado", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MenuPopUp.this,MenuPopUp.class);
            startActivity(intent);

        }else if(id==R.id.MIP4){
            SharedPreferences TS = getSharedPreferences("Tema", Context.MODE_PRIVATE);
            String TemaSeleccionado1 = "Personalizado4";
            SharedPreferences.Editor TP4 = TS.edit();
            TP4.putString("TemaSeleccionado2", TemaSeleccionado1.toString());
            TP4.commit();
            Toast.makeText(this, "Tema Personalizado Aplicado", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MenuPopUp.this,MenuPopUp.class);
            startActivity(intent);

        }

        return super.onOptionsItemSelected(item);
    }

}