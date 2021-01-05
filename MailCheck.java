package com.empowerustools.joelaptop.ittrdemo;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

//import com.empowerustools.rothvaluation.R;

public class MailCheck extends AppCompatActivity {

    Button button, btn;
    EditText name, email, code;
    boolean n1 = false, e1 = false;

    public void showAlert(View view){
        // setup the alert builder
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Privacy Policy");
        builder.setMessage(" Intelligent Technology Trifecta Corp. built the ROTH Idea Valuation Tool app as a Commercial app. This SERVICE is provided by Intelligent Technology Trifecta Corp. and is intended for use as is.\n" +
                "\n" +
                "This page is used to inform visitors regarding our policies with the collection, use, and disclosure of Personal Information if anyone decided to use our Service.\n" +
                "\n" +
                "If you choose to use our Service, then you agree to the collection and use of information in relation to this policy. The Personal Information that we collect is used for providing and improving the Service. We will not use or share your information with anyone except as described in this Privacy Policy.\n" +
                "\n" +
                "The terms used in this Privacy Policy have the same meanings as in our Terms and Conditions, which is accessible at ROTH Idea Valuation Tool unless otherwise defined in this Privacy Policy.\n" +
                "\n" +
                "Information Collection and Use\n" +
                "\n" +
                "For a better experience, while using our Service, we may require you to provide us with certain personally identifiable information, including but not limited to Name, Email address, Answers to ROTH questions. The information that we request will be retained by us and used as described in this privacy policy.\n" +
                "\n" +
                "The app does use third party services that may collect information used to identify you.\n" +
                "\n" +
                "Link to privacy policy of third party service providers used by the app\n" +
                "\n" +
                "    Google Play Services\n" +
                "\n" +
                "Log Data\n" +
                "\n" +
                "We want to inform you that whenever you use our Service, in a case of an error in the app we collect data and information (through third party products) on your phone called Log Data. This Log Data may include information such as your device Internet Protocol (“IP”) address, device name, operating system version, the configuration of the app when utilizing our Service, the time and date of your use of the Service, and other statistics.\n" +
                "\n" +
                "Cookies\n" +
                "\n" +
                "Cookies are files with a small amount of data that are commonly used as anonymous unique identifiers. These are sent to your browser from the websites that you visit and are stored on your device's internal memory.\n" +
                "\n" +
                "This Service does not use these “cookies” explicitly. However, the app may use third party code and libraries that use “cookies” to collect information and improve their services. You have the option to either accept or refuse these cookies and know when a cookie is being sent to your device. If you choose to refuse our cookies, you may not be able to use some portions of this Service.\n" +
                "\n" +
                "Service Providers\n" +
                "\n" +
                "We may employ third-party companies and individuals due to the following reasons:\n" +
                "\n" +
                "    To facilitate our Service;\n" +
                "    To provide the Service on our behalf;\n" +
                "    To perform Service-related services; or\n" +
                "    To assist us in analyzing how our Service is used.\n" +
                "\n" +
                "We want to inform users of this Service that these third parties have access to your Personal Information. The reason is to perform the tasks assigned to them on our behalf. However, they are obligated not to disclose or use the information for any other purpose.\n" +
                "\n" +
                "Security\n" +
                "\n" +
                "We value your trust in providing us your Personal Information, thus we are striving to use commercially acceptable means of protecting it. But remember that no method of transmission over the internet, or method of electronic storage is 100% secure and reliable, and we cannot guarantee its absolute security.\n" +
                "\n" +
                "Links to Other Sites\n" +
                "\n" +
                "This Service may contain links to other sites. If you click on a third-party link, you will be directed to that site. Note that these external sites are not operated by us. Therefore, we strongly advise you to review the Privacy Policy of these websites. We have no control over and assume no responsibility for the content, privacy policies, or practices of any third-party sites or services.\n" +
                "\n" +
                "Children’s Privacy\n" +
                "\n" +
                "These Services do not address anyone under the age of 13. We do not knowingly collect personally identifiable information from children under 13. In the case we discover that a child under 13 has provided us with personal information, we immediately delete this from our servers. If you are a parent or guardian and you are aware that your child has provided us with personal information, please contact us so that we will be able to do necessary actions.\n" +
                "\n" +
                "Changes to This Privacy Policy\n" +
                "\n" +
                "We may update our Privacy Policy from time to time. Thus, you are advised to review this page periodically for any changes. We will notify you of any changes by posting the new Privacy Policy on this page. These changes are effective immediately after they are posted on this page.\n" +
                "\n" +
                "Contact Us\n" +
                "\n" +
                "If you have any questions or suggestions about our Privacy Policy, do not hesitate to contact us.\n" +
                "\n" +
                "This privacy policy page was created at privacypolicytemplate.net and modified/generated by App Privacy Policy Generator");

        // add a button
        builder.setPositiveButton("OK", null);

        // create and show the alert dialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail_check);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        final SharedPreferences sharedPref = getSharedPreferences("ideaEval", Context.MODE_PRIVATE);

//        final CheckBox cbox = (CheckBox)findViewById(R.id.checkBox);
//        cbox.setClickable(true);
//        cbox.setMovementMethod(LinkMovementMethod.getInstance());
//        String text = "Agree to <a href='http://www.businessmetamorphosis.com/roth'>Privacy Policy</a>";
////        cbox.setText(Html.fromHtml(text, Html.FROM_HTML_MODE_COMPACT));
//        cbox.setText(Html.fromHtml(text));
//        cbox.setMovementMethod(LinkMovementMethod.getInstance());


        name = (EditText)findViewById(R.id.name);
        email = (EditText)findViewById(R.id.email);
        code = (EditText)findViewById(R.id.promo);


        button = findViewById(R.id.button);
        btn = findViewById(R.id.button3);
//        button.setEnabled(false);
//
//        String sname = name.getText().toString();
//        if (sname.matches("")) {
//            n1 = false;
//        }
//        else {
//            n1 = true;
//        }
//
//        String semail = email.getText().toString();
//        if (semail.matches("")) {
//            e1 = false;
//        }
//        else {
//            e1 = true;
//        }
//
//        if(n1 && e1)
//            button.setEnabled(true);

//        cbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if (cbox.isChecked())
//                    button.setEnabled(true);
//                else
//                    button.setEnabled(false);
//            }
//        }
//        );

        // Create code to require name and email to not be blank before submit
        // Somehow make promo default to a number so it isn't blank as well.



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlert(v);
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString("name", name.getText().toString());
                editor.putString("email", email.getText().toString());
                //create auto digits for code so this doesn't send "" as a number
                int c1 = 7;
                if (code.getText().toString().trim().equals(""))
                    c1 = 0;
                else
                    c1 = Integer.parseInt(code.getText().toString());

                  //  c1 = 007;
                editor.putInt("code", c1);
                editor.apply();
                startActivity(new Intent(MailCheck.this, SendMail.class));
            }
        });




    }
}
