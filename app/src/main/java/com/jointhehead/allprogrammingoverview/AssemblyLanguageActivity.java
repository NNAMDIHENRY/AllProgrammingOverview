package com.jointhehead.allprogrammingoverview;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AssemblyLanguageActivity extends AppCompatActivity {
  TextView assemblyLanguageOverViewTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assembly_language);
        setTitle("Assembly Language");

        assemblyLanguageOverViewTextView=(TextView)findViewById(R.id.assemblyLanguageOverViewTextView);
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.N){
            assemblyLanguageOverViewTextView.setText(Html.fromHtml(getString(R.string.assemblyLanguageOverview),Html.FROM_HTML_MODE_LEGACY));
        }else{assemblyLanguageOverViewTextView.setText(Html.fromHtml(getString(R.string.assemblyLanguageOverview)));}
        assemblyLanguageOverViewTextView.setMovementMethod(LinkMovementMethod.getInstance());

    }

}