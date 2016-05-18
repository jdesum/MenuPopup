package com.example.yoso.menupopup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Menu popup
    public void levantarMenuPopUp(View v){
        ImageView imagen = (ImageView) findViewById(R.id.imgImagen);
        // Crea instancia a PopupMenu
        PopupMenu popupMenu = new PopupMenu(this, imagen);
        popupMenu.getMenuInflater().inflate(R.menu.menu_popup, popupMenu.getMenu());

        // Registra los eventos click para cada item del menu
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()){
                    case R.id.mView:
                        // Acción
                        Toast.makeText(getBaseContext(), getResources().getString(R.string.menu_view), Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.mViewDetail:
                        // Acción
                        Toast.makeText(getBaseContext(), getResources().getString(R.string.menu_view_detail), Toast.LENGTH_SHORT).show();

                        break;
                }

                return true;
            }
        });



        popupMenu.show();

    }



}
