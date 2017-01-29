package com.example.ashri.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.widget.Toast;
import android.*;

public class MainActivity extends AppCompatActivity {
    int y = 0;
    int x = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button) findViewById(R.id.button);
        Button b2 = (Button) findViewById(R.id.button2);
        final TextView tf = (TextView) findViewById(R.id.textView);

        final EditText pw = (EditText) findViewById(R.id.editText2);
        final EditText usr = (EditText) findViewById(R.id.editText);

        b1.setOnClickListener(new View.OnClickListener() {

            String actualUsr = "username";
            String actualPw = "password";

            @Override
            public void onClick(View v) {
                x += 1;

                if (x % 5 == 0) {
                    //tf.setText("You can't even Hack :P");
                    Toast.makeText(MainActivity.this, "User Name or Password Invalid!!!", Toast.LENGTH_SHORT).show();
                }

                if (pw.getText().toString().equals(actualPw)&&usr.getText().toString().equals(actualUsr)) {
                    Toast.makeText(MainActivity.this, "Welcome " + usr.getText(), Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this,Main2Activity.class));
                } else {
                    Toast.makeText(MainActivity.this, "Login Failed " + usr.getText(), Toast.LENGTH_SHORT).show();
                    pw.setText("");
                }
            }

        });

        b2.setOnClickListener(new View.OnClickListener() {

            String actualUsr = "username";
            String actualPw = "password";

            @Override
            public void onClick(View v) {
              //  y += 1;
                startActivity(new Intent(MainActivity.this,Main3Activity.class));
               // if (y % 5 == 0) {
                    //tf.setText("You can't even Hack :P");
              //      Toast.makeText(MainActivity.this, "User Name or Password Invalid!!!", Toast.LENGTH_SHORT).show();
              //  }

              //  if (pw.getText().toString().equals(actualPw)) {
              //      Toast.makeText(MainActivity.this, "Welcome " + usr.getText(), Toast.LENGTH_SHORT).show();
                //    startActivity(new Intent(MainActivity.this,Main3Activity.class));
               // } else {
                //    Toast.makeText(MainActivity.this, "Login Failed " + usr.getText(), Toast.LENGTH_SHORT).show();
                //    pw.setText("");
                }


        });




        // rb1.setOnClickListener(new View.OnClickListener(){

        //  public void onClick(View v){
        //   x += 1;

        //if(x%3==0)
        //tf.setText("You can't find the password :P!");
        //  }

        //});

        tf.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                tf.setText("BY  Ash && RAVI");
            }

        });


        //rb2.setOnClickListener(new View.OnClickListener(){

        // public void onClick(View v){
        //     x += 1;
//
        //     if(x%3==0)
        //          tf.setText("Stop trying hoss!");

        //      Toast.makeText(MainActivity.this, "I said don't TAP -_-", Toast.LENGTH_SHORT).show();
        ///  }

        // });


    }






}

