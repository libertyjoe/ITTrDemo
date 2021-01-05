package com.empowerustools.joelaptop.ittrdemo;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

//import com.empowerustools.rothvaluation.R;

import org.w3c.dom.Text;

public class SummaryPage1 extends AppCompatActivity {

    //final SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);

    //SharedPreferences sharedPref = getSharedPreferences("ideaEval", Context.MODE_PRIVATE);
    TextView ans_one;
    TextView title_one;
    TextView ans_two;
    TextView title_two;
    TextView ans_3;
    TextView title_3;
    TextView ans_4;
    TextView title_4;
    TextView ans_5;
    TextView title_5;
    TextView ans_6;
    TextView title_6;
    TextView ans_7;
    TextView title_7;
    TextView ans_8;
    TextView title_8;
    TextView ans_9;
    TextView title_9;
    TextView ans_10;
    TextView title_10;

    TextView sc1, sc2, sc3, sc4, sc5, sc6, sc7, sc8, sc9, sc10;
    //SharedPreferences sharedPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary_page1);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        final SharedPreferences sharedPref = getSharedPreferences("ideaEval", Context.MODE_PRIVATE);

        //sharedPref = getSharedPreferences("ideaEval", Context.MODE_PRIVATE);
        String[] name = getResources().getStringArray(R.array.titles);
        title_one = (TextView)findViewById(R.id.title_one);
        title_one.setText(name[0]);
        String ans1 = sharedPref.getString("reply1", "");
        ans_one = (TextView)findViewById(R.id.ans_one);
        ans_one.setText(ans1);
        int score1 = sharedPref.getInt("score1", Integer.parseInt(""));
        sc1 = (TextView)findViewById(R.id.sc1);
        sc1.setText(score1);

        //update for each page
        title_two = (TextView)findViewById(R.id.title_two);
        title_two.setText(name[1]);
        String ans2 = sharedPref.getString("reply2", "");
        ans_two = (TextView)findViewById(R.id.ans_two);
        ans_two.setText(ans2);

        //update for each page
        title_3 = (TextView)findViewById(R.id.title_3);
        title_3.setText(name[2]);
        String ans3 = sharedPref.getString("reply3", "");
        ans_3 = (TextView)findViewById(R.id.ans_3);
        ans_3.setText(ans3);
    }
}
