package com.empowerustools.joelaptop.ittrdemo;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

//import com.empowerustools.rothvaluation.R;

public class Summary3 extends AppCompatActivity {
    TextView numeral;
    ImageView iv1;
    Button button;

    //Image image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary3);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        final SharedPreferences sharedPref = getSharedPreferences("ideaEval", Context.MODE_PRIVATE);

        int score1 = sharedPref.getInt("score1", 0 );
        int score2 = sharedPref.getInt("score2", 0 );
        int score3 = sharedPref.getInt("score3", 0 );
        int score4 = sharedPref.getInt("score4", 0 );
        int score5 = sharedPref.getInt("score5", 0 );
        int score6 = sharedPref.getInt("score6", 0 );
        int score7 = sharedPref.getInt("score7", 0 );
        int score8 = sharedPref.getInt("score8", 0 );
        int score9 = sharedPref.getInt("score9", 0 );
        int score10 = sharedPref.getInt("score10", 0 );


        int sum = score1 + score2 + score3+score4 + score5+ score6+score7+score8 +score9 +score10;
        // write sum to "total"
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("total", sum );
        editor.apply();

        int score = sharedPref.getInt("total", 0 );
        numeral =(TextView) findViewById(R.id.numeral);
        numeral.setText(String.valueOf(score));

        iv1 = (ImageView) findViewById(R.id.iv1);


        if (score == 0)
        {
            iv1.setImageResource(R.drawable.zero);
        } else if (score <= 5 && score > 0 )
        {
            iv1.setImageResource(R.drawable.per5);
        } else if (score <=10 && score > 5)
        {
            iv1.setImageResource(R.drawable.per10);
        } else if (score <=15 && score > 10)
        {
            iv1.setImageResource(R.drawable.per15);
        } else if (score <=20 && score > 15)
        {
            iv1.setImageResource(R.drawable.per20);
        } else if (score <=25 && score > 20)
        {
            iv1.setImageResource(R.drawable.per25);
        } else if (score <=30 && score > 25)
        {
            iv1.setImageResource(R.drawable.per30);
        } else if (score <=35 && score > 30)
        {
            iv1.setImageResource(R.drawable.per35);
        } else if (score <=40 && score > 35)
        {
            iv1.setImageResource(R.drawable.per40);
        } else if (score <=45 && score > 40)
        {
            iv1.setImageResource(R.drawable.per45);
        } else if (score <=50 && score > 45)
        {
            iv1.setImageResource(R.drawable.per50);
        } else if (score <=55 && score > 50)
        {
            iv1.setImageResource(R.drawable.per55);
        } else if (score <=60 && score > 55)
        {
            iv1.setImageResource(R.drawable.per60);
        } else if (score <=65 && score > 60)
        {
            iv1.setImageResource(R.drawable.per65);
        } else if (score <=70 && score > 65)
        {
            iv1.setImageResource(R.drawable.per70);
        } else if (score <=75 && score > 70)
        {
            iv1.setImageResource(R.drawable.per75);
        } else if (score <=80 && score > 75)
        {
            iv1.setImageResource(R.drawable.per80);
        } else if (score <=85 && score > 80)
        {
            iv1.setImageResource(R.drawable.per85);
        } else if (score <=90 && score > 85)
        {
            iv1.setImageResource(R.drawable.per90);
        } else if (score <=95 && score > 90)
        {
            iv1.setImageResource(R.drawable.per95);
        } else if (score <=100 && score > 95)
        {
            iv1.setImageResource(R.drawable.colordonut2);
        }


        button = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Summary3.this, MailCheck.class));

            }
        });
    }
}
