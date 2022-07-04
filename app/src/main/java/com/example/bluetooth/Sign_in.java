package com.example.bluetooth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Sign_in extends AppCompatActivity {
    TextView user_id;
    TextView pass_id;
    Button lgnbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        lgnbtn = findViewById(R.id.lgnbtn);
        user_id = findViewById(R.id.user_id);
        pass_id = findViewById(R.id.pass_id);
        lgnbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(user_id.getText().toString());
                System.out.println(pass_id.getText().toString());
                if(user_id.getText().toString().equals("Romaisa")&& pass_id.getText().toString().equals("trikill7") || user_id.getText().toString().equals("Nisha")&& pass_id.getText().toString().equals("trikill7") || user_id.getText().toString().equals("Laiba")  && pass_id.getText().toString().equals("trikill7")) {
                    Intent i = new Intent(Sign_in.this, SplashScreen.class);
                    i.putExtra("username",user_id.getText());
                    startActivity(i);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Invalid Username or Password",Toast.LENGTH_SHORT).show();
                    user_id.setText("");
                    pass_id.setText("");
                }

            }
        });
    }
}