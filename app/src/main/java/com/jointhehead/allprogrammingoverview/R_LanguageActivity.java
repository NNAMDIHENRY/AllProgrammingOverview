package com.jointhehead.allprogrammingoverview;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class R_LanguageActivity extends AppCompatActivity {

    TextView ROverViewTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r_language);
        setTitle("R Language");

        ROverViewTextView=(TextView)findViewById(R.id.R_OverViewTextView);
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.N){
            ROverViewTextView.setText(Html.fromHtml(getString(R.string.ROverview),Html.FROM_HTML_MODE_LEGACY));
        }else{ROverViewTextView.setText(Html.fromHtml(getString(R.string.ROverview)));}
        ROverViewTextView.setMovementMethod(LinkMovementMethod.getInstance());

    }
}