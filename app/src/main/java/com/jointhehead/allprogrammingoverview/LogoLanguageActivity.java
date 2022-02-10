package com.jointhehead.allprogrammingoverview;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LogoLanguageActivity extends AppCompatActivity {
     TextView logoOverViewTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo_language);
        setTitle("Logo Language");

         logoOverViewTextView=(TextView)findViewById(R.id.logoOverViewTextView);
         if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.N){
             logoOverViewTextView.setText(Html.fromHtml(getString(R.string.logoOverview),Html.FROM_HTML_MODE_LEGACY));
         }else{logoOverViewTextView.setText(Html.fromHtml(getString(R.string.logoOverview)));}
         logoOverViewTextView.setMovementMethod(LinkMovementMethod.getInstance());

     }

}