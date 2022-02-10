package com.jointhehead.allprogrammingoverview;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ApacheGroovyLanguageActivity extends AppCompatActivity {
   TextView apacheGroovyOverViewTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apache_groovy_language);
        setTitle("Apache Groovy Language");

        apacheGroovyOverViewTextView=(TextView)findViewById(R.id.apacheGroovyOverViewTextView);
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.N){
            apacheGroovyOverViewTextView.setText(Html.fromHtml(getString(R.string.apacheGroovyOverview),Html.FROM_HTML_MODE_LEGACY));
        }else{apacheGroovyOverViewTextView.setText(Html.fromHtml(getString(R.string.apacheGroovyOverview)));}
        apacheGroovyOverViewTextView.setMovementMethod(LinkMovementMethod.getInstance());

    }

}