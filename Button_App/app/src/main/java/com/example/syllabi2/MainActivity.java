package com.example.syllabi2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText t;
    ImageButton btn;
    ImageButton btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = (EditText) findViewById(R.id.editTextTextMultiLine);
        btn = (ImageButton) findViewById(R.id.add);
        btn2 = (ImageButton) findViewById(R.id.minus);
        btn.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                String str = String.valueOf(t.getText());
                int num =Integer.parseInt(str);
                num = num+1;
                String s = String.valueOf(num);
                t.setText(s);
                Toast msg = Toast.makeText(getBaseContext(),s,Toast.LENGTH_LONG);
                msg.show();
            }
        });
        btn2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                String str = String.valueOf(t.getText());
                int num =Integer.parseInt(str);
                num = num-1;
                String s = String.valueOf(num);
                t.setText(s);
                Toast msg = Toast.makeText(getBaseContext(),s,Toast.LENGTH_LONG);
                msg.show();
            }
        });
    }
}