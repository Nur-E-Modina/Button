package com.tj.button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
private TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textView2=findViewById(R.id.textViewId3);
        Bundle bundle=getIntent().getExtras();
        if(bundle!=null) {
        String value=bundle.getString("button");
        textView2.setText(value);
        }
    }
}
