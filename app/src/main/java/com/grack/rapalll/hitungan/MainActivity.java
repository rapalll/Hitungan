package com.grack.rapalll.hitungan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_suhu, btn_lingkarang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_suhu        = (Button) findViewById(R.id.btn_suhu);
        btn_lingkarang  =  (Button) findViewById(R.id.btn_lingkaran);

        btn_lingkarang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, LingkaranActivity.class);
                startActivity(i);

            }
        });

        btn_suhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, SuhuActivity.class);
                startActivity(a);

            }
        });
    }
    public void exit(View view){
        System.exit(0);
    }
}
