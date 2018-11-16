package com.grack.rapalll.hitungan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toolbar;

import org.w3c.dom.Text;

public class LingkaranActivity extends AppCompatActivity {

    Button btnHasil, btnClear;
    EditText edtJari, edtHasil;
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);


        btnHasil = (Button) findViewById(R.id.btn_hasil);
        edtJari = (EditText) findViewById(R.id.edt_jari);
        edtHasil = (EditText) findViewById(R.id.edt_hasil);
        btnClear = (Button) findViewById(R.id.btn_clear);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double jari = Double.parseDouble(String.valueOf(edtJari.getText()));
                double luaslingkaran = (3.14 * jari * jari);
                edtHasil.setText(String.valueOf(luaslingkaran));

            }
        });

    }

    public void clear(View view) {

        edtHasil.getText().clear();
        edtJari.getText().clear();

    }
}