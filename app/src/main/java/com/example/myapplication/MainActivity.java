package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText txtalamat = findViewById(R.id.alamatnya);
        EditText txtdate = findViewById(R.id.tgl);
        EditText txtemail = findViewById(R.id.email);
        EditText txthp = findViewById(R.id.nohp);
        EditText txtnama = findViewById(R.id.namanya);

        Button btn = findViewById(R.id.btn_pindah);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (txtnama.getText().toString().length()==0){
                    txtnama.setError("Harap isi nama Anda!");
                }if (txtalamat.getText().toString().length()==0){
                    txtalamat.setError("Harap isi alamat Anda!");
                }if (txtdate.getText().toString().length()==0){
                    txtdate.setError("Harap isi Tgl dan Tempat lahir Anda!");
                }if (txtemail.getText().toString().length()==0){
                    txtemail.setError("Harap isi email Anda!");
                }if (txthp.getText().toString().length()==0){
                    txthp.setError("Harap isi No. Handphone Anda!");
                } else {
                    Toast.makeText(getApplication(), "Data Berhasil di Input",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("namakey",txtnama.getText().toString());
                    intent.putExtra("alamatkey",txtalamat.getText().toString());
                    intent.putExtra("ttlkey",txtdate.getText().toString());
                    intent.putExtra("emailkey",txtemail.getText().toString());
                    intent.putExtra("hpkey",txthp.getText().toString());

                    startActivity(intent);

                }


            }
        });
    }
}