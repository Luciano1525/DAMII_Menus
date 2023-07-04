package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MenuContextual extends AppCompatActivity {
    private ImageView ibtnMenu, ibtnMenu1;

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
        setContentView(R.layout.activity_menu_contextual);
        //Activar Toolbar
        setSupportActionBar(findViewById(R.id.toolbar));
        ibtnMenu1 = (ImageView) findViewById(R.id.ibtnMenu1);
        registerForContextMenu(ibtnMenu1);

    }

    @Override
    public void onCreateContextMenu(ContextMenu men, View V, ContextMenu.ContextMenuInfo menuinfo){
    super.onCreateContextMenu(men, V, menuinfo);
    getMenuInflater().inflate(R.menu.menu_contextual, men);

    }
    @Override
    public boolean onContextItemSelected(MenuItem item1){
    int id = item1.getItemId();
        if (id==R.id.MO2) {
            Intent intent = new Intent(MenuContextual.this,MenuOpcional.class);
            startActivity(intent);

        } else if (id==R.id.MOP2) {
            Intent intent = new Intent(MenuContextual.this,MenuPopUp.class);
            startActivity(intent);

        } else if (id==R.id.MOVP2) {
            Intent intent = new Intent(MenuContextual.this,MainActivity.class);
            startActivity(intent);

        } else if (id==R.id.MOS2) {
            finishAffinity();
        }
        return super.onOptionsItemSelected(item1);
    }

    public void MenuT(View v){
        ibtnMenu = (ImageView) findViewById(R.id.ibtnMenu);
        PopupMenu mp1 = new PopupMenu(this, ibtnMenu);
        mp1.getMenuInflater().inflate(R.menu.menu, mp1.getMenu());
        mp1.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                 if(item.getItemId()==R.id.MIC) {
                    SharedPreferences TS = getSharedPreferences("Tema", Context.MODE_PRIVATE);
                    String TemaSeleccionado1 = "Claro";
                    SharedPreferences.Editor TC = TS.edit();
                    TC.putString("TemaSeleccionado2", TemaSeleccionado1.toString());
                    TC.commit();
                    Intent intent = new Intent(MenuContextual.this,MenuContextual.class);
                    startActivity(intent);

                }else if(item.getItemId()==R.id.MIO) {
                    SharedPreferences TS = getSharedPreferences("Tema", Context.MODE_PRIVATE);
                    String TemaSeleccionado1 = "Oscuro";
                    SharedPreferences.Editor TO = TS.edit();
                    TO.putString("TemaSeleccionado2", TemaSeleccionado1.toString());
                    TO.commit();
                    Intent intent = new Intent(MenuContextual.this,MenuContextual.class);
                    startActivity(intent);

                }else if(item.getItemId()==R.id.MIP1){
                    SharedPreferences TS = getSharedPreferences("Tema", Context.MODE_PRIVATE);
                    String TemaSeleccionado1 = "Personalizado1";
                    SharedPreferences.Editor TP1 = TS.edit();
                    TP1.putString("TemaSeleccionado2", TemaSeleccionado1.toString());
                    TP1.commit();
                    Intent intent = new Intent(MenuContextual.this,MenuContextual.class);
                    startActivity(intent);

                }else if(item.getItemId()==R.id.MIP2){
                    SharedPreferences TS = getSharedPreferences("Tema", Context.MODE_PRIVATE);
                    String TemaSeleccionado1 = "Personalizado2";
                    SharedPreferences.Editor TP2 = TS.edit();
                    TP2.putString("TemaSeleccionado2", TemaSeleccionado1.toString());
                    TP2.commit();
                    Intent intent = new Intent(MenuContextual.this,MenuContextual.class);
                    startActivity(intent);

                }else if(item.getItemId()==R.id.MIP3){
                    SharedPreferences TS = getSharedPreferences("Tema", Context.MODE_PRIVATE);
                    String TemaSeleccionado1 = "Personalizado3";
                    SharedPreferences.Editor TP3 = TS.edit();
                    TP3.putString("TemaSeleccionado2", TemaSeleccionado1.toString());
                    TP3.commit();
                    Intent intent = new Intent(MenuContextual.this,MenuContextual.class);
                    startActivity(intent);

                }else if(item.getItemId()==R.id.MIP4){
                    SharedPreferences TS = getSharedPreferences("Tema", Context.MODE_PRIVATE);
                    String TemaSeleccionado1 = "Personalizado4";
                    SharedPreferences.Editor TP4 = TS.edit();
                    TP4.putString("TemaSeleccionado2", TemaSeleccionado1.toString());
                    TP4.commit();
                    Intent intent = new Intent(MenuContextual.this,MenuContextual.class);
                    startActivity(intent);

                }

                return false;

            }
        });
        mp1.show();
    }



}