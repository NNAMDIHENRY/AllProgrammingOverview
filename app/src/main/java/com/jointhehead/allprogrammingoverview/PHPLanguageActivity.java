package com.jointhehead.allprogrammingoverview;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PHPLanguageActivity extends AppCompatActivity {
    TextView PHPOverViewTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_php_language);
        setTitle("PHP Language");

        PHPOverViewTextView=(TextView)findViewById(R.id.PHPOverViewTextView);
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.N){
            PHPOverViewTextView.setText(Html.fromHtml(getString(R.string.PHPOverview),Html.FROM_HTML_MODE_LEGACY));
        }else{PHPOverViewTextView.setText(Html.fromHtml(getString(R.string.PHPOverview)));}
        PHPOverViewTextView.setMovementMethod(LinkMovementMethod.getInstance());

    }
}