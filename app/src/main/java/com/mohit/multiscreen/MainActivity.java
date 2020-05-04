package com.mohit.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String MSG="com.mohit.multiscreen.ORDER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public  void placeOrder(View view){
        //we will handle the click on button here
        //Build an intent to another activity

        Intent intent = new Intent(this, orderActivity.class);
        EditText edittext1 = findViewById(R.id.editText);
        EditText edittext2 = findViewById(R.id.editText2);
        EditText edittext3 = findViewById(R.id.editText3);
        String message="Your Order for "+edittext1.getText().toString() +
                ","+edittext2.getText().toString()+","+edittext3.getText().toString()+" has been place";
        intent.putExtra(MSG,message); //key-value pair send MSG with value message to other activity
        startActivity(intent);


    }
}

