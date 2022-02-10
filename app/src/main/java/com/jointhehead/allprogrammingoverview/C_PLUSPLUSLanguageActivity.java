package com.jointhehead.allprogrammingoverview;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class C_PLUSPLUSLanguageActivity extends AppCompatActivity {
   TextView C_PLUSPLUSOverViewTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_pluspluslanguage);
        setTitle("C++ Language");

        C_PLUSPLUSOverViewTextView=(TextView)findViewById(R.id.C_PLUSPLUSOverViewTextView);
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.N){
            C_PLUSPLUSOverViewTextView.setText(Html.fromHtml(getString(R.string.C_PLUSPLUS_Overview),Html.FROM_HTML_MODE_LEGACY));
        }else{C_PLUSPLUSOverViewTextView.setText(Html.fromHtml(getString(R.string.C_PLUSPLUS_Overview)));}
        C_PLUSPLUSOverViewTextView.setMovementMethod(LinkMovementMethod.getInstance());

    }
}