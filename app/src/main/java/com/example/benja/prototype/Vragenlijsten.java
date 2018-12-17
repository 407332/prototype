package com.example.benja.prototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Vragenlijsten extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vragenlijsten);
        final Intent intent1 = new Intent(this,VragenlijstActivity.class);

        Button vragenlijst = findViewById(R.id.buttonp);
        Button vragenlijst2 = findViewById(R.id.button2p);
        Button vragenlijst4 = findViewById(R.id.button7);

        vragenlijst2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent1);
            }
        });
        vragenlijst4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent1);
            }
        });

        vragenlijst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent1);
            }
        });
    }
}
