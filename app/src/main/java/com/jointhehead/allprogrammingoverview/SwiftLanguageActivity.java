package com.jointhehead.allprogrammingoverview;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SwiftLanguageActivity extends AppCompatActivity {
  TextView swiftOverViewTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swift_language);
        setTitle("Swift Language");

        swiftOverViewTextView=(TextView)findViewById(R.id.swiftOverViewTextView);
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.N){
            swiftOverViewTextView.setText(Html.fromHtml(getString(R.string.swiftOverview),Html.FROM_HTML_MODE_LEGACY));
        }else{swiftOverViewTextView.setText(Html.fromHtml(getString(R.string.swiftOverview)));}
        swiftOverViewTextView.setMovementMethod(LinkMovementMethod.getInstance());

    }
}