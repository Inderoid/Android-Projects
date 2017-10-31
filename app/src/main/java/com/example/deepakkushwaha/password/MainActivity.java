package com.example.deepakkushwaha.password;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText pass_word;
    private Button button_sm;
    public EditText user_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListnerOnButton();
    }
    public void addListnerOnButton(){
        pass_word=(EditText)findViewById(R.id.editText2);
        button_sm=(Button)findViewById(R.id.button2);
        user_name=(EditText)findViewById(R.id.editText);
        button_sm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, pass_word.getText(), Toast.LENGTH_SHORT).show();

                    }

                }
        );


}
}