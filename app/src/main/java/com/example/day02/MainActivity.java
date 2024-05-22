package com.example.day02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvresult;
    private EditText etlength, etheight, etwidth;
    private Button btndoit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // inisialisasi
        tvresult = findViewById(R.id.result);
        etheight = findViewById(R.id.height);
        etlength = findViewById(R.id.length);
        etwidth = findViewById((R.id.width));
        btndoit = findViewById(R.id.doit);
        btndoit.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.doit)
        {
            String inputLength  = etlength.getText().toString().trim();
            String inputWidth  = etwidth.getText().toString().trim();
            String inputHeight  = etheight.getText().toString().trim();

            int hasil = Integer.parseInt(inputHeight) * Integer.parseInt(inputWidth)
                    * Integer.parseInt(inputLength);

            String hasil2 = String.valueOf(hasil);

            tvresult.setText(hasil2);



        }
    }
}