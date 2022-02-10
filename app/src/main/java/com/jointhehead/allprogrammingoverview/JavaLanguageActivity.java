package com.jointhehead.allprogrammingoverview;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class JavaLanguageActivity extends AppCompatActivity {
TextView javaOverViewTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_language);
        setTitle("Java Language");
         javaOverViewTextView=(TextView)findViewById(R.id.javaOverViewTextView);
                if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.N){
                    javaOverViewTextView.setText(Html.fromHtml(getString(R.string.javaOverView),Html.FROM_HTML_MODE_LEGACY));
                   }else{javaOverViewTextView.setText(Html.fromHtml(getString(R.string.javaOverView)));}
        javaOverViewTextView.setMovementMethod(LinkMovementMethod.getInstance());
        /*
        Spanned spanned= HtmlCompat.fromHtml(getString(R.string.javaOverView),HtmlCompat.FROM_HTML_MODE_COMPACT);
        javaOverViewTextView.setText(spanned);
*/


    }

}