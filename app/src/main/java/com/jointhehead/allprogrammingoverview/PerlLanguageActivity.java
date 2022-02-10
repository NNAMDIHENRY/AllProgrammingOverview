package com.jointhehead.allprogrammingoverview;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PerlLanguageActivity extends AppCompatActivity {
  TextView perlOverViewTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perl_language);
        setTitle("Perl Language");

        perlOverViewTextView=(TextView)findViewById(R.id.perlOverViewTextView);
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.N){
            perlOverViewTextView.setText(Html.fromHtml(getString(R.string.perlOverview),Html.FROM_HTML_MODE_LEGACY));
        }else{perlOverViewTextView.setText(Html.fromHtml(getString(R.string.perlOverview)));}
        perlOverViewTextView.setMovementMethod(LinkMovementMethod.getInstance());

    }
}