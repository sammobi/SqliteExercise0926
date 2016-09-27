package com.simpalm.sqliteexercise0926;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button mAllUserBtnm, mAddUserBtn, mModifyUserBtn, mDeleteUserBtn, mAddUserContactBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAllUserBtnm = (Button) findViewById(R.id.all_user_btn);
        mAddUserBtn = (Button) findViewById(R.id.add_user_btn);
        mModifyUserBtn = (Button) findViewById(R.id.modify_user_btn);
        mDeleteUserBtn = (Button) findViewById(R.id.delete_user_btn);
        mAddUserContactBtn = (Button) findViewById(R.id.add_user_contact_btn);
    }

    // create on click listeners
    @Override
    public void onClick(View v) {
        switch (v.getId() /*to get clicked view id**/) {
            case R.id.all_user_btn:

                Intent intent = new Intent(MainActivity.this, AllUserActivity.class);
                startActivity(intent);
                break;
            case R.id.add_user_btn:
                Intent intent1 = new Intent(MainActivity.this, AddUserActivity.class);
                startActivity(intent1);
                break;
            case R.id.modify_user_btn:
                Intent intent2 = new Intent(MainActivity.this, ModifyUserActivity.class);
                startActivity(intent2);
                break;
            case R.id.delete_user_btn:
                Intent intent3 = new Intent(MainActivity.this, DeleteUserActivity.class);
                startActivity(intent3);
                break;
            case R.id.add_user_contact_btn:
                Intent intent4 = new Intent(MainActivity.this, AddUserFromContactActivity.class);
                startActivity(intent4);
                break;
        }
    }
}
