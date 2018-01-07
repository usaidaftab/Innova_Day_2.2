package com.example.death.innova_day_22;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {


    Button sendMessage;
    EditText number,message;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendMessage=(Button)findViewById(R.id.button);
        number=(EditText)findViewById(R.id.editText);
        message=(EditText)findViewById(R.id.editText2);

        sendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String numberstr,messagestr;
                numberstr=number.getText().toString();
                if (numberstr.length() != 11) {

                    Toast.makeText(MainActivity.this, "Invalid Number", Toast.LENGTH_SHORT).show();
                }
                else {
                    messagestr = message.getText().toString();
                    SmsManager sender = SmsManager.getDefault();
                    sender.sendTextMessage(numberstr, null, messagestr, null, null);
                }


            }
        });


    }
}
