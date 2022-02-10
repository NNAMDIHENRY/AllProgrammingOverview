package com.jointhehead.allprogrammingoverview;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class C_HASHLanguageActivity extends AppCompatActivity {
    TextView C_HASHOverViewTextView;

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_hash_language);
        setTitle("C# Language");

         C_HASHOverViewTextView=(TextView)findViewById(R.id.C_HASHOverViewTextView);
         if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.N){
             C_HASHOverViewTextView.setText(Html.fromHtml(getString(R.string.C_HASHOverview),Html.FROM_HTML_MODE_LEGACY));
         }else{C_HASHOverViewTextView.setText(Html.fromHtml(getString(R.string.C_HASHOverview)));}
         C_HASHOverViewTextView.setMovementMethod(LinkMovementMethod.getInstance());

     }

}