package com.jointhehead.allprogrammingoverview;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SAS_LanguageActivity extends AppCompatActivity {
   TextView SASOverViewTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sas_language);
        setTitle("SAS Language");

        SASOverViewTextView=(TextView)findViewById(R.id.SASOverViewTextView);
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.N){
            SASOverViewTextView.setText(Html.fromHtml(getString(R.string.SASOverview),Html.FROM_HTML_MODE_LEGACY));
        }else{SASOverViewTextView.setText(Html.fromHtml(getString(R.string.SASOverview)));}
        SASOverViewTextView.setMovementMethod(LinkMovementMethod.getInstance());

    }
}