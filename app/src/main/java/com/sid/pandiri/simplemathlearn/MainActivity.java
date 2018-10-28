package com.sid.pandiri.simplemathlearn;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void goToAnActivity(View view) {
        Intent intent = new Intent(this, AdditionActivity.class);
        startActivity(intent);
    }

    public void goToAnotherActivity(View view) {
        SharedPreferences mPreferences =  getSharedPreferences("MyPREFERENCES", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = mPreferences.edit();

        int  name1 = mPreferences.getInt("Name",0);
        if(name1>3){
            Intent intent = new Intent(this, AdditionActivity.class);
            startActivity(intent);

        }
        editor.apply();
    }

    public void goToAnotherActivity1(View view) {
        Intent intent = new Intent(this, AdditionActivity.class);
        startActivity(intent);
    }

    public void goToAnotherActivity2(View view) {
        Intent intent = new Intent(this, AdditionActivity.class);
        startActivity(intent);
    }
}
