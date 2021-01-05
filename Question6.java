package com.empowerustools.joelaptop.ittrdemo;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

//import com.empowerustools.rothvaluation.R;

//import static com.empowerustools.joelaptop.ittrdemo.R.*;

public class Question6 extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;
    Button button;

    TextView name1;
    TextView question;
    TextView score_1;

    ImageView scoreView;
    int radioId = 0;
    Drawable icon0, icon20, icon60, icon80, icon100;


    private static final int RB1_ID = 0;
    private static final int RB2_ID = 1;
    private static final int RB3_ID = 2;
    private static final int RB4_ID = 3;
    private static final int RB5_ID = 4;

    final int[] score = {0,2,6,8,10};

    //String[] name = getResources().getStringArray(R.array.titles);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // change index on each page
        int index = 5;
        String[] name = getResources().getStringArray(R.array.titles);
        String[] desc = getResources().getStringArray(R.array.quest);

        // change choice on each page
        final String[] choice = getResources().getStringArray(R.array.q6ans);
        setContentView(R.layout.activity_main);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        name1 = (TextView) findViewById(R.id.name1);
        name1.setText(name[index]);

        question=(TextView) findViewById(R.id.description);
        question.setText(desc[index]);

        radioGroup = findViewById(R.id.radioGroup);

        //final SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences sharedPref = getSharedPreferences("ideaEval", Context.MODE_PRIVATE);

        RadioButton radio1=(RadioButton) findViewById(R.id.radio_one);
        RadioButton radio2=(RadioButton) findViewById(R.id.radio_two);
        RadioButton radio3=(RadioButton) findViewById(R.id.radio_three);
        RadioButton radio4=(RadioButton) findViewById(R.id.radio_four);
        RadioButton radio5=(RadioButton) findViewById(R.id.radio_five);

        radioGroup.clearCheck();

        radio1.setId(RB1_ID);
        radio2.setId(RB2_ID);
        radio3.setId(RB3_ID);
        radio4.setId(RB4_ID);
        radio5.setId(RB5_ID);

        radio1.setText(choice[0]);
        radio2.setText(choice[1]);
        radio3.setText(choice[2]);
        radio4.setText(choice[3]);
        radio5.setText(choice[4]);

        //set image view
        //final ImageView i = (ImageView) findViewById(R.id.scoreView);


        //radioButton radioButton1 =
        button = findViewById(R.id.btnNext);

        button.setEnabled(false);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int radioId = radioGroup.getCheckedRadioButtonId();



                radioButton = findViewById(radioId);
                SharedPreferences.Editor editor = sharedPref.edit();

                // update for each page
                editor.putString("reply6", (String)radioButton.getText() );
                editor.putInt("score6", score[radioId]);
                editor.apply();




                startActivity(new Intent(Question6.this, Question7.class));

            }
        });
    }
    public void checkButton(View v) {
        radioId = radioGroup.getCheckedRadioButtonId();

        radioButton = findViewById(radioId);
        score_1=(TextView) findViewById(R.id.score_1);

        if(radioId == 0){
            score_1.setText("Score 0");
            score_1.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.icon0,0,0,0);
        }
        else if(radioId == 1){
            score_1.setText("Score 2");
            score_1.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.icon20,0,0,0);

        }else if(radioId == 2){
            score_1.setText("Score 6");
            score_1.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.icon60,0,0,0);
        }else if(radioId == 3){
            score_1.setText("Score 8");
            score_1.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.icon80,0,0,0);
        }else if(radioId == 4){
            score_1.setText("Score 10");
            score_1.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.icon100,0,0,0);
        }

        button.setEnabled(true);

//        Toast.makeText(this, "Selected Radio Button: " + radioButton.getText(),
//                Toast.LENGTH_SHORT).show();
    }
}