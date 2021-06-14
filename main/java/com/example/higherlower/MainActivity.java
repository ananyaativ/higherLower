package com.example.higherlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random rand=new Random();
    int low=1;
    int high=21;
    int num=rand.nextInt(high-low)+low;
    public void guess(View view){

        EditText number=(EditText)findViewById(R.id.numberEditText);

        int input=Integer.parseInt(number.getText().toString());
        if(input<num){
            Toast.makeText(this, "Higher!", Toast.LENGTH_SHORT).show();
        }
        else if(input>num){
            Toast.makeText(this, "Lower!", Toast.LENGTH_SHORT).show();
        }
        else if(input==num) {
            Toast.makeText(this, "You got it!Try again", Toast.LENGTH_SHORT).show();
            num = rand.nextInt(high - low) + low;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}