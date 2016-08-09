package com.example.chingtou.simpleui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   TextView textView;
   EditText editText;
   RadioGroup radioGroup;

   String drink="Black Tea";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=(TextView)findViewById(R.id.textView)
        editText=(EditText)findViewBtId(R.id.textView)
        radioGroup=(RadioGroup)findViewById(R.id.radioGroup)
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId=R.id.blackTeaRadioButtom)
                {
                    drink="Black Tea";
                }
                else if(checkedId=R.id.greenTeaRadioButtom)
                {
                    drink="Green Tea";
                }
            }
        });
    }

    public void click(View view)
    {
       String text=editText.getText().toString();
       text=text+" Order: "+drink;
       textView.setText("text")
    }
}
