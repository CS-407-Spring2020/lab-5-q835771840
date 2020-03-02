package c.sakshi.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public EditText uText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String key = "username";
        SharedPreferences sp = getSharedPreferences("c.sakshi.lab5", Context.MODE_PRIVATE);
        if (!sp.getString(key, "").equals("")) {
            Log.i("he","wocaoasdfasfa");
            Intent intent = new Intent(this, Main2Activity.class);
            startActivity(intent);
        } else {
            setContentView(R.layout.activity_main);
        }
    }

    public void loginListener(View view) {
        uText = (EditText) findViewById(R.id.usernameText);
        String us = uText.getText().toString();
        SharedPreferences sp = getSharedPreferences("c.sakshi.lab5", Context.MODE_PRIVATE);
        sp.edit().putString("username", us).apply();
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
