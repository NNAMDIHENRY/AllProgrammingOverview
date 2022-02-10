package com.jointhehead.allprogrammingoverview;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MakeMoneyActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_money);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.makeMoney);
       // bottomNavigationView.getChildAt(2).setBackgroundColor(Color.GREEN);
       // bottomNavigationView.setBackgroundColor(Color.GREEN);
        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.languages:
                        intent = new Intent(getApplicationContext(), LanguageListActivity_1.class);
                        startActivity(intent);
                        break;
                    case R.id.home:
                        intent = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(intent);
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
        bottomNavigationView.setSelectedItemId(R.id.makeMoney);
    }
}