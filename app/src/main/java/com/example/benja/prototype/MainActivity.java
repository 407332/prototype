package com.example.benja.prototype;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    boolean temp = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!temp){
            temp = true;
            startActivity(new Intent(this,welcomemessage.class));
        }
        final Intent intent1 = new Intent(this,VragenlijstActivity.class);
        setContentView(R.layout.activity_main);

        Button vragenlijst = findViewById(R.id.button);
        Button vragenlijst2 = findViewById(R.id.button2);

        vragenlijst2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent1);
                view.setVisibility(View.INVISIBLE);
            }
        });

        vragenlijst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent1);
                view.setVisibility(View.INVISIBLE);
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.navigation, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if (id ==R.id.navigation_vragenlijsten){
            startActivity(new Intent(this, Vragenlijsten.class));
        } else if (id == R.id.navigation_voortherapeut){
            startActivity(new Intent(this, therapeut.class));
        } else if(id == R.id.navigation_noodcontact){

        } else if(id == R.id.navigation_instellingen){
            startActivity(new Intent(this, Settings.class));
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return false;
    }

}
