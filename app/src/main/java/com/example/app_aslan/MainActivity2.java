package com.example.app_aslan;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {
private ImageButton button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button=(ImageButton) findViewById(R.id.root_3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity();
            }
        });
    }

    public void openActivity(){
        Intent intent=new Intent(this, MainActivity3.class);
        startActivity(intent);
    }


    public void startNewActivity(View v){
        Intent intent=new Intent(this,MainActivity4.class);

        startActivity(intent);
    }





}
