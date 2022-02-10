package com.jointhehead.allprogrammingoverview;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class VB_DOT_NETLanguageActivity extends AppCompatActivity {
    TextView VB_DOT_NETOverViewTextView;

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vb_dot_netlanguage);
        setTitle("VB.NET Language");

         VB_DOT_NETOverViewTextView=(TextView)findViewById(R.id.VB_DOT_NETOverViewTextView);
         if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.N){
             VB_DOT_NETOverViewTextView.setText(Html.fromHtml(getString(R.string.VB_DOT_NETOverview),Html.FROM_HTML_MODE_LEGACY));
         }else{VB_DOT_NETOverViewTextView.setText(Html.fromHtml(getString(R.string.VB_DOT_NETOverview)));}
         VB_DOT_NETOverViewTextView.setMovementMethod(LinkMovementMethod.getInstance());

     }
}