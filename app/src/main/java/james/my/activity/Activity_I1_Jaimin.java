package james.my.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_I1_Jaimin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__i1__jaimin);

        Toast.makeText(this, "Assignment Level Intermidiate I1 Task", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Activity_I1_Jaimin.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },5000);

    }
}