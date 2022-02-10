package com.jointhehead.allprogrammingoverview;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ScratchLanguageActivity extends AppCompatActivity {
 TextView scratchOverViewTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scratch_language);
        setTitle("Scratch Language");

        scratchOverViewTextView=(TextView)findViewById(R.id.scratchOverViewTextView);
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.N){
            scratchOverViewTextView.setText(Html.fromHtml(getString(R.string.scratchOverview),Html.FROM_HTML_MODE_LEGACY));
        }else{scratchOverViewTextView.setText(Html.fromHtml(getString(R.string.scratchOverview)));}
        scratchOverViewTextView.setMovementMethod(LinkMovementMethod.getInstance());

    }
}