package com.grack.rapalll.hitungan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SuhuActivity extends AppCompatActivity {

    EditText edtCelcius,edtFarenheit;
    Button btnHasil,btnClear;

    double awal , farenheit, celcius;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suhu);

        edtCelcius = (EditText) findViewById(R.id.edt_celcius);
        edtFarenheit = (EditText) findViewById(R.id.edt_farenheit);
        btnHasil = (Button) findViewById(R.id.btn_hasil);
        btnClear = (Button) findViewById(R.id.btn_clear);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double farenheit = Double.parseDouble(String.valueOf(edtFarenheit.getText()));
                double ncelcius = (farenheit - 32) * 1.8;
                edtCelcius.setText(String.valueOf(ncelcius));


            }
        });

    }

    public void clear(View view){
        edtFarenheit.setText("");
        edtCelcius.setText("");
    }
}
