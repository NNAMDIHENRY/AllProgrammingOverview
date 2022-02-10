package com.jointhehead.allprogrammingoverview;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class D_LanguageActivity extends AppCompatActivity {
   TextView D_OverViewTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d_language);
        setTitle("D Language");

        D_OverViewTextView=(TextView)findViewById(R.id.D_OverViewTextView);
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.N){
            D_OverViewTextView.setText(Html.fromHtml(getString(R.string.DOverview),Html.FROM_HTML_MODE_LEGACY));
        }else{D_OverViewTextView.setText(Html.fromHtml(getString(R.string.DOverview)));}
        D_OverViewTextView.setMovementMethod(LinkMovementMethod.getInstance());

    }

}