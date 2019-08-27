package com.example.eventor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UsersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);
    }

    public void GoToLogin(View view) {
        startActivity(new Intent(UsersActivity.this,LoginActivity.class));
    }

    public void GoToEventsCategories(View view) {
        startActivity(new Intent(UsersActivity.this,EventsCategoriesActivity.class));
    }
}
