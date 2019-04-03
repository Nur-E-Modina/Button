package com.tj.button;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int count=0;
    private Button login;
    private Button logout;
    private TextView textView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login=(Button)findViewById(R.id.buttonId);
        textView=(TextView)findViewById(R.id.textViewId);
        logout=(Button)findViewById(R.id.buttonId2);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                textView.setText("Login is Clicked"+count+"Times");
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("tag","Bangladessh is our motherland");
                startActivity(intent);
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Logout is clicked");
            }
        });



    }
}
