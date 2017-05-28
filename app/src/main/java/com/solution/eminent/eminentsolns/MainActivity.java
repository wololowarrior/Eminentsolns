package com.solution.eminent.eminentsolns;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button employeeButton=(Button)findViewById(R.id.employeeButton);
        Button employerButton=(Button)findViewById(R.id.employerButton);
        Button createAcButton=(Button)findViewById(R.id.createAcButton);
        employerButton.setOnClickListener(this);
        employeeButton.setOnClickListener(this);
        createAcButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.employeeButton:
                Intent intent=new Intent(this, employee.class);
                startActivity(intent);
                break;
            case R.id.employerButton:
                Intent intent1=new Intent(this,employer.class);
                startActivity(intent1);
                break;
            case R.id.createAcButton:
                Intent intent2=new Intent(this,createAc.class);
                startActivity(intent2);
                break;
        }
    }
}
