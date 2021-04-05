package james.my.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_A1_Jaimin extends AppCompatActivity {

    EditText username,email,password;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__a1__jaimin);

        username = findViewById(R.id.username);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = username.getText().toString();
                String mail = email.getText().toString();
                String pass = password.getText().toString();

                Intent intent = new Intent(Activity_A1_Jaimin.this,Activity_A1_PersonDetails.class);
                intent.putExtra("personname",name);
                intent.putExtra("personemail",mail);
                intent.putExtra("personpassword",pass);
                startActivity(intent);
            }
        });

    }
}