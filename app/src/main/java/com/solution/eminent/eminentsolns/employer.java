package com.solution.eminent.eminentsolns;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class employer extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employer);
        Button signin=(Button)findViewById(R.id.signin);
        signin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.signin:
                Intent i=new Intent(this,employerHome.class);
                startActivity(i);
                break;
        }
    }
}
