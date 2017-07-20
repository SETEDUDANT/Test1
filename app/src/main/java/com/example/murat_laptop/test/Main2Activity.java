package com.example.murat_laptop.test;

import android.graphics.Color;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.widget.AbsoluteLayout;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    private String[] arraySpinner;
    private Button b20;
    private Button b2130;
    private Button b3140;
    private Button b4150;
    private Button b5160;
    private Button b6170;
    private EditText roomNumber;
    private EditText nickName;
    private EditText eMail;
    private TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b20 = (Button) findViewById(R.id.bt20);
        b2130 = (Button) findViewById(R.id.bt2130);
        b3140 = (Button) findViewById(R.id.bt3140);
        b4150 = (Button) findViewById(R.id.bt4150);
        b5160 = (Button) findViewById(R.id.bt5160);
        b6170 = (Button) findViewById(R.id.bt6170);
        roomNumber = (EditText) findViewById(R.id.eTroomNumber);
        nickName = (EditText) findViewById(R.id.eTname);
        eMail = (EditText) findViewById(R.id.eTeMail);
        tv = (TextView) findViewById(R.id.textView);

        this.arraySpinner = new String[] {
                "ENGLISH", "DUTCH", "FRENCH", "TURKISH"
        };
        Spinner s = (Spinner) findViewById(R.id.spinner4);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        s.setAdapter(adapter);


        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;

        roomNumber.setX((width / 100 * 5) );

        roomNumber.getLayoutParams().width= width / 100 * 90;
        roomNumber.getLayoutParams().height=height;


    }
}
