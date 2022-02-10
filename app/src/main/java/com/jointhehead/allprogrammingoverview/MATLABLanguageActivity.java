package com.jointhehead.allprogrammingoverview;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MATLABLanguageActivity extends AppCompatActivity {
    TextView MATLABOverViewTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matlab_language);
        setTitle("MATLAB Language");

         MATLABOverViewTextView=(TextView)findViewById(R.id.MATLABOverViewTextView);
         if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.N){
             MATLABOverViewTextView.setText(Html.fromHtml(getString(R.string.MATLABOverview),Html.FROM_HTML_MODE_LEGACY));
         }else{MATLABOverViewTextView.setText(Html.fromHtml(getString(R.string.MATLABOverview)));}
         MATLABOverViewTextView.setMovementMethod(LinkMovementMethod.getInstance());

     }

}