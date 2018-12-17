package com.example.benja.prototype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.Switch;

import java.util.ArrayList;
import java.util.List;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Switch onOffSwitch = findViewById(R.id.switch1);
        onOffSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    buttonView.setText(R.string.aan);
                } else {
                    buttonView.setText(R.string.uit);
                }
            }
        });
        onOffSwitch.setChecked(true);

        Switch themaSwitch = findViewById(R.id.switch2);
        themaSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    buttonView.setText(R.string.donker);
                } else {
                    buttonView.setText(R.string.licht);
                }
            }
        });

        List<String> spinnerarray = new ArrayList<>();
        spinnerarray.add("Klein");
        spinnerarray.add("Normaal");
        spinnerarray.add("Groot");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_spinner_item, spinnerarray);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner sItems = findViewById(R.id.spinner);
        sItems.setAdapter(adapter);

        List<String> spinnerarray2 = new ArrayList<>();
        spinnerarray2.add("Nederlands");
        spinnerarray2.add("Engels");
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(
                this, android.R.layout.simple_spinner_item, spinnerarray2);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner sItems2 = findViewById(R.id.spinner2);
        sItems2.setAdapter(adapter2);
    }
}
