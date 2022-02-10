package com.jointhehead.allprogrammingoverview;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class JavaScriptLanguageActivity extends AppCompatActivity {

     TextView javaScriptOverViewTextView;
      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_script_language);
        setTitle("JavaScript Language");

          javaScriptOverViewTextView=(TextView)findViewById(R.id.javaScriptOverViewTextView);
          if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.N){
              javaScriptOverViewTextView.setText(Html.fromHtml(getString(R.string.javaScriptOverview),Html.FROM_HTML_MODE_LEGACY));
          }else{javaScriptOverViewTextView.setText(Html.fromHtml(getString(R.string.javaScriptOverview)));}
          javaScriptOverViewTextView.setMovementMethod(LinkMovementMethod.getInstance());

      }


}