package com.jointhehead.allprogrammingoverview;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SQLLanguageActivity extends AppCompatActivity {
  TextView SQLOverViewTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sql_language);
        setTitle("SQL Language");

        SQLOverViewTextView=(TextView)findViewById(R.id.SQLOverViewTextView);
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.N){
            SQLOverViewTextView.setText(Html.fromHtml(getString(R.string.SQLOverview),Html.FROM_HTML_MODE_LEGACY));
        }else{SQLOverViewTextView.setText(Html.fromHtml(getString(R.string.SQLOverview)));}
        SQLOverViewTextView.setMovementMethod(LinkMovementMethod.getInstance());

    }
}