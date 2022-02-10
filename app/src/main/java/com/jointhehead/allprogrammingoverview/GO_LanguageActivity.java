package com.jointhehead.allprogrammingoverview;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GO_LanguageActivity extends AppCompatActivity {
   TextView GOOverViewTextView;

      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_language);
        setTitle("GO Language");

          GOOverViewTextView=(TextView)findViewById(R.id.GOOverViewTextView);
          if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.N){
              GOOverViewTextView.setText(Html.fromHtml(getString(R.string.GOOverview),Html.FROM_HTML_MODE_LEGACY));
          }else{GOOverViewTextView.setText(Html.fromHtml(getString(R.string.GOOverview)));}
          GOOverViewTextView.setMovementMethod(LinkMovementMethod.getInstance());

      }

}