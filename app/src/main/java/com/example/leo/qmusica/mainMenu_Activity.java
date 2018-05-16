package com.example.leo.qmusica;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mainMenu_Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu_);
        /*Intent Button*/
        Button btn = (Button)findViewById(R.id.btnCampanha);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(mainMenu_Activity.this,modoCampanha.class));
            }
        });
        /*Intent Button*/
        Button arcade = (Button)findViewById(R.id.btnArcade);
        arcade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(mainMenu_Activity.this,modoCampanha.class));
            }
        });
        /*Intent Button*/
        Button config = (Button)findViewById(R.id.btnConfig);
        config.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(mainMenu_Activity.this,configuracoes.class));
            }
        });
        Button sair = (Button)findViewById(R.id.btnSair);
        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(mainMenu_Activity.this,MainActivity.class));
            }
        });
    }
}
