package com.jointhehead.allprogrammingoverview;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RubyLanguageActivity extends AppCompatActivity {
   TextView rubyOverViewTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruby_language);
        setTitle("Ruby Language");

        rubyOverViewTextView=(TextView)findViewById(R.id.rubyOverViewTextView);
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.N){
            rubyOverViewTextView.setText(Html.fromHtml(getString(R.string.rubyOverview),Html.FROM_HTML_MODE_LEGACY));
        }else{rubyOverViewTextView.setText(Html.fromHtml(getString(R.string.rubyOverview)));}
        rubyOverViewTextView.setMovementMethod(LinkMovementMethod.getInstance());

    }
}