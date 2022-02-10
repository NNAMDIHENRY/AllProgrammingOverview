package com.jointhehead.allprogrammingoverview;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RustLanguageActivity extends AppCompatActivity {
  TextView rustOverViewTextView;

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_language);
        setTitle("Rust Language");

         rustOverViewTextView=(TextView)findViewById(R.id.rustOverViewTextView);
         if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.N){
             rustOverViewTextView.setText(Html.fromHtml(getString(R.string.rustOverview),Html.FROM_HTML_MODE_LEGACY));
         }else{rustOverViewTextView.setText(Html.fromHtml(getString(R.string.rustOverview)));}
         rustOverViewTextView.setMovementMethod(LinkMovementMethod.getInstance());

     }
}