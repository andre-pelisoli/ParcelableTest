package br.com.pelisoli.parcelable_test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import br.com.pelisoli.librarytest.Car;
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
                Car car = new Car(getApplicationContext());
                car.setWheels(4);

                Intent intent = new Intent(getApplicationContext(), LibraryActivity.class);
                intent.putExtra("parcelable", car);
                startActivity(intent);
            }
        });
    }
}
