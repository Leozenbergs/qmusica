package com.example.leo.qmusica;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Success extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        /*Intent Button*/
        Button btn1 = (Button)findViewById(R.id.btnVoltar);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Success.this, mainMenu_Activity.class));
            }
        });
        /*Intent Button*/
        Button btn2 = (Button)findViewById(R.id.btnContinuar);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Success.this, modoCampanha.class));
            }
        });
    }

}
