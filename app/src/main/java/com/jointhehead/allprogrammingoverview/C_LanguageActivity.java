package com.jointhehead.allprogrammingoverview;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class C_LanguageActivity extends AppCompatActivity {
    TextView cTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_language);
        setTitle("C Language");

        cTextView=(TextView) findViewById(R.id.cTextView);
       if(android.os.Build.VERSION.SDK_INT>= Build.VERSION_CODES.N){
           cTextView.setText(Html.fromHtml(getString(R.string.cOverview), Html.FROM_HTML_MODE_LEGACY));
       }else{cTextView.setText(Html.fromHtml(getString(R.string.cOverview) ));}
    cTextView.setMovementMethod(LinkMovementMethod.getInstance());

    }


}