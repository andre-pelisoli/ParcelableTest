package br.com.pelisoli.librarytest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class LibraryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Person person = (Person) getIntent().getExtras().get("personExtra");

        if (person != null) {
            Log.d("LibraryTest", "Name - " + person.getName());
            Log.d("LibraryTest", "Age - " + person.getAge());

            if(person.getAddress() != null){
                Log.d("LibraryTest", "Street - " + person.getAddress().getStreet());
                Log.d("LibraryTest", "Number - " + person.getAddress().getNumber());
            }
        }

    }
}
