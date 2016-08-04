package br.com.pelisoli.parcelable_test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import br.com.pelisoli.librarytest.Address;
import br.com.pelisoli.librarytest.Person;
import br.com.pelisoli.librarytest.LibraryActivity;

public class MainActivity extends AppCompatActivity {
    Button mStartActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStartActivityButton = (Button) findViewById(R.id.btnCallActivity);
        mStartActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Person person = new Person();
                Address address = new Address("Rua oito", 12);

                person.setName("André");
                person.setAge(28);
                person.setAddress(address);

                Intent intent = new Intent(getApplicationContext(), LibraryActivity.class);
                intent.putExtra("personExtra", person);
                startActivity(intent);
            }
        });
    }
}
