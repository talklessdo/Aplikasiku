package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        TextView rs_nama = findViewById(R.id.result_nama);
        TextView rs_alamat = findViewById(R.id.result_alamat);
        TextView rs_ttl = findViewById(R.id.result_ttl);
        TextView rs_email = findViewById(R.id.result_email);
        TextView rs_ho = findViewById(R.id.result_hp);

        Bundle take = getIntent().getExtras();
        if (take == null){
            return;
        }

        String name = take.getString("namakey");
        if (name != null){
            rs_nama.setText(name);
        }
        String address = take.getString("alamatkey");
        if (name != null){
            rs_alamat.setText(address);
        }
        String date = take.getString("ttlkey");
        if (name != null){
            rs_ttl.setText(date);
        }
        String mail = take.getString("emailkey");
        if (name != null){
            rs_email.setText(mail);
        }
        String no = take.getString("hpkey");
        if (name != null){
            rs_ho.setText(no);
        }

    }
}