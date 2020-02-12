package com.raja.mycontactapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ContactDaoImpl contacts = new ContactDaoImpl(getApplicationContext());
        contacts.addContact(new Contact("raja","9897856123"));
    }
}
