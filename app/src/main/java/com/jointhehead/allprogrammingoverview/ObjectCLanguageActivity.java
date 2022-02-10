package com.jointhehead.allprogrammingoverview;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ObjectCLanguageActivity extends AppCompatActivity {
   TextView objectCOverViewTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_clanguage);
        setTitle("Object-C Language");

        objectCOverViewTextView=(TextView)findViewById(R.id.objectCOverViewTextView);
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.N){
            objectCOverViewTextView.setText(Html.fromHtml(getString(R.string.objectCOverview),Html.FROM_HTML_MODE_LEGACY));
        }else{objectCOverViewTextView.setText(Html.fromHtml(getString(R.string.objectCOverview)));}
        objectCOverViewTextView.setMovementMethod(LinkMovementMethod.getInstance());

    }
}