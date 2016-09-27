package com.simpalm.sqliteexercise0926;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends Activity {

    EditText mUsernameEt, mPasswordEt;
    Button mLoginBtn, mSettingsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mUsernameEt = (EditText) findViewById(R.id.username_login_et);
        mPasswordEt = (EditText) findViewById(R.id.password_login_et);
        mLoginBtn = (Button) findViewById(R.id.login_btn);
        mSettingsBtn = (Button) findViewById(R.id.settings_btn);
        mUsernameEt.requestFocus();
        mLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mUsernameEt.getText().toString().length() == 0) {
                    mUsernameEt.setError("Username cannot be empty");

                } else if (mPasswordEt.getText().toString().length() == 0) {
                    mPasswordEt.setError("Password cannot be empty");
                }
            }
        });
        mSettingsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
