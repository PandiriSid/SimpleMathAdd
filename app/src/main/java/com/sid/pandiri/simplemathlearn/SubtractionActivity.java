package com.sid.pandiri.simplemathlearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SubtractionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subtraction);
        Toast toast = Toast.makeText(getApplicationContext(),
                "Congratulations You made into the next level  " +
                        "Welcome to the Subtraction learning  ",
                Toast.LENGTH_SHORT);

        toast.show();
    }

    public void goToAnActivity(View view) {
        Intent intent = new Intent(this, GuiActivity.class);
        startActivity(intent);
    }

    public void goToAnotherActivity(View view) {
        Intent intent = new Intent(this, Addition.class);
        startActivity(intent);
    }

    public void goToNextActivity(View view) {
        Intent intent = new Intent(this, Addition.class);
        startActivity(intent);
    }
}