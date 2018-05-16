package com.example.leo.qmusica;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class configuracoes extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracoes);
        /*Intent Button*/
        Button audio = (Button)findViewById(R.id.btnAudio);
        audio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(configuracoes.this, mainMenu_Activity.class));
            }
        });
         /*Intent Button*/
        Button som = (Button)findViewById(R.id.btnSom);
        som.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(configuracoes.this, mainMenu_Activity.class));
            }
        });
         /*Intent Button*/
        Button gerenciar = (Button)findViewById(R.id.btnGerenciar);
        gerenciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(configuracoes.this, mainMenu_Activity.class));
            }
        });
    }
}
