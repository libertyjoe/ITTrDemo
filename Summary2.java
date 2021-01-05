package com.empowerustools.joelaptop.ittrdemo;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//import com.empowerustools.rothvaluation.R;

public class Summary2 extends AppCompatActivity {
    TextView ans_one, ans_two, ans_3, ans_4, ans_5, ans_6, ans_7, ans_8, ans_9, ans_10  ;

    TextView title_one, title_two;

    TextView title_3;

    TextView title_4;
    TextView title_5;

    TextView title_6;

    TextView title_7;

    TextView title_8;

    TextView title_9;

    TextView title_10;

    TextView total;

    TextView sc1, sc2, sc3, sc4, sc5, sc6, sc7, sc8, sc9, sc10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary2);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        final SharedPreferences sharedPref = getSharedPreferences("ideaEval", Context.MODE_PRIVATE);

        //sharedPref = getSharedPreferences("ideaEval", Context.MODE_PRIVATE);
        String[] name = getResources().getStringArray(R.array.titles);
        title_one = (TextView)findViewById(R.id.title_one);
        title_one.setText(name[0]);
        String ans1 = sharedPref.getString("reply1", "");
        ans_one = (TextView)findViewById(R.id.ans_one);
        ans_one.setText(ans1);
        int score1 = sharedPref.getInt("score1", 0 );
        sc1 = (TextView)findViewById(R.id.sc1);
        sc1.setText("Score: "+ String.valueOf(score1));

        //update for each page
        title_two = (TextView)findViewById(R.id.title_two);
        title_two.setText(name[1]);
        String ans2 = sharedPref.getString("reply2", "");
        ans_two = (TextView)findViewById(R.id.ans_two);
        ans_two.setText(ans2);
        int score2 = sharedPref.getInt("score2", 0 );
        sc2 = (TextView)findViewById(R.id.sc2);
        sc2.setText("Score: "+ String.valueOf(score2));

        //update for each page
        title_3 = (TextView)findViewById(R.id.title_3);
        title_3.setText(name[2]);
        String ans3 = sharedPref.getString("reply3", "");
        ans_3 = (TextView)findViewById(R.id.ans_3);
        ans_3.setText(ans3);
        int score3 = sharedPref.getInt("score3", 0 );
        sc3 = (TextView)findViewById(R.id.sc3);
        sc3.setText("Score: "+ String.valueOf(score3));

        //update for each page
        title_4 = (TextView)findViewById(R.id.title_4);
        title_4.setText(name[3]);
        String ans4 = sharedPref.getString("reply4", "");
        ans_4 = (TextView)findViewById(R.id.ans_4);
        ans_4.setText(ans4);
        int score4 = sharedPref.getInt("score4", 0 );
        sc4 = (TextView)findViewById(R.id.sc4);
        sc4.setText("Score: "+ String.valueOf(score4));

        //update for each page
        title_5 = (TextView)findViewById(R.id.title_5);
        title_5.setText(name[4]);
        String ans5 = sharedPref.getString("reply5", "");
        ans_5 = (TextView)findViewById(R.id.ans_5);
        ans_5.setText(ans5);
        int score5 = sharedPref.getInt("score5", 0 );
        sc5 = (TextView)findViewById(R.id.sc5);
        sc5.setText("Score: "+ String.valueOf(score5));

        title_6 = (TextView)findViewById(R.id.title_6);
        title_6.setText(name[5]);
        String ans6 = sharedPref.getString("reply6", "");
        ans_6 = (TextView)findViewById(R.id.ans_6);
        ans_6.setText(ans6);
        int score6 = sharedPref.getInt("score6", 0 );
        sc6 = (TextView)findViewById(R.id.sc6);
        sc6.setText("Score: "+ String.valueOf(score6));

        //update for each page
        title_7 = (TextView)findViewById(R.id.title_7);
        title_7.setText(name[6]);
        String ans7 = sharedPref.getString("reply7", "");
        ans_7 = (TextView)findViewById(R.id.ans_7);
        ans_7.setText(ans7);
        int score7 = sharedPref.getInt("score7", 0 );
        sc7 = (TextView)findViewById(R.id.sc7);
        sc7.setText("Score: "+ String.valueOf(score7));

        //update for each page
        title_8 = (TextView)findViewById(R.id.title_8);
        title_8.setText(name[7]);
        String ans8 = sharedPref.getString("reply8", "");
        ans_8 = (TextView)findViewById(R.id.ans_8);
        ans_8.setText(ans8);
        int score8 = sharedPref.getInt("score8", 0 );
        sc8 = (TextView)findViewById(R.id.sc8);
        sc8.setText("Score: "+ String.valueOf(score8));

        //update for each page
        title_9 = (TextView)findViewById(R.id.title_9);
        title_9.setText(name[8]);
        String ans9 = sharedPref.getString("reply9", "");
        ans_9 = (TextView)findViewById(R.id.ans_9);
        ans_9.setText(ans9);
        int score9 = sharedPref.getInt("score9", 0 );
        sc9 = (TextView)findViewById(R.id.sc9);
        sc9.setText("Score: "+ String.valueOf(score9));

        //update for each page
        title_10 = (TextView)findViewById(R.id.title_10);
        title_10.setText(name[9]);
        String ans10 = sharedPref.getString("reply10", "");
        ans_10 = (TextView)findViewById(R.id.ans_10);
        ans_10.setText(ans10);
        int score10 = sharedPref.getInt("score10", 0 );
        sc10 = (TextView)findViewById(R.id.sc10);
        sc10.setText("Score: "+ String.valueOf(score10));

        total = (TextView)findViewById(R.id.total);
        int sum = score1 + score2 + score3+score4 + score5+ score6+score7+score8 +score9 +score10;
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("total", sum );
        editor.apply();
        total.setText("Total Score:"+ String.valueOf(sum));

        Button button = findViewById(R.id.btnNext);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Summary2.this, Summary3.class));

            }
        });



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}
