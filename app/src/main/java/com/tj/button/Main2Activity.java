package com.tj.button;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
private TextView textView;
private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView=(TextView)findViewById(R.id.textViewId2);
        button=(Button)findViewById(R.id.buttonId3);
        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){

           String value= bundle.getString("tag");
           textView.setText(value);

        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(Main2Activity.this,Main3Activity.class);
                intent2.putExtra("button","hello world");
                startActivity(intent2);
            }
        });

    }
}
