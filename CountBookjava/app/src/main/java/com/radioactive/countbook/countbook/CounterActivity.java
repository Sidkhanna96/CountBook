package com.radioactive.countbook.countbook;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CounterActivity extends Activity {

    Button buttonSub;
    Button buttonAdd;
    //TextView textTitle;
    EditText scoreText;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        buttonSub = (Button)findViewById(R.id.button);
        buttonAdd = (Button)findViewById(R.id.button2);

        scoreText = (EditText)findViewById(R.id.editText);
        //textTitle = (TextView)findViewById(R.id.myTextTitle);

    }


}
