package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button button;
    private Button buttonins;
    private Button button4;
    private Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener()
    {
            @Override
            public void onClick(View v) {
                gotoactivity2();
            }
        });

        buttonins=findViewById(R.id.buttonins);
        buttonins.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                gotoactivity5();
            }
        });

        button4=findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                    Intent intent= new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel: 92009378"));
                    startActivity(intent);
            }
        });
        button3=findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
              onRadioButtonClicked();
            }
        });
    }
    public void gotoactivity2(){
        Intent intent =new Intent(this,Activity2.class);
        startActivity(intent);
    }

    public void gotoactivity5(){
        Intent intent =new Intent(this,Activity5.class);
        startActivity(intent);
    }
    public void onRadioButtonClicked() {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
        startActivity(intent);
    }
}