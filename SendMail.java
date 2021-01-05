package com.empowerustools.joelaptop.ittrdemo;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatImageButton;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

//import com.empowerustools.rothvaluation.R;

public class SendMail extends AppCompatActivity {

    String s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, total;
    String username, email;
    int code;
    ImageButton button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_mail);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        final SharedPreferences sharedPref = getSharedPreferences("ideaEval", Context.MODE_PRIVATE);
        String[] name = getResources().getStringArray(R.array.titles);
        String ans1 = sharedPref.getString("reply1", "");
        String ans2 = sharedPref.getString("reply2", "");
        String ans3 = sharedPref.getString("reply3", "");
        String ans4 = sharedPref.getString("reply4", "");
        String ans5 = sharedPref.getString("reply5", "");
        String ans6 = sharedPref.getString("reply6", "");
        String ans7 = sharedPref.getString("reply7", "");
        String ans8 = sharedPref.getString("reply8", "");
        String ans9 = sharedPref.getString("reply9", "");
        String ans10 = sharedPref.getString("reply10", "");

        int sum = sharedPref.getInt("total", 0 );

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


        s1 = String.valueOf(score1);
        s2 = String.valueOf(score2);
        s3 = String.valueOf(score3);
        s4 = String.valueOf(score4);
        s5 = String.valueOf(score5);
        s6 = String.valueOf(score6);
        s7 = String.valueOf(score7);
        s8 = String.valueOf(score8);
        s9 = String.valueOf(score9);
        s10 = String.valueOf(score10);

        username = sharedPref.getString("name", "");
        email = sharedPref.getString("email", "");
        code = sharedPref.getInt("code", 0);

        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("message/rfc822");
        i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"roth@ittrifecta.com"});
        i.putExtra(Intent.EXTRA_SUBJECT, "ROTH Idea Valuation Tool scores");
        i.putExtra(Intent.EXTRA_TEXT   ,
                username + "\n" + "Email: "+ email + "\n" + "Referral: "+ code + "\n" +
                "Overall Score: " + sum + "\n" +
                name[0] + "\n"+ ans1 + "\n" + "Score: " + s1 + "\n" +
                name[1] + "\n"+ ans2 + "\n" + "Score: " + s2 + "\n" +
                name[2] + "\n"+ ans3 + "\n" + "Score: " + s3 + "\n" +
                name[3] + "\n"+ ans4 + "\n" + "Score: " + s4 + "\n" +
                name[4] + "\n"+ ans5 + "\n" + "Score: " + s5 + "\n" +
                name[5] + "\n"+ ans6 + "\n" + "Score: " + s6 + "\n" +
                name[6] + "\n"+ ans7 + "\n" + "Score: " + s7 + "\n" +
                name[7] + "\n"+ ans8 + "\n" + "Score: " + s8 + "\n" +
                name[8] + "\n"+ ans9 + "\n" + "Score: " + s9 + "\n" +
                name[9] + "\n"+ ans10 + "\n" + "Score: " + s10 + "\n"
        );
        try {
            startActivity(Intent.createChooser(i, "Send mail..."));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(SendMail.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }

        // find compatible AppCompatImageButton - not a Button apparently.
        button = findViewById(R.id.pictureButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.businessmetamorphosis.com/roth");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

    }
}
