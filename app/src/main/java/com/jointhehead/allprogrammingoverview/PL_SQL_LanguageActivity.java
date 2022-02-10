package com.jointhehead.allprogrammingoverview;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PL_SQL_LanguageActivity extends AppCompatActivity {
   TextView PL_SLASH_SQL_OverViewTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pl_sql_language);
        setTitle("PL/SQL Language");

        PL_SLASH_SQL_OverViewTextView=(TextView)findViewById(R.id.PL_SQL_OverViewTextView);
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.N){
            PL_SLASH_SQL_OverViewTextView.setText(Html.fromHtml(getString(R.string.PL_SLASH_SQL_OverView),Html.FROM_HTML_MODE_LEGACY));
        }else{PL_SLASH_SQL_OverViewTextView.setText(Html.fromHtml(getString(R.string.PL_SLASH_SQL_OverView)));}
        PL_SLASH_SQL_OverViewTextView.setMovementMethod(LinkMovementMethod.getInstance());

    }
}