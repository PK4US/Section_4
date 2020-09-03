package com.MyApp_8;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static android.widget.RelativeLayout.CENTER_HORIZONTAL;
import static android.widget.RelativeLayout.CENTER_IN_PARENT;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout layout = new RelativeLayout(this);


        TextView tv1 = new TextView(this);
        tv1.setText("Регистрация");
        RelativeLayout.LayoutParams param1 = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        param1.addRule(CENTER_HORIZONTAL);
        tv1.setTextSize(35);
        layout.addView(tv1,param1);


        EditText et1 = new EditText(this);
        et1.setText("Имя");
        RelativeLayout.LayoutParams param2 = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        param2.addRule(CENTER_HORIZONTAL);
        param2.topMargin = 100;
        et1.setTextSize(35);
        layout.addView(et1,param2);


        EditText et2 = new EditText(this);
        et2.setText ("Фамилия");
        RelativeLayout.LayoutParams param3 = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        param3.addRule(CENTER_HORIZONTAL);
        et2.setTextSize(35);
        param3.topMargin = 300;
        layout.addView(et2,param3);


        Button b1 = new Button(this);
        b1.setText("Зарегестрироватся");
        RelativeLayout.LayoutParams param4 = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        param4.addRule(CENTER_IN_PARENT);
        layout.addView(b1,param4);



        setContentView(layout);
    }
}
