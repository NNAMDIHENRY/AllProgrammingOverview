package com.jointhehead.allprogrammingoverview;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView=(BottomNavigationView) findViewById(R.id.bottomnavigation);
        bottomNavigationView.setSelectedItemId(R.id.home);
        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Intent intent1 = new Intent(getApplicationContext(), LanguageListActivity_1.class);
                Intent intent2 = new Intent(getApplicationContext(), MakeMoneyActivity.class);
                switch(menuItem.getItemId()){
                    case R.id.languages:
                        startActivity(intent1);
                        break;
                    case R.id.makeMoney:
                        startActivity(intent2);
                        break;
                }
                Toast.makeText(getApplicationContext(), "the navigation view is already working", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        bottomNavigationView.setSelectedItemId(R.id.home);

    }
}