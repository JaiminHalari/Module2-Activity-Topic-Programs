package james.my.activity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_A1_PersonDetails extends AppCompatActivity {

    TextView username_detail,email_detail,password_detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__a1__person_details);

        username_detail = findViewById(R.id.username_detail);
        email_detail = findViewById(R.id.email_detail);
        password_detail = findViewById(R.id.password_detail);

        String personname = getIntent().getStringExtra("personname");
        String personemail = getIntent().getStringExtra("personemail");
        String personpassword = getIntent().getStringExtra("personpassword");

        
        username_detail.setText(personname);
        email_detail.setText(personemail);
        password_detail.setText(personpassword);

    }
}