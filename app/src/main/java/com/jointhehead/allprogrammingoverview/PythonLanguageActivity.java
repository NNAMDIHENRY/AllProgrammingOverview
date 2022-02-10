package com.jointhehead.allprogrammingoverview;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class PythonLanguageActivity extends AppCompatActivity {
   TextView pythonTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_language);
        setTitle("Python Language");

        pythonTextView=(TextView) findViewById(R.id.pythonTextView);

        if(android.os.Build.VERSION.SDK_INT>= Build.VERSION_CODES.N){
            pythonTextView.setText(Html.fromHtml(getString(R.string.pythonOverview), Html.FROM_HTML_MODE_LEGACY));
        }else{pythonTextView.setText(Html.fromHtml(getString(R.string.pythonOverview)));}
            pythonTextView.setMovementMethod(LinkMovementMethod.getInstance());
        }
}