package com.android.haule.eventbusexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import org.greenrobot.eventbus.EventBus;

public class MainActivity extends AppCompatActivity {
    private Button btnClickMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnClickMe = findViewById(R.id.btn_click_me);
        btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EventBus.getDefault().postSticky(new UserEvent(new User("Hau", "334")));
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });
    }
}
