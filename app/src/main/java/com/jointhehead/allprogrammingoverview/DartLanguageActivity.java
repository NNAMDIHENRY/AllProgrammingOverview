package com.jointhehead.allprogrammingoverview;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DartLanguageActivity extends AppCompatActivity {
   TextView dartOverViewTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dart_language);
        setTitle("Dart Language");

        dartOverViewTextView=(TextView)findViewById(R.id.dartOverViewTextView);
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.N){
            dartOverViewTextView.setText(Html.fromHtml(getString(R.string.dartOverview),Html.FROM_HTML_MODE_LEGACY));
        }else{dartOverViewTextView.setText(Html.fromHtml(getString(R.string.javaOverView)));}
        dartOverViewTextView.setMovementMethod(LinkMovementMethod.getInstance());

    }
}