package com.example.ashri.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    int y = 0;
   // EditText pw;
  //  EditText usr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button b3 = (Button) findViewById(R.id.button3);

        final EditText pw = (EditText) findViewById(R.id.editText6);
        final EditText usr = (EditText) findViewById(R.id.editText5);

        b3.setOnClickListener(new View.OnClickListener() {

            String actualUsr = "username";
            String actualPw = "password";

            @Override
            public void onClick(View v) {
                y += 1;

                if (y % 5 == 0) {
                    //tf.setText("You can't even Hack :P");
                    Toast.makeText(Main3Activity.this, "User Name or Password Invalid!!!", Toast.LENGTH_SHORT).show();
                }

                if (pw.getText().toString().equals(actualPw)&&usr.getText().toString().equals(actualUsr)) {
                    Toast.makeText(Main3Activity.this, "Welcome " + usr.getText(), Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Main3Activity.this,Main2Activity.class));
                } else {
                    Toast.makeText(Main3Activity.this, "Login Failed " + usr.getText(), Toast.LENGTH_SHORT).show();
                    pw.setText("");
                }
            }

        });

    }
}
